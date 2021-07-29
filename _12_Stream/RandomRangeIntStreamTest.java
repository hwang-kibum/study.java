package _12_Stream;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class RandomRangeIntStreamTest {

	public static void main(String[] args) {
		IntStream intStrm = IntStream.range(1, 11);  //1~10
		intStrm.forEach(System.out::print);
		System.out.println();
		
		intStrm = IntStream.rangeClosed(1,  10); //1~10
		intStrm.forEach(System.out::print);
		System.out.println();
		
		LongStream longStrm = LongStream.range(1, 11);  //1~10
		longStrm.forEach(System.out::print);
		System.out.println();
		
		longStrm = LongStream.rangeClosed(1, 10);  //1~10
		longStrm.forEach(System.out::print);

	}
}
