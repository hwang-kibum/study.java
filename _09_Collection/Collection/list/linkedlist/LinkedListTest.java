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
		strArrList.add("�����");
		strArrList.add("����");
		strArrList.add("�̼�");
		strArrList.add("��ȿ��");
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
		System.out.println("����� index : "+strArrList.indexOf("�����"));
		System.out.println("���� index : "+strArrList.indexOf("����"));
		System.out.println("�̼� index : "+strArrList.indexOf("�̼�"));
		

		//������ �ε������� �˻�. ��ü�� ������ -1�� ���´�.
		System.out.println(linkList.lastIndexOf(strArrList));
		System.out.println(linkList.lastIndexOf(IntArrList));
		System.out.println(linkList.lastIndexOf(fruitArrList));
		
		
		

		
		
	}

}
