package _12_Stream.middeleOperator;

import java.util.Comparator;
import java.util.stream.Stream;

public class Student01 implements Comparable<Student01>{
	String name;
	int ban;
	int totalScore;
	
	Student01(){}
	
	Student01(String name, int ban, int totalScore){
		this.name = name ;
		this.ban = ban;
		this.totalScore=totalScore;
	}
	
	public String toString() {
		return String.format("[%s, %d, %d]", name, ban, totalScore).toString();
	}
	String getName() { return name; }
	int getBan() { return ban; }
	int getToScore() { return totalScore; }
	
	public int compareTo(Student01 s) {
		return s.totalScore - this.totalScore;
	}
	
	public static void main(String[] args) {
		Student01 s = new Student01();
		Stream<Student01> stuStrm = Stream.of( new Student01("���ڹ�", 3, 300),
											new Student01("���ڹ�", 1, 200), 
											new Student01("���ڹ�", 2, 100), 
											new Student01("���ڹ�", 2, 150), 
											new Student01("���ڹ�", 1, 200),
											new Student01("���ڹ�", 3, 290), 
											new Student01("���ڹ�", 3, 180));
		Stream<Integer> studentScoreStrm1 = stuStrm.map(s-> i.getToScore());
		studentScoreStrm1.forEach(System.out::println);
		
		Stream<Integer> studentScoreStrm2 = stuStrm.map(Student01::getToScore);
		
	}

}
