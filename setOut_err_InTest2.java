import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class setOut_err_InTest2 {

	public static void main(String[] args) {
		PrintStream ps = null;
		FileOutputStream fos =null;
		
		try {
			fos = new FileOutputStream("test.txt");
			ps = new PrintStream(fos);
			System.setOut(ps); 
		} catch (FileNotFoundException e) {
			System.err.println("File not Found");
		}
		System.out.println("Hello by System.out");
		System.out.println("testtest");
		System.err.println("Hello by System.err");
	}

}
