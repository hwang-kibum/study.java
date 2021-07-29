package _12_Stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class stream {
	public static void main(String[] args) {
		//배열을 리스트에 
		String[] strArr = { "aaa", "ddd", "ccc" };
		List<String> strList = Arrays.asList(strArr);
		
		//스트림 생성
		Stream<String> strStream1 = strList.stream();
		Stream<String> strStream2 = Arrays.stream(strArr);
		
		
		Arrays.sort(strArr);
		for(String str : strArr) {
			System.out.println(str);
		}
		System.out.println();
		
		Collections.sort(strList);
		for(String str: strList) {
			System.out.println(str);
		}		
		System.out.println();

		strStream1.sorted().forEach(System.out::println);
		System.out.println();
		strStream2.sorted().forEach(System.out::println);
	}
}
