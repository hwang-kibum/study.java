package _12_Stream.middeleOperator;

import java.io.File;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class map {

	public static void main(String[] args) {
		/* 스트림의 요소에 저장된 값 중에서 원하는 필드만 뽑아내거나 특정 형태로 변환해야 할때 사용.
		 *  매개변수로 T타입을 R타입으로 변환해서 반환하는 함수를 지정해야한다.*/ 
		
		Stream<File> fileStrm = Stream.of(new File("Ex.java"), new File("Ex1"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
		fileStrm.forEach(System.out::println);
		System.out.println();
		
		fileStrm = Stream.of(new File("Ex.java"), new File("Ex1"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
		Stream<String> fileNameStrm = fileStrm.map(File::getName)
											  .filter(s->s.indexOf('.')!=-1)  //확장자가 없는 것은 제외
											  .map(s->s.substring(s.indexOf('.')+1))  //Stream<String> -> Stream<String>
											  .map(String::toUpperCase)
											  .distinct();
		fileNameStrm.forEach(System.out::println);

	}

}
