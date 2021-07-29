package _12_Stream;

import java.util.stream.Stream;

public class nullStream {

	public static void main(String[] args) {
		Stream emptStream = Stream.empty();
		long count = emptStream.count();
		System.out.println(count);  //0
	}

}
