package _04_Array;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Array {
	public static void main(String[] args) {
//		Integer[] number = { 1,1, new Integer(2),2,2,2,3,4,5,5,6, new Integer(7), 8,9,1 };
//		HashSet<Integer> setdata = new HashSet<>();
//
//		for(int i=0; i<number.length; i++) {
//			setdata.add(number[i]);
//		}
//		System.out.println(setdata); 
//		
//		Map<HashSet, String> userData = new Map<>();

		
		Map<Integer, String> userData1 = new HashMap<>();
		userData1.put(1,  "kim");
		userData1.put(2,  "lee");
		userData1.put(3,  "hong");
		userData1.put(3,  "pack");
		userData1.put(4,  "hwang");
		userData1.put(4,  "lim");
		
		for(int i=1; i <= userData1.size(); i++) {
			System.out.println(userData1.get(i));
		}
		
		
		Set set = userData1.entrySet();
		Iterator it = set.iterator();
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();  //key와 Value을 Entry(Key와 Value를 결합)형태로 Set에 반환.
			System.out.println("number : "+e.getKey() + ", name : "+ e.getValue()); 
/*number : 1, name : kim
  number : 2, name : lee
  number : 3, name : pack
  number : 4, name : lim */
		}
		
		set = userData1.keySet();
		System.out.println("userData1 Key: "+set);    //userData1 Key: [1, 2, 3, 4]
		
		Collection value = userData1.values();
		it = value.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next()); 
			/* kim
				lee
				pack
				lim */
		}

		Map<Integer, String> userData2 = new Hashtable<>();  //HashMap의 구버전...
		Map<Integer, String> userData3 = new TreeMap<>();
		
		
		LinkedList<String> list = new LinkedList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println(list);
		
		list.set(1,"hi");
		System.out.println(list);
		
		list.add(1, "hello");
		System.out.println(list);


	}

}
