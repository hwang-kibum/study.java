package javaStudy._09_Collection.Collection.list.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
class fruit {
	String name;
}
class apple extends fruit {
	
}
class grape extends fruit {
	
}
public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<ArrayList> linkList = new LinkedList<ArrayList>();
		ArrayList<String> strArrList = new ArrayList<String>();
		strArrList.add("김범수");
		strArrList.add("나얼");
		strArrList.add("이수");
		strArrList.add("박효신");
		linkList.add(strArrList);
		System.out.println(linkList);
		ArrayList<Integer> IntArrList = new ArrayList<Integer>();
		IntArrList.add(1);
		IntArrList.add(2);
		IntArrList.add(3);
		IntArrList.add(4);
		IntArrList.add(5);
		linkList.add(IntArrList);
		System.out.println(IntArrList);
		ArrayList<fruit> fruitArrList = new ArrayList<fruit>();
		fruitArrList.add(new apple());
		fruitArrList.add(new fruit());
		fruitArrList.add(new grape());
		fruitArrList.add(new apple());
		linkList.add(fruitArrList);
		System.out.println(fruitArrList);
		
		System.out.println(linkList);

		System.out.println(linkList.indexOf(strArrList));
		System.out.println(linkList.indexOf(IntArrList));
		System.out.println(linkList.indexOf(fruitArrList));
		System.out.println("김범수 index : "+strArrList.indexOf("김범수"));
		System.out.println("나얼 index : "+strArrList.indexOf("나얼"));
		System.out.println("이수 index : "+strArrList.indexOf("이수"));
		

		//마지막 인덱스에서 검색. 객체가 없으면 -1로 나온다.
		System.out.println(linkList.lastIndexOf(strArrList));
		System.out.println(linkList.lastIndexOf(IntArrList));
		System.out.println(linkList.lastIndexOf(fruitArrList));
		
		
		

		
		
	}

}
