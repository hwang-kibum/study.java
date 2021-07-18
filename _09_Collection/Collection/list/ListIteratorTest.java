package _09_Collection.Collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorTest {
	public static void main(String[] args) {
		List list0 = new ArrayList();
		list0.add("1");
		list0.add("2");
		list0.add("3");
		list0.add("4");
		ListIterator it = list0.listIterator();
		it.add("5");
		it.add("6");
		
		for (int i =0; i<list0.size(); i++) {
			System.out.print(list0.get(i)+", ");
		}
		System.out.println();
		
		while(it.hasNext()) {
			System.out.println((it.nextIndex()-1)+":"+it.next());
		}
		System.out.println();

		while(it.hasPrevious()) {
			System.out.println((it.previousIndex())+":"+it.previous());
		}
		System.out.println();
	
	}

}
