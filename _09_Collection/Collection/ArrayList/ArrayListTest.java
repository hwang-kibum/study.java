package javaStudy._09_Collection.Collection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {
	
	static void printOne(ArrayList list) {
		System.out.println(list);
	}
	
	static ArrayList ArrayListRemoveElement(ArrayList a) {
		for(int i=a.size()-1; 0<=i; i--) {
			a.remove(i);
		}
		return a;
	}
	
	public static void main(String[] args) {
		//ArrayList()
		ArrayList list0 = new ArrayList();
		list0.add(new String("�ϳ�"));
		list0.add(new String("�ο�"));
		list0.add(new String("����"));
		System.out.println("list0 : "+list0);
		
		/* 1. �߰�  */
		//list0�� ��� ��� list1�� �߰�.
		ArrayList list1 = new ArrayList();
		list1.addAll(list0);
		System.out.println("list1 : "+list1);

		list1.add("test");
		System.out.println("list1 : "+list1);
		
		
		/* 2. �˻�  */
		//contains ��ҹ��� ������.
		System.out.println("list1�� \"�ϳ�\"�� �ִ� : "+list1.contains("�ϳ�"));
		System.out.println("list1�� \"��\"�� �ִ� : "+list1.contains("��"));
		System.out.println("list1�� \"Test\"�� �ִ� : "+list1.contains("Test"));
		System.out.println("list1�� \"test\"�� �ִ� : "+list1.contains("test"));
		
		//containsAll() : A.containsAll(B)
		/* 1. B�� ��ҵ��� A�� ��� �����ϸ� true
		 * 2. A�� B��Һ��� ���Ƶ� �ȴ�.
		 */
		System.out.println("list1�� list0�� ��� �����̴� : "+list0.containsAll(list1));
		ArrayList list2 = new ArrayList();
		list2.addAll(list0);
		System.out.println(list2);
		System.out.println("list2�� list0�� ��� �����̴�. : "+list0.containsAll(list2));  //
		System.out.println("list0�� list1�� ��� �����̴�. : "+list1.containsAll(list0));  //
		
		/* 3. ����  
		 * (ArrayList�� �ε��� 0�� �ƴ� �� ������ ���� �����ؾ� ������ ���簡 �߻������ʾ� ���ҽ��� �ּ�ȭ �Ҽ��ִ�.�ȱ׷��� ���� ������ �ȵɼ����ִ�.)*/
		list2.clear();   //��ü ���� 
		System.out.println(list2);
		
		list2.addAll(list1);  //[�ϳ�, �ο�, ����, test]
		list2.removeAll(list2); //[]
		list2.addAll(list1);  //[�ϳ�, �ο�, ����, test]
		System.out.println(list2);
		list2.retainAll(list0);  //list0�� ���� list2�� ��� test�� �����Ѵ�.
		System.out.println(list0);
		System.out.println(list2);
		System.out.println(list1.equals(list2));  //false
		System.out.println(list1.equals(list1));  //true
		
		list1.addAll(list2);
		System.out.println(list1.equals(list2));  //false
		System.out.println(list1.isEmpty());  //false
		list1.removeAll(list1);  //[]
		System.out.println(list1.isEmpty());  //true
		System.out.println(list1.size());
		System.out.println(list2.size());	
		
		System.out.println(list0.get(1));   //�ο�
		System.out.println(list0.contains("�ο�"));  //������ true, ������ false
		
		System.out.println(list0.size());   //3
		list0.ensureCapacity(4);
		System.out.println(list0);
		System.out.println(list0.size());   //3
		
		list0.set(1, "��");
		System.out.println(list0);

//		list0.set(3, "�׿�");    set(int index, Object o) �� �̹� �ε����� �ִ� ���� ���氡��. ���� ���� �ε������� ������ add()�� �ؾ��Ѵ�.
		
		System.out.println(list0.iterator());
		Iterator it = list0.iterator();
		System.out.println(it.toString());
		
		ArrayList list9 = new ArrayList();
		System.arraycopy(list0, 0, list9, 0, 2);
		System.out.println(list9);
		
	}
}
