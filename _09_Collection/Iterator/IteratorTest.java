package _09_Collection.Iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class IteratorTest {
	public static void main(String[] args) {
		List list = new ArrayList();
		List list2 = new LinkedList();
		List list3 = new Stack();
		Queue list4 = new LinkedList();
		
		Map map = new HashMap();
		Set eSet = map.entrySet();
		
		
		list.add("test1");
		list.add("test2");
		list.add("test3");
		
		Iterator it = list.iterator();
		Iterator it2 = list2.iterator();
		Iterator it3 = list3.iterator();
		Iterator it4 = list4.iterator();
		Iterator it5 = map.keySet().iterator();
		Iterator it6 = eSet.iterator();

		
		while(it.hasNext()) {
			System.out.println(it.next());
			it.remove();
		}

	}

}
