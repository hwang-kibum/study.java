package _09_Collection.Map.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMethodTest {
	public static void main(String[] args) {
		
		String test ="A";
		
		Map map0 = new HashMap();  //HashMap()
		Map map1 = new HashMap(5); //HashMap(int initialCapacity)
		Map map2 = new HashMap(10, 0.8f);  //HashMap(int initialCapacity, float loadFactor)
		Map map3 = new HashMap(map0);   //HashMap(Map m)
		
		map0.put(new Integer(1), "이일");  //지정된 키와 값을 HashMap에 저장.
		map0.put(new Integer(3), "사암");
		map0.put(new Integer(4), "사아");
		map0.put(new Integer(2), "이이");
		
		map3.put(new Integer(4), "네잇");
		map3.put(new Integer(2), "두울");
		map3.put(new Integer(1), "하나");
		map3.put(new Integer(3), "세엣");
		
		Set set = map3.entrySet(); //HashMap에 저장된 key와 value를 Entry(key와 value 의 결합)의 형태로 Set에 저장.
		Iterator it = set.iterator(); 
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("Numbering: "+e.getKey());  //Map.Entry 의 key
			System.out.println("hangle: " + e.getValue());  //Map.Entry의 Value
			System.out.println("hashCode(): " + e.hashCode());  //hashCode값
			System.out.println("getValue() : " + e.getValue() + (test+=1)); //해당 값을 지정해 변경가능.
			System.out.println();

		}
		System.out.println(map3.get(1));
		System.out.println(map3.get(3));

		
		//Object getOrDefault(Object key, Object defaultValue)
		Object obj1 = map3.getOrDefault(3, "hello");  //key가 존재시 해당 value를 출력.
		System.out.println(obj1);
		
		Object obj2 = map3.getOrDefault(6, "hello");  //key가 존재 하지 않으면 default문자열이 출력된다.
		System.out.println(obj2);
		
		map3.replace(2, "이");  //key에 value 다시 지정해준다.
		System.out.println(map3.get(2));  

		if(map3.isEmpty()) {  //비었는가?
			System.out.println("true");
		}else {
			System.out.println("false");//
		}
		map3.clear();
		if(map3.isEmpty()) {  
			System.out.println("true"); //
		}else {
			System.out.println("false");
		}
	}

}
