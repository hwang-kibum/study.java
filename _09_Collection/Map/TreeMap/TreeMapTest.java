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
			Map.Entry e = (Map.Entry)it.next();  //Map.Entry는 Iterator 를 사요해야 하는듯 하다.
			System.out.println(e);
//			System.out.println(tm.ceilingEntry(2));
		}
		System.out.println("containsKey: "+map0.containsKey(2)); //TreeMap에 key가 포함유무 확인
		System.out.println("containsKey: "+map0.containsKey(4)); //TreeMap에 key가 포함유무 확인
		System.out.println("containsKey: "+map0.containsValue("KIM")); //TreeMap에 Value가 포함유무 확인
		System.out.println("containsKey: "+map0.containsValue("kim")); //TreeMap에 Value가 포함유무 확인
		
		NavigableSet navSet = tm.descendingKeySet();
		System.out.println(navSet);  //오름차순에서 역순으로 출력

		Map.Entry e = tm.firstEntry(); //가장 작은 Key가  vlaue를 한싸응로 반환
		System.out.println(e);
		System.out.println(tm.firstKey());  //가장 작은 Key만 출력.
		
		System.out.println(tm.floorEntry(2));  //해당 key와 Value를 반환.
		System.out.println(tm.floorKey(4));  //지정된 key와 일치하거나 가장 근사값인 지정키보다 작은 값.
		
		System.out.println(tm.get(5));  //해당 key Value를 반환함.
		SortedMap sm = tm.headMap(3);  //첫번쨰 요소부터 지정된 범위에 속한 모든 요소를 담아 SortedMap으로 반환한다. 값은 n-1로 인식한다.
		System.out.println("SortedMap sm = tm.headMap(3) : "+sm);
		
		sm = tm.headMap(3, true);  //NavigableMap headMap(Object toKey, boolean inclusive) TreeMap에 저장된 첫번째 요소부터 지정된 범위에 속한 요소가 담김. SortedMap을 반환. inclusive의 값이 true면 toKey포함.
		System.out.println(sm);

		sm = tm.headMap(3, false);  //NavigableMap headMap(Object toKey, boolean inclusive) TreeMap에 저장된 첫번째 요소부터 지정된 범위에 속한 요소가 담김. SortedMap을 반환. inclusive의 값이 false면 toKey 미포함.
		System.out.println(sm);
		
		
	}

}
