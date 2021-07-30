package _12_Stream.middeleOperator;

import java.io.File;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class peek {
	public static void main(String[] args) {
		Stream<File> fileStrm = Stream.of(new File("Ex.java"), new File("Ex1"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
		fileStrm.forEach(System.out::println);
		System.out.println();
		
		fileStrm = Stream.of(new File("Ex.java"), new File("Ex1"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
		Stream<String> fileNameStrm = fileStrm.map(File::getName)
											  .filter(s->s.indexOf('.')!=-1)  //Ȯ���ڰ� ���� ���� ����   { indexOf('.')�� ������ -1 ������ �ε�����ȣ ���. -1�� �ƴϸ� �̶�� ���ǽ��̴�.
											  .peek(s->System.out.printf("filename=%s%n", s))
											  .map(s->s.substring(s.indexOf('.')+1))  //Stream<String> -> Stream<String>
											  .peek(s->System.out.printf("extenstion=%s%n", s))
											  .map(String::toUpperCase)
											  .distinct();
		fileNameStrm.forEach(System.out::println);
		IntStream IntegerStrm = IntStream.of(1,2,3,4);
		IntegerStrm.peek(i->System.out.printf("%s%n", i))
				   .peek(i->System.out.printf("%d%n", i))
				   .forEach(System.out::println);

	}

}
