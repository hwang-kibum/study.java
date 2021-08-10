package _09_Collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

class student extends ArrayList implements Comparable<student>{
	int num;
	String name;
	
	student(){}
	student(int num, String name){
		this.num = num;
		this.name = name;
	}
	
	@Override
	public int compareTo(student s) {
		return num - s.num;
	}
	
	@Override 
	public String toString() {
		return "��ȣ: " + num +"\n" + "�̸�: "+name;
	}
	
	@Override
	public int hashCode() {
		return (num+name).hashCode();
	}
}
public class newArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student st0 = new student();
		student st1 = new student(2,"pack");
		student st2 = new student(3,"back");
		student st3 = new student(4,"lee");
		student st4 = new student(4,"lee");
		st0.add(new student(3, "Testkim"));
		st0.add(new student(2, "TestKim"));
		st0.add(new student(4, "TestKim"));
		st0.add(new student(5, "TestKim"));
		st0.add(new student(5, "Test"));
		st0.add(new student(1, "TestKim"));
		
		
		Collections.sort(st0);
		System.out.println();
	
		
		for (Object obj : st0) {
			student s = (student)obj;
			System.out.println(s);
		}
		ArrayList al = new ArrayList();
		al.add(st0);
		al.add(st1);
		al.add(st2);
		al.add(st3);
		al.add(st4);
		
		Iterator it = al.iterator();

		int hash3 = st3.hashCode();
		int hash4 = st4.hashCode();
		
		System.out.println(hash3);
		System.out.println(hash4);
		

	}

}
