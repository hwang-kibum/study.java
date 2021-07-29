package _12_Stream;

import java.util.stream.Stream;

public class Lambda_interate_generate_StreamTest {

	public static void main(String[] args) {
		Stream<Integer> strmInt1 = Stream.iterate(0, n -> n+2);
		strmInt1.limit(5).forEach(System.out::println);
		
		Stream<Integer> StrmInt = Stream.generate(()->1).limit(5);
		StrmInt.forEach(System.out::println);
		
		Stream<Double> strmDoub = Stream.generate(Math::random).limit(5);
		strmDoub.forEach(System.out::println);
	}

}
