package _12_Stream.finalOperator.collectors;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Student implements Comparable<Student> {
	String name;
	int ban;
	int totalScore;
	
	Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
	}
	
	String getName() { return name; }
	int getBan() { return ban; }
	int getTotalScore() { return totalScore; }
	
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}
}
public class collect {
	public static void main(String[] args) {
		//Student 배열에  객체 추가
		Student[] stuArr= {
				new Student("이자바", 3, 300),
				new Student("김자바", 1, 200), 
				new Student("안자바", 2, 100), 
				new Student("박자바", 2, 150), 
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290), 
				new Student("감자바", 3, 180) };
		
		//학생 이름만 뽑아서 List<Sting>에 저장.
		List<String> names = Stream.of(stuArr).map(Student::getName)  
											  .collect(Collectors.toList());
		System.out.println(names + "\n");
		
		//스트림 을 배열로 변환.
		Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);
		for (Student s : stuArr2) {
			System.out.println(s);
		}
		
		//스트림을 Map<String, Student>로 변환 학생 이름이 Key 
		Map<String, Student> stuMap = Stream.of(stuArr).collect(Collectors.toMap(s->s.getName(), p->p));
		for(String name : stuMap.keySet()) {
			System.out.println(name + "-" + stuMap.get(name));
		}
		
		long count = Stream.of(stuArr).collect(Collectors.counting());
		
		
		
		
	}//End main

} //End class
