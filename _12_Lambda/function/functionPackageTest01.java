package _12_Lambda.function;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@FunctionalInterface 
interface TriFunction<T, U, V, R> {
	R apply(T t, U u, V v);
}

public class functionPackageTest01 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0; i<10; i++) {
			list.add(i);
		}
		list.forEach(i->System.out.print(i+", "));
		System.out.println(list);
		
		list.removeIf(x-> x%2==0 || x%3==0);
		System.out.println(list);
		
		list.replaceAll(i->i*10);
		System.out.println(list);
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("1", "1");
		map.put("2", "2");
		map.put("3", "3");
		map.put("4", "4");
		map.put("5", "5");
		map.put("6", "6");
		
		map.forEach((k, v)-> System.out.print("{"+k+", "+v+"},"));
		System.out.println();
		
	}

}
