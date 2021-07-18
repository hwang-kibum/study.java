package _09_Collection.Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CollectionsTest0 {
	public static void main(String[] args) {
		
		Object obj0 = new Object();
		Object obj1 = new Object();
		
		//컬렉션 생성 
		List list0 = new ArrayList();
		list0.add(new Integer(2));
		list0.add(new Integer(1));
		list0.add(new Integer(3));
		
		System.out.println(list0);

		Set set0 = new HashSet();
		set0.add(new Integer(2));
		set0.add(new Integer(3));
		set0.add(new Integer(1));
		
		SortedSet sortset0 = (SortedSet)set0;
		NavigableSet navigset0 = (NavigableSet)set0;
		
		System.out.println(set0);
		
		Map map0 = new HashMap();
		map0.put(2, "kim");
		map0.put(3, "hong");
		map0.put(1, "hwang");
		
		SortedMap sortmap0 = (SortedMap)map0;
		NavigableMap navigmap0 = (NavigableMap)map0;
		
		System.out.println(map0);
		
		Queue<String> qu = new LinkedList<String>();
		
		
//		컬렉션의 동기화
		Collection colect0 = list0;
		Collection colect1 = Collections.synchronizedCollection(colect0);
		List list1 =Collections.synchronizedList(list0);
		Set set2 = Collections.synchronizedSet(set0);
		Map map1 = Collections.synchronizedMap(map0);
		SortedSet sortSet = Collections.synchronizedSortedSet(sortset0);
		SortedMap sortMap = Collections.synchronizedSortedMap(sortmap0);
		
//		변경불가 컬렉션
		Collection unmodColect = Collections.unmodifiableCollection(colect0);
		List unmodList = Collections.unmodifiableList(list0);
		Set unmodSet = Collections.unmodifiableSet(set0);
		Map unmodMap = Collections.unmodifiableMap(map0);
		NavigableSet unmodnavigSet = Collections.unmodifiableNavigableSet(navigset0);
		SortedSet unmodsortSet = Collections.unmodifiableSortedSet(sortset0);
		NavigableMap unmodnavigMap = Collections.unmodifiableNavigableMap(navigmap0);
		SortedMap unmodsortMap = Collections.unmodifiableSortedMap(sortmap0);
		
//		싱글톤 컬렉션 만들기 
		List gingList = Collections.singletonList(obj0);
		Set singSet = Collections.singleton(obj0);  
		Map singMap = Collections.singletonMap(obj0, obj1);
		
//		한종류의 객체만 저장하는 컬렉션 만들기
		Collection checkColect = Collections.checkedCollection(colect0, String.class);
		List checkList = Collections.checkedList(list0, String.class);
		Set checkSet = Collections.checkedSet(set0, String.class);
		Map checkMap = Collections.checkedMap(map0, Integer.class, String.class);
		Queue checkQue = Collections.checkedQueue(qu, String.class);
		NavigableSet checkNavSet = Collections.checkedNavigableSet(navigset0, String.class);
		SortedSet checksortsSet = Collections.checkedSortedSet(sortset0, String.class);
		NavigableMap checkNavMap = Collections.checkedNavigableMap(navigmap0, Integer.class, String.class);
		SortedMap checksortMap = Collections.checkedSortedMap(sortmap0, Integer.class, String.class);
		
//		병렬처리를 위한 컬렉션 java.util.concurrent;
		Map<Integer,String> map3 = new ConcurrentHashMap<Integer,String>();
		Queue<String> qu2 = new ConcurrentLinkedQueue<String>();
		
	}

}
