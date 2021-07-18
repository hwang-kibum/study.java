package javaStudy._07_API;

import java.util.Arrays;

class Student implements Cloneable {
	long RRN;   //Resident registration number (주민번호)
	String name;
	int classNum;
	int year;
	int grandes;
	
	Student(){}
	Student(long RRN){
		this.RRN=RRN;
	}
	Student(long RRN, String name,  int year, int classNum, int grandes){
		this.RRN = RRN;
		this.name = name;
		this.classNum = classNum;
		this.year = year;
		this.grandes = grandes;
	}
	
	@Override
	public boolean equals (Object obj) {
		if(obj != null && obj instanceof Student) {  //obj(객체)가 Student의 인스턴스인가? true : false
			return RRN == ((Student)obj).RRN;
		} else {
			return false;
		}
	}
	//Cloneable interface를 구현함.
	@Override
	public Student clone() {
		Object obj = null;
		try {
			obj = super.clone();   //조상인 Object의 clone()을 호출함. clone()은 반드시 예외처리를 해주어야한다.
		} catch (CloneNotSupportedException e) { } 
		return (Student)obj;
	}

}

public class ObjectClassMethod_01 {

	public static void main(String[] args) {
		
		Object obj =new Object();
		
		//Object의 equals() : 인스턴스의 주소를 기반으로 비교한다.
		String hi= "안녕하세요";
		String hello = "안녕하세요";
		String hey = new String("안녕하세요");
		String hi2 = "hi";
		
		System.out.println(hi.equals(hi));  //true
		System.out.println(hi.equals(hello));  //true
		System.out.println(hi.equals(hey));  //true
		System.out.println(hi.equals(hi2));  //false
		System.out.println();

		//@Override된 equals() : 객체의 변수중 고유한 값을 통해 비교한다.
		Student st1 = new Student(12, "kim", 1, 10, 400);
		Student st2 = new Student(21, "hwang", 2, 20, 390);
		
		System.out.println("st1.equals(st1) : " + st1.equals(st1));  //true
		System.out.println("st1.equals(st2) : " + st1.equals(st2));  //false
		System.out.println();

		//hashCode() : 해당 내용을 기반으로 판단.
		System.out.println("안녕하세요 hashCode() : " + hi.hashCode());  //803356551
		System.out.println("안녕하세요 hashCode() : " + hello.hashCode());  //803356551
		System.out.println("안녕하세요 hashCode() : " + hey.hashCode());  //803356551
		System.out.println("hi hashCode() : " + hi2.hashCode());  //3329
		System.out.println();

		//System.identityHashCode(obj) : 객체의 주소를 기반으로 판단.
		System.out.println("안녕하세요 System.identityHashCode(hi) : "+ System.identityHashCode(hi));   //2080166188
		System.out.println("안녕하세요 System.identityHashCode(hello) : "+ System.identityHashCode(hello));  //2080166188 
		System.out.println("안녕하세요 System.identityHashCode(hey) : "+ System.identityHashCode(hey));  //681842940 --new String();
		System.out.println("hi System.identityHashCode(hi2) : "+System.identityHashCode(hi2));   // 1392838282
		System.out.println();

		//toString()은 객체의 문자열만을 출력한다. 
		System.out.println("hi.toString() : "+hi.toString());  //안녕하세요
		System.out.println("st1.toString() : "+st1.toString());  //javaStudy._07_API.Student@1f32e575  -- 객체를 선택시 주소출력.
		System.out.println(st1.name.toString()); //kim   --객체의 멤버변수를 사용시 값을 출력한다.
		System.out.println();

		System.out.println("st1.getClass().getName() : "+st1.getClass().getName());   //st1.getClass().getName() : javaStudy._07_API.Student
		System.out.println();
		
		System.out.println(hi.getClass());  //class java.lang.String
		System.out.println(st1.getClass());  //class javaStudy._07_API.Student
		System.out.println();

		// (obj instanceof Class)
		System.out.println(hi instanceof String);   // hi는 String class의 객체인가? true
		System.out.println();
		if(hi instanceof Object) { //조상 클래스로 비교시 true 이다. 
			System.out.println("hi는 Object 객체가 맞습니다.");
		} else if (hi instanceof String) {
			System.out.println("hi는 String 객체가 맞습니다.");
		} else {
			System.out.println("hi는 어떤 객체도 아닙니다.");
		}

		//clone() 
		Student cpst1 = st1.clone();
		System.out.println(st1.toString() +"\n" + cpst1.toString());
		System.out.println(st1.name);   //kim
		System.out.println(cpst1.name);  //kim
		
		
		
		int[] arr = {1,2,3,4,5};
		int[] cparr = arr.clone();
		cparr[0] = 7;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(cparr));
		

	}

}
