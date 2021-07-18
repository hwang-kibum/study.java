package _09_Collection.Map.TreeMap;

import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapTest {
	public static void main(String[] args) {
		//Constructor 
		Map<Integer, String> map0 = new TreeMap<Integer, String>();  //Map map0 = new TreeMap();
		map0.put(2, "kim");
		map0.put(3, "hong");
		map0.put(3, "back");
		map0.put(1, "kim");
		map0.put(5, "lee");

		Set set = map0.entrySet();  
		Iterator it = set.iterator();
		TreeMap tm = (TreeMap)map0;
//		System.out.println(tm.ceilingEntry(3));
		
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();  //Map.Entry�� Iterator �� ����ؾ� �ϴµ� �ϴ�.
			System.out.println(e);
//			System.out.println(tm.ceilingEntry(2));
		}
		System.out.println("containsKey: "+map0.containsKey(2)); //TreeMap�� key�� �������� Ȯ��
		System.out.println("containsKey: "+map0.containsKey(4)); //TreeMap�� key�� �������� Ȯ��
		System.out.println("containsKey: "+map0.containsValue("KIM")); //TreeMap�� Value�� �������� Ȯ��
		System.out.println("containsKey: "+map0.containsValue("kim")); //TreeMap�� Value�� �������� Ȯ��
		
		NavigableSet navSet = tm.descendingKeySet();
		System.out.println(navSet);  //������������ �������� ���

		Map.Entry e = tm.firstEntry(); //���� ���� Key��  vlaue�� �ѽ����� ��ȯ
		System.out.println(e);
		System.out.println(tm.firstKey());  //���� ���� Key�� ���.
		
		System.out.println(tm.floorEntry(2));  //�ش� key�� Value�� ��ȯ.
		System.out.println(tm.floorKey(4));  //������ key�� ��ġ�ϰų� ���� �ٻ簪�� ����Ű���� ���� ��.
		
		System.out.println(tm.get(5));  //�ش� key Value�� ��ȯ��.
		SortedMap sm = tm.headMap(3);  //ù���� ��Һ��� ������ ������ ���� ��� ��Ҹ� ��� SortedMap���� ��ȯ�Ѵ�. ���� n-1�� �ν��Ѵ�.
		System.out.println("SortedMap sm = tm.headMap(3) : "+sm);
		
		sm = tm.headMap(3, true);  //NavigableMap headMap(Object toKey, boolean inclusive) TreeMap�� ����� ù��° ��Һ��� ������ ������ ���� ��Ұ� ���. SortedMap�� ��ȯ. inclusive�� ���� true�� toKey����.
		System.out.println(sm);

		sm = tm.headMap(3, false);  //NavigableMap headMap(Object toKey, boolean inclusive) TreeMap�� ����� ù��° ��Һ��� ������ ������ ���� ��Ұ� ���. SortedMap�� ��ȯ. inclusive�� ���� false�� toKey ������.
		System.out.println(sm);
		
		
	}

}
