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

		//파일 읽기 : lines
		Stream<String> fileStream = Files.lines(Paths.get(filePath));
		fileStream.collect(Collectors.toList()).forEach(System.out::println);
		fileStream.close();
		System.out.println(1);
		
		//파일 읽기 : newBufferedReader
		BufferedReader reader = Files.newBufferedReader(Paths.get(filePath));
		String line;
		while((line = reader.readLine())!=null) {
			System.out.println(line);
		}
		reader.close();
		System.out.println(2);

		
		//파일읽기 : readAllLines
		List<String> lines = Files.readAllLines(Paths.get(filePath));
		lines.forEach(System.out::println);
		System.out.println(3);

		
		//파일읽기 : readAllBytes
		byte[] bytes = Files.readAllBytes(Paths.get(filePath));
		System.out.println(new String(bytes));
		System.out.println(4);

		
		//파일읽기 : list
		/*
		 * Stream<Path> dir = Files.list(Paths.get(filePath));
		 * dir.forEach(System.out::println); System.out.println(5);
		 */

	}
}
