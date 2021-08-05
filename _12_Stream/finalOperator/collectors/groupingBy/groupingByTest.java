package _12_Stream.finalOperator.collectors.groupingBy;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	
	Student(String name, boolean isMale, int hak, int ban, int score){
		this.name = name ;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}
	
	String getName() { return name; }
	boolean isMale() { return isMale; }
	int getHak() { return hak; }
	int getBan() { return ban; }
	int getScore() { return score; }
	public String toString() { 
		return String.format("[ %s, %s, %d학년, %d반 , %3d점, ]", name, isMale ? "남":"여",hak, ban, score);
	}
	enum Level { HIGH, MID, LOW }
}
public class groupingByTest {
	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("나자바", true, 1, 1, 300),
				new Student("김지미", false, 1, 1, 250),
				new Student("김자바", true, 1, 1, 200),
				new Student("이지미", false, 1, 2, 150),
				new Student("남자바", true, 1, 2, 100),
				new Student("안지미", false, 1, 2, 50),
				new Student("황지미", false, 1, 3, 100),
				new Student("강지미", false, 1, 3, 150),
				new Student("이자바", true, 1, 3, 200),
				
				new Student("나자바", true, 2, 1, 300),
				new Student("김지미", false, 2, 1, 250),
				new Student("김자바", true, 2, 1, 200),
				new Student("이지미", false, 2, 2, 150),
				new Student("남자바", true, 2, 2, 100),
				new Student("안지미", false, 2, 2, 50),
				new Student("황지미", false, 2, 3, 100),
				new Student("강지미", false, 2, 3, 150),
				new Student("이자바", true, 2, 3, 200)
		};
		
		System.out.printf("1. 단순 그룹화(반별로 그룹화)%n");
		Map<Integer, List<Student>> stuByBan = Stream.of(stuArr).collect(Collectors.groupingBy(Student::getBan));
//		List<Student> firstban = stuByBan.get(1);
//		for(Student s : firstban) {
//			System.out.println(s);
//		}
		
		for(List<Student> ban : stuByBan.values()) {
//			System.out.println(ban);
			for(Student s: ban) {
				System.out.println(s);
			}
		}

		System.out.printf("%n2. 단순 그룹화 (성적별로 그룹화)%n");
		Map<Student.Level, List<Student>> stuByLevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s->{
					if(s.getScore() >= 200)			return Student.Level.HIGH;
					else if(s.getScore() >= 100)	return Student.Level.MID;
					else 							return Student.Level.LOW;}
		));
		//학생 래벨로 TreeSet 생성
		TreeSet<Student.Level> keySet = new TreeSet<Student.Level> (stuByLevel.keySet());
		
		//TreeSet(KeySet)에서 키를 받아 Map(StuByLevel에서 해당 키로 List를 꺼내온다.
		for(Student.Level key : keySet) {
			System.out.println("[" + key + "]");
			for(Student s : stuByLevel.get(key)) {
				System.out.println(s);
			}
			System.out.println();
		}
		
		System.out.println("%n3. 단순그룹화 + 통계(성적별 학생수) %n");
		Map<Student.Level, Long> stuCntByLevel = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s-> {
					if(s.getScore() >= 200) 		return Student.Level.HIGH;
					else if(s.getScore() >= 100) 	return Student.Level.MID;
					else 							return Student.Level.LOW;
				}, Collectors.counting()
		));
		for(List<Student> level : stuByLevel.values()) {
			System.out.println(level);
			for(Student s: level) {
				System.out.println(s);
			}
		}
		System.out.printf("%n4. 다중 그룹화(학년별, 반별)%n");
//		컬렉션 Map으로 Student의 학년을 Key로 받아  Value로 Map을 저장하고, 그 Map은 Student의 반을 key로 받아 value로 Student 타입 리스트를 저장한다.
		Map<Integer, Map<Integer, List<Student>>> stuByHakAndBan = Stream.of(stuArr)
				.collect(Collectors.groupingBy(Student::getHak, 
						Collectors.groupingBy(Student::getBan)
		));
		
//		컬렉션 Map stuByHakAndBan을 학년을 Key로 받아 List에 저장 반복.
		for(Map<Integer, List<Student>> hak : stuByHakAndBan.values()) {
//			System.out.println(hak);
//			컬렉션 Map hak을  List ban별로 받아서 리스트화한다.
			for(List<Student> ban : hak.values()) {
//				System.out.println(ban);
//				컬렉션 List ban은 Student s를 참조변수로 해서 담아서 하나씩 출력한다.
				for(Student s : ban) {
					System.out.println(s);
				} //End for
			}//End for
		}//End for
		
		System.out.printf("%n5. 다중그룹화 + 통계(학년별, 반별  1등%n");
		Map<Integer, Map<Integer, Student>> topStuByHakAndBan = Stream.of(stuArr) //학생 배열을 받아 스트림을 생성한다.
				.collect(Collectors.groupingBy(Student::getHak,    //생성한 스트림에 학년을 Key 구분하고  value로 Map을 받는다.
						Collectors.groupingBy(Student::getBan,     //받은 value에 Map에 key 반을 구분하고 Student를 객체를 담는다. 
								/*
								 * // public static <T,A,R,RR>   		= T, 요소 입력타입, A 누적타입, R 결과타입, RR 결과수집
								 * Collector<T,A,RR>   					= Collector의 T요소입력, Collector A누적타입, RR결과수집
								 * collectingAndThen(
								 * Collector<T,A,R> downstream,   		= Collector <T, A, R>
								 * Function<R,RR> finisher)           	= 출력방법.
								 */						
						Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(Student::getScore)),
								Optional::get)
					)
		));
		for(Map<Integer, Student> ban : topStuByHakAndBan.values()) {
			for(Student s : ban.values()) {
				System.out.println(s);
			}
		}
		
		
				
		System.out.printf("%n6. 다중그룹화 + 통계(학년별, 반별 성적 그룹) %n");
		Map<String, Set<Student.Level>> stuByScoreGroup = Stream.of(stuArr)
				.collect(Collectors.groupingBy(s-> s.getHak() + "-" + s.getBan(), 
						Collectors.mapping(s-> {
							if(s.getScore() >= 200) return Student.Level.HIGH;
							else if(s.getScore() > 100) return Student.Level.MID;
							else return Student.Level.LOW;
							}, Collectors.toSet())
		));
		
		
		
		Set<String> KeySet2 = stuByScoreGroup.keySet();
		System.out.println(KeySet2);
		for(String key : KeySet2) {
			System.out.println("[" + key +"]" + stuByScoreGroup.get(key));
		}
		
	}//End main

}//End class
