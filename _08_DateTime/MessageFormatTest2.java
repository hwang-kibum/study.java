package javaStudy._08_DateTime;

import java.io.File;
import java.text.MessageFormat;
import java.util.Scanner;

public class MessageFormatTest2 {

	public static void main(String[] args) throws Exception {
		String tableName = "CUST_INFO";
		String fileName = "C:\\Users\\hwang\\eclipse-workspace\\javaStudy\\src\\data4.txt";
		String msg = "INSERT INTO " + tableName + " VALUES ({0},{1},{2},{3});";
		
		Scanner s = new Scanner(new File(fileName));
		
		String pattern = "{0},{1},{2},{3}"; 
		MessageFormat mf = new MessageFormat(pattern);

		while(s.hasNextLine()) {
			String line = s.nextLine();
			Object[] objs = mf.parse(line);
			System.out.println(MessageFormat.format(msg, objs));
		}
		s.close(); //작업을 끝났으니 Scanner에서 사용한 파일을 닫아준다.
	}
}
