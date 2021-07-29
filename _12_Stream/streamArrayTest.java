package _12_Stream;

import java.util.Arrays;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class streamArrayTest {

	public static void main(String[] args) {
		
		int[] numArr = {1,3,4,5,6,2};
		Stream<String> strStream = Stream.of("a", "b", "C", "d", "e", "f");   //가변인자 
		Stream<Integer> intStream = Stream.of(new Integer[] {1, 2, 3, 4});
		Stream<Long> longStream = Arrays.stream(new Long[] { 123L, 32L, 234L} );
		Stream<Float> floatStream = Arrays.stream(new Float[] {12.2f, 234.4f, 23.4f});
		
		IntStream numStream = Arrays.stream(numArr);
		IntStream numStreamRange = Arrays.stream(numArr, 2, 5);
		numStreamRange.sorted().forEach(System.out::print);  //456
		IntStream InStream = IntStream.of(1, 3, 4);
		DoubleStream DouStream = DoubleStream.of(1.333, 232.4, 34.674);
		LongStream LongStream = java.util.stream.LongStream.of(23L, 24L, 3232L);
		
		
	}
}
