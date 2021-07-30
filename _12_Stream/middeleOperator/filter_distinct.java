package _12_Stream.middeleOperator;

import java.util.stream.Stream;

public class filter_distinct {

	public static void main(String[] args) {
		String[] strArr = { "a", "b", "c", "d", "a", "c", "aa", "aa", "bb", "cc", "cc", "123", "123" };
		Stream<String> strStrm = Stream.of(strArr);
		strStrm.distinct().sorted().forEach(System.out::println); //ditinct()중복 제거 
		System.out.println();

		
		strStrm = Stream.of(strArr);
		strStrm.distinct()
			.filter(s-> s =="a" || s=="123") //123 a 
			.forEach(System.out::println);
		System.out.println();
		
		
		strStrm = Stream.of(strArr);
		strStrm.distinct()
			.filter(s-> s =="a" || s == "aa" || s == "c")  //a c aa
			.filter(s -> s == "c") //c
			.forEach(System.out::println);
		System.out.println();
		
	}

}
