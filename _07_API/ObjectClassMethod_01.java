package javaStudy._07_API;

import java.util.Arrays;

class Student implements Cloneable {
	long RRN;   //Resident registration number (�ֹι�ȣ)
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
		if(obj != null && obj instanceof Student) {  //obj(��ü)�� Student�� �ν��Ͻ��ΰ�? true : false
			return RRN == ((Student)obj).RRN;
		} else {
			return false;
		}
	}
	//Cloneable interface�� ������.
	@Override
	public Student clone() {
		Object obj = null;
		try {
			obj = super.clone();   //������ Object�� clone()�� ȣ����. clone()�� �ݵ�� ����ó���� ���־���Ѵ�.
		} catch (CloneNotSupportedException e) { } 
		return (Student)obj;
	}

}

public class ObjectClassMethod_01 {

	public static void main(String[] args) {
		
		Object obj =new Object();
		
		//Object�� equals() : �ν��Ͻ��� �ּҸ� ������� ���Ѵ�.
		String hi= "�ȳ��ϼ���";
		String hello = "�ȳ��ϼ���";
		String hey = new String("�ȳ��ϼ���");
		String hi2 = "hi";
		
		System.out.println(hi.equals(hi));  //true
		System.out.println(hi.equals(hello));  //true
		System.out.println(hi.equals(hey));  //true
		System.out.println(hi.equals(hi2));  //false
		System.out.println();

		//@Override�� equals() : ��ü�� ������ ������ ���� ���� ���Ѵ�.
		Student st1 = new Student(12, "kim", 1, 10, 400);
		Student st2 = new Student(21, "hwang", 2, 20, 390);
		
		System.out.println("st1.equals(st1) : " + st1.equals(st1));  //true
		System.out.println("st1.equals(st2) : " + st1.equals(st2));  //false
		System.out.println();

		//hashCode() : �ش� ������ ������� �Ǵ�.
		System.out.println("�ȳ��ϼ��� hashCode() : " + hi.hashCode());  //803356551
		System.out.println("�ȳ��ϼ��� hashCode() : " + hello.hashCode());  //803356551
		System.out.println("�ȳ��ϼ��� hashCode() : " + hey.hashCode());  //803356551
		System.out.println("hi hashCode() : " + hi2.hashCode());  //3329
		System.out.println();

		//System.identityHashCode(obj) : ��ü�� �ּҸ� ������� �Ǵ�.
		System.out.println("�ȳ��ϼ��� System.identityHashCode(hi) : "+ System.identityHashCode(hi));   //2080166188
		System.out.println("�ȳ��ϼ��� System.identityHashCode(hello) : "+ System.identityHashCode(hello));  //2080166188 
		System.out.println("�ȳ��ϼ��� System.identityHashCode(hey) : "+ System.identityHashCode(hey));  //681842940 --new String();
		System.out.println("hi System.identityHashCode(hi2) : "+System.identityHashCode(hi2));   // 1392838282
		System.out.println();

		//toString()�� ��ü�� ���ڿ����� ����Ѵ�. 
		System.out.println("hi.toString() : "+hi.toString());  //�ȳ��ϼ���
		System.out.println("st1.toString() : "+st1.toString());  //javaStudy._07_API.Student@1f32e575  -- ��ü�� ���ý� �ּ����.
		System.out.println(st1.name.toString()); //kim   --��ü�� ��������� ���� ���� ����Ѵ�.
		System.out.println();

		System.out.println("st1.getClass().getName() : "+st1.getClass().getName());   //st1.getClass().getName() : javaStudy._07_API.Student
		System.out.println();
		
		System.out.println(hi.getClass());  //class java.lang.String
		System.out.println(st1.getClass());  //class javaStudy._07_API.Student
		System.out.println();

		// (obj instanceof Class)
		System.out.println(hi instanceof String);   // hi�� String class�� ��ü�ΰ�? true
		System.out.println();
		if(hi instanceof Object) { //���� Ŭ������ �񱳽� true �̴�. 
			System.out.println("hi�� Object ��ü�� �½��ϴ�.");
		} else if (hi instanceof String) {
			System.out.println("hi�� String ��ü�� �½��ϴ�.");
		} else {
			System.out.println("hi�� � ��ü�� �ƴմϴ�.");
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
