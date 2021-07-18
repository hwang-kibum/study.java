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
		
		map0.put(new Integer(1), "����");  //������ Ű�� ���� HashMap�� ����.
		map0.put(new Integer(3), "���");
		map0.put(new Integer(4), "���");
		map0.put(new Integer(2), "����");
		
		map3.put(new Integer(4), "����");
		map3.put(new Integer(2), "�ο�");
		map3.put(new Integer(1), "�ϳ�");
		map3.put(new Integer(3), "����");
		
		Set set = map3.entrySet(); //HashMap�� ����� key�� value�� Entry(key�� value �� ����)�� ���·� Set�� ����.
		Iterator it = set.iterator(); 
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("Numbering: "+e.getKey());  //Map.Entry �� key
			System.out.println("hangle: " + e.getValue());  //Map.Entry�� Value
			System.out.println("hashCode(): " + e.hashCode());  //hashCode��
			System.out.println("getValue() : " + e.getValue() + (test+=1)); //�ش� ���� ������ ���氡��.
			System.out.println();

		}
		System.out.println(map3.get(1));
		System.out.println(map3.get(3));

		
		//Object getOrDefault(Object key, Object defaultValue)
		Object obj1 = map3.getOrDefault(3, "hello");  //key�� ����� �ش� value�� ���.
		System.out.println(obj1);
		
		Object obj2 = map3.getOrDefault(6, "hello");  //key�� ���� ���� ������ default���ڿ��� ��µȴ�.
		System.out.println(obj2);
		
		map3.replace(2, "��");  //key�� value �ٽ� �������ش�.
		System.out.println(map3.get(2));  

		if(map3.isEmpty()) {  //����°�?
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
