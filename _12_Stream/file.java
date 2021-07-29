package _12_Stream;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class file {
	public static void main(String[] args) throws Exception {
		
		String filePath = "C:\\Users\\hwang\\eclipse-workspace\\javaStudy\\test.txt";

		//���� �б� : lines
		Stream<String> fileStream = Files.lines(Paths.get(filePath));
		fileStream.collect(Collectors.toList()).forEach(System.out::println);
		fileStream.close();
		System.out.println(1);
		
		//���� �б� : newBufferedReader
		BufferedReader reader = Files.newBufferedReader(Paths.get(filePath));
		String line;
		while((line = reader.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
		System.out.println(2);

		
		//�����б� : readAllLines
		List<String> lines = Files.readAllLines(Paths.get(filePath));
		lines.forEach(System.out::println);
		System.out.println(3);

		
		//�����б� : readAllBytes
		byte[] bytes = Files.readAllBytes(Paths.get(filePath));
		System.out.println(new String(bytes));
		System.out.println(4);

		
		//�����б� : list
		/*
		 * Stream<Path> dir = Files.list(Paths.get(filePath));
		 * dir.forEach(System.out::println); System.out.println(5);
		 */

	}
}
