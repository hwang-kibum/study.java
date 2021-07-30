package _12_Stream.middeleOperator;

import java.io.File;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class map {

	public static void main(String[] args) {
		/* ��Ʈ���� ��ҿ� ����� �� �߿��� ���ϴ� �ʵ常 �̾Ƴ��ų� Ư�� ���·� ��ȯ�ؾ� �Ҷ� ���.
		 *  �Ű������� TŸ���� RŸ������ ��ȯ�ؼ� ��ȯ�ϴ� �Լ��� �����ؾ��Ѵ�.*/ 
		
		Stream<File> fileStrm = Stream.of(new File("Ex.java"), new File("Ex1"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
		fileStrm.forEach(System.out::println);
		System.out.println();
		
		fileStrm = Stream.of(new File("Ex.java"), new File("Ex1"), new File("Ex1.bak"), new File("Ex2.java"), new File("Ex1.txt"));
		Stream<String> fileNameStrm = fileStrm.map(File::getName)
											  .filter(s->s.indexOf('.')!=-1)  //Ȯ���ڰ� ���� ���� ����
											  .map(s->s.substring(s.indexOf('.')+1))  //Stream<String> -> Stream<String>
											  .map(String::toUpperCase)
											  .distinct();
		fileNameStrm.forEach(System.out::println);

	}

}
