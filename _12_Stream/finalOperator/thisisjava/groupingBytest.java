package _12_Stream.finalOperator.thisisjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student {
	String name;
	Sex isMale;
	int hak;
	int ban;
	int score;
	
	Student(String name, Sex isMale, int hak, int ban, int score){
		this.name = name ;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}
	
	String getName() { return name; }
	Sex getIsMale() { return isMale; }
	int getHak() { return hak; }
	int getBan() { return ban; }
	int getScore() { return score; }
	public String toString() { 
		return String.format("[ %s, %s, %d학년, %d반 , %3d점, ]", name, isMale ,hak, ban, score);
	}
	enum Level { HIGH, MID, LOW }
	enum Sex { Male,Female }
}

class MaleStudent{
	private List<Student> list;
	
	public MaleStudent() {
		list = new ArrayList<Student>();
		System.out.println("[" + Thread.currentThread().getName() + "] MaleStudent() "); 
	}
	
	public void accumulate(Student student) {
		list.add(student);
		System.out.println("[" + Thread.currentThread().getName() + "] accumulate() ");
	}
	
	public void combine(MaleStudent other) {
		list.addAll(other.getList());
		System.out.println("[" + Thread.currentThread().getName() + "] combine()");
	}
	
	public List<Student>getList() {
		return list;
	}
}
public class groupingBytest {
	public static void main(String[] args) {
		Student[] stuArr = {
				new Student("나자바", Student.Sex.Male, 1, 1, 300),
				new Student("김지미", Student.Sex.Female, 1, 1, 250),
				new Student("김자바", Student.Sex.Male, 1, 1, 200),
				new Student("이지미", Student.Sex.Female, 1, 2, 150),
				new Student("남자바", Student.Sex.Male, 1, 2, 100),
				new Student("안지미", Student.Sex.Female, 1, 2, 50),
				new Student("황지미", Student.Sex.Female, 1, 3, 100),
				new Student("강지미", Student.Sex.Female, 1, 3, 150),
				new Student("이자바", Student.Sex.Male, 1, 3, 200),
				
				new Student("나자바", Student.Sex.Male, 2, 1, 300),
				new Student("김지미", Student.Sex.Female, 2, 1, 250),
				new Student("김자바", Student.Sex.Male, 2, 1, 200),
				new Student("이지미", Student.Sex.Female, 2, 2, 150),
				new Student("남자바", Student.Sex.Male, 2, 2, 100),
				new Student("안지미", Student.Sex.Female, 2, 2, 50),
				new Student("황지미", Student.Sex.Female, 2, 3, 100),
				new Student("강지미", Student.Sex.Female, 2, 3, 150),
				new Student("이자바", Student.Sex.Male, 2, 3, 200)
		};
		List<Student> stuList = Arrays.asList(stuArr);
		List<Student> stuList2 = Arrays.asList(stuArr);
		Stream<Student> totalStream = Stream.of(stuArr);  
		Stream<Student> totalStream2 = totalStream.parallel();
		System.out.println(totalStream2);
//		totalStream.forEach(System.out::println);
		Function<Student, Student.Sex> classfier = Student::getIsMale;  //학생을 객체를 입력받아 학생성별을 반환
		
		ToDoubleFunction<Student> mapper = Student::getScore;  //학생을 입력받아 학생 점수를 Double타입의 반환 
		
		Collector<Student, ? , Double> collector1 = Collectors.averagingDouble(mapper);   //학생을 평균을 산출하는 Collector를 반환.
		
		Collector<Student, ?, Map<Student.Sex, Double>> collector2 = Collectors.groupingBy(classfier, collector1);  //학생을 입력받아 Map에 학생성별을 키로 평균을 double타입으로 인 Collector를 반환
		
		Map<Student.Sex, Double> mapBySex = totalStream2.collect(collector2);  // Stream의 collect()메소드를 student.Sex별 구릅핑해서 Map을 반환
		System.out.println(mapBySex);
//		Map<Student.Sex, Double> mapBySex2 = totalStream2.collect(collector2);  // Stream의 collect()메소드를 student.Sex별 구릅핑해서 Map을 반환
//		System.out.println(mapBySex);
		
		
//		
		MaleStudent malStudent1 = stuList.stream().filter(s->s.getIsMale() == Student.Sex.Male)
						.collect(
								()->new MaleStudent(),
								(r, t) -> r.accumulate(t),
								(r1, r2)-> r1.combine(r2)
								);
		
		malStudent1.getList().stream().forEach(System.out::println);
		MaleStudent malStudent2 = stuList2.parallelStream().filter(s->s.getIsMale() == Student.Sex.Male)
				.collect(
						MaleStudent::new,
						MaleStudent::accumulate,
						MaleStudent::combine
						);
		malStudent2.getList().stream().forEach(System.out::println);
		
	}

}
