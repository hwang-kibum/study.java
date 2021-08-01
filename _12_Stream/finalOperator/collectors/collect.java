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
		//Student �迭��  ��ü �߰�
		Student[] stuArr= {
				new Student("���ڹ�", 3, 300),
				new Student("���ڹ�", 1, 200), 
				new Student("���ڹ�", 2, 100), 
				new Student("���ڹ�", 2, 150), 
				new Student("���ڹ�", 1, 200),
				new Student("���ڹ�", 3, 290), 
				new Student("���ڹ�", 3, 180) };
		
		//�л� �̸��� �̾Ƽ� List<Sting>�� ����.
		List<String> names = Stream.of(stuArr).map(Student::getName)  
											  .collect(Collectors.toList());
		System.out.println(names + "\n");
		
		//��Ʈ�� �� �迭�� ��ȯ.
		Student[] stuArr2 = Stream.of(stuArr).toArray(Student[]::new);
		for (Student s : stuArr2) {
			System.out.println(s);
		}
		
		//��Ʈ���� Map<String, Student>�� ��ȯ �л� �̸��� Key 
		Map<String, Student> stuMap = Stream.of(stuArr).collect(Collectors.toMap(s->s.getName(), p->p));
		for(String name : stuMap.keySet()) {
			System.out.println(name + "-" + stuMap.get(name));
		}
		
		long count = Stream.of(stuArr).collect(Collectors.counting());
		
		
		
		
	}//End main

} //End class
