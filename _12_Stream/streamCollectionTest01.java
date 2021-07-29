package _12_Stream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class streamCollectionTest01 {
	public static void main(String[] args) {
		List<Integer> listInt = new ArrayList<Integer>();
		listInt.add(3);
		listInt.add(2);
		listInt.add(1);
		listInt.add(4);
		listInt.add(5);
	
		Collection IntCollectList = listInt;
		
		Stream<Integer> intStream1 = IntCollectList.stream();
		Stream<Integer> intStream2 = listInt.stream();
		
		
		intStream1.forEach(System.out::print);
		System.out.println();
		intStream2.sorted().forEach(System.out::print);
		
		//스트림을 forEach문으로 모두 소모해 다시 재 생성.
		intStream1 = IntCollectList.stream();
		intStream2 = listInt.stream();
	}

}
