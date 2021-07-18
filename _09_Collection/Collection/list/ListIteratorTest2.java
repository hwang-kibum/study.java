package _09_Collection.Collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListIteratorTest2 {
	public static void main(String[] args) {
		List original = new ArrayList(10);
		List copy1 = new ArrayList(10);
		List copy2 = new ArrayList(10);
		
		for(int i = 0; i<10; i++) {
			original.add(i+"");
		} 
		Iterator it = original.iterator();
		
		while(it.hasNext()) {
			copy1.add(it.next());
		}
		
		System.out.println("=original���� copy1���� (copy) =");
		System.out.println("original: "+original);
		System.out.println("copy1: " + copy1);
		System.out.println();

		it = original.iterator();    //Iterator�� ������ �ȵȴ�.

		while(it.hasNext()) {
			copy2.add(it.next());
			it.remove();
		}
		
		System.out.println("=original���� copy2�� �̵�(move) =");
		System.out.println("original: " + original);
		System.out.println("copy2: " +copy2);
		
	}

}
