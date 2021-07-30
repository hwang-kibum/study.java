package _12_Stream.optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalConstructor {

	public static void main(String[] args) {
		String str = "abc";
		Optional<String> strOpt1 = Optional.<String>of(str);
		Optional<String> strOpt2 = Optional.of("abc");
		Optional<String> strOpt3 = Optional.of(new String("abc"));
		
		
//		Optional<String> strOpt4 = Optional.of(null);    //NullPointerException 
		Optional<String> strOpt5 = Optional.ofNullable(null);
		Optional<String> strOpt6 = Optional.ofNullable(str);
		Stream<String> strStrm = strOpt6.stream();
		strStrm.forEach(System.out::println);
		Optional<String> strOpt7 = Optional.ofNullable("abc");
		Optional<String> strOpt8 = Optional.ofNullable(new String("abc"));

		
		
		Optional<String> strOpt9 = null; //null로 초기화  비추...
		Optional<String> strOpt10 = Optional.<String>empty();  //빈객체로 초기화
		
		
	}

}
