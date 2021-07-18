package _10_Generic;

import java.util.ArrayList;
import java.util.List;

//is-a ~는 a다. : 상속관계
class fruit3<integer>{
	public integer sugar;
	
	fruit3(integer sugar){
		this.sugar = sugar;
	}
}
class applesTest extends fruit3 {
	int size1;
	applesTest(int sugar,int size1){
		super(sugar);
		this.size1=size1;
	}
	public String toString() {
		return "("+super.sugar+","+size1+")";
	}
}
class peache extends fruit3 {
	int size2;
	
	peache(int sugar, int size2){
		super(sugar);
		this.size2 = size2;
	}
	public String toString() {
		return "("+super.sugar+","+size2+")";
	}
}

//has-a(a를 가졌다.) : 포함관계 
class human {
	shopingbag sg = new shopingbag();
}
class shopingbag {
	List<fruit3> list = new ArrayList<fruit3>();
}
public class is_a_has_a_Test {
	public static void main(String[] args) {
		
		human kim = new human();
		kim.sg.list.add(new applesTest(3,1));
		kim.sg.list.add(new peache(6,2));
		System.out.println(kim);
		System.out.println(kim.sg);
		System.out.println(kim.sg.list);
		System.out.println(kim.sg.list.get(0).toString());
		
		
	}
}
