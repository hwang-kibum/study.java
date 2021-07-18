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
		list0.add(new String("하나"));
		list0.add(new String("두울"));
		list0.add(new String("세엣"));
		System.out.println("list0 : "+list0);
		
		/* 1. 추가  */
		//list0에 모든 요소 list1에 추가.
		ArrayList list1 = new ArrayList();
		list1.addAll(list0);
		System.out.println("list1 : "+list1);

		list1.add("test");
		System.out.println("list1 : "+list1);
		
		
		/* 2. 검색  */
		//contains 대소문자 구분함.
		System.out.println("list1에 \"하나\"가 있다 : "+list1.contains("하나"));
		System.out.println("list1에 \"둘\"가 있다 : "+list1.contains("둘"));
		System.out.println("list1에 \"Test\"가 있다 : "+list1.contains("Test"));
		System.out.println("list1에 \"test\"가 있다 : "+list1.contains("test"));
		
		//containsAll() : A.containsAll(B)
		/* 1. B가 요소들이 A의 모두 포함하면 true
		 * 2. A는 B요소보다 많아도 된다.
		 */
		System.out.println("list1은 list0에 모두 포함이다 : "+list0.containsAll(list1));
		ArrayList list2 = new ArrayList();
		list2.addAll(list0);
		System.out.println(list2);
		System.out.println("list2는 list0에 모두 포함이다. : "+list0.containsAll(list2));  //
		System.out.println("list0은 list1에 모두 포함이다. : "+list1.containsAll(list0));  //
		
		/* 3. 삭제  
		 * (ArrayList는 인덱스 0이 아닌 맨 끝에서 부터 삭제해야 데이터 복사가 발생하지않아 리소스를 최소화 할수있다.안그러면 완전 삭제가 안될수도있다.)*/
		list2.clear();   //전체 삭제 
		System.out.println(list2);
		
		list2.addAll(list1);  //[하나, 두울, 세엣, test]
		list2.removeAll(list2); //[]
		list2.addAll(list1);  //[하나, 두울, 세엣, test]
		System.out.println(list2);
		list2.retainAll(list0);  //list0에 없는 list2에 요소 test만 삭제한다.
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
		
		System.out.println(list0.get(1));   //두울
		System.out.println(list0.contains("두울"));  //있으면 true, 없으면 false
		
		System.out.println(list0.size());   //3
		list0.ensureCapacity(4);
		System.out.println(list0);
		System.out.println(list0.size());   //3
		
		list0.set(1, "둘");
		System.out.println(list0);

//		list0.set(3, "네엣");    set(int index, Object o) 은 이미 인덱스에 있는 값만 변경가능. 값이 없는 인덱스에는 삽입은 add()로 해야한다.
		
		System.out.println(list0.iterator());
		Iterator it = list0.iterator();
		System.out.println(it.toString());
		
		ArrayList list9 = new ArrayList();
		System.arraycopy(list0, 0, list9, 0, 2);
		System.out.println(list9);
		
	}
}
