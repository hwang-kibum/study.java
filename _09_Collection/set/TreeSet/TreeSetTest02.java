package _09_Collection.set.TreeSet;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest02 {

	public static void main(String[] args) {
		Set<Integer> set =  new TreeSet<Integer>();
		set.add(12);
		set.add(24);
		set.add(11);
		set.add(8);
		set.add(42);
		
		//저장 순서대로 출력된다.
		System.out.println(set);
		
		/*
		 * //Iterator로 할경우 저장 가 올림차순으로 변경된다. Iterator it = set.iterator();
		 * while(it.hasNext()) { System.out.print(it.next()+","); }
		 * System.out.println();
		 */
		
		//Comparator는 Set에 정의 되지 않아 TreeSet으로 변환해야한다.
		TreeSet tset_t = (TreeSet)set;

		Comparator cp = tset_t.comparator();
		Set<String> sset = new TreeSet<String>();
		sset.add("G");
		sset.add("A");
		sset.add("E");
		sset.add("C");
		sset.add("F");

		TreeSet ts = (TreeSet)sset;
		Object str = ts.ceiling("G");
		System.out.println(str);
		
		
		Iterator it2 = sset.iterator();
		while(it2.hasNext()) {
			System.out.print(it2.next()+",");
		}
		

		
	}
		
}
