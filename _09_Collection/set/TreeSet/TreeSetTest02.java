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
		
		//���� ������� ��µȴ�.
		System.out.println(set);
		
		/*
		 * //Iterator�� �Ұ�� ���� �� �ø��������� ����ȴ�. Iterator it = set.iterator();
		 * while(it.hasNext()) { System.out.print(it.next()+","); }
		 * System.out.println();
		 */
		
		//Comparator�� Set�� ���� ���� �ʾ� TreeSet���� ��ȯ�ؾ��Ѵ�.
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
