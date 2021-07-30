package _12_Stream.middeleOperator;

import java.util.stream.IntStream;
import java.util.stream.Stream;
import static java.lang.System.out;

public class skip_limit {
	public static void main(String[] args) {
		
		Stream<String> strStrm = Stream.of("a", "b", "c", "d", "e", "f", "g");
		strStrm.skip(2).limit(3).forEach(out::println);  //cde
		out.println();
		
		IntStream intStrm = IntStream.of(1,3,2,7,4,6,5,8);
		intStrm.sorted().skip(2).limit(5).forEach(out::println); //34567

	}

}
