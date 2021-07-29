package _12_Stream;

import java.util.stream.Stream;

public class StreamConnection {

	public static void main(String[] args) {
		String[] str1 = {"123", "456", "789" };
		String[] str2 = {"ABC", "DEF", "HIJ"};
		
		Stream<String> strStrm1 = Stream.of(str1);
		Stream<String> strStrm2 = Stream.of(str2);
		Stream<String> strStrm3 = Stream.concat(strStrm1,  strStrm2);  
		
		strStrm3.forEach(System.out::print);

	}

}
