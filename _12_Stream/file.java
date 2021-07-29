package _12_Stream;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class file {
	public static void main(String[] args) {
		Path path = Paths.get("C:\\Users\\hwang\\eclipse-workspace\\javaStudy\\test.txt");
		
		Stream<String> Files.lines(path);
		
		
	}
}
