package javaStudy._08_DateTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("yyyy�� MM�� dd��");
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		try {
			Date d = df.parse("2015�� 11�� 23��");
			System.out.println(d);
			System.out.println(df2.format(d));
		} catch (Exception e) {}
	}
}