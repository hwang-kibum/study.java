package _12_Stream;

import java.util.Random;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class randomStreamTest {

	public static void main(String[] args) {
		IntStream intStrm = new Random().ints();
		intStrm.limit(5).forEach(System.out::print);
		System.out.println("\n");
		
		intStrm = new Random().ints(2); //ũ�Ⱑ n�� ���� ��Ʈ���� ��ȯ
		intStrm.limit(5).forEach(System.out::print);  //limit(n)�� ����
		System.out.println("\n");
		
		intStrm = new Random().ints(100, 200);  //ints(begin, end)
		intStrm.limit(5).forEach(System.out::println);
		System.out.println("\n");
		
		intStrm = new Random().ints(2, 100, 200);  //ints(StreamSize, begin, end)
		intStrm.forEach(System.out::println);
		System.out.println("\n");
		

		LongStream longStrm = new Random().longs();
		longStrm.limit(5).forEach(System.out::print);
		System.out.println("\n");
		
		DoubleStream doubleStrm = new Random().doubles();
		doubleStrm.limit(5).forEach(System.out::print); 
		System.out.println("\n");

		
		
	}

}
