package _08_Format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class parsing_formatTest1 {
	public static void main(String[] args) {
		
		LocalDate newYear = LocalDate.parse("2016-01-01", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(newYear);  //2016-01-01
		
		LocalDate date = LocalDate.parse("2001-01-01");
		System.out.println(date);  //2001-01-01

		LocalTime time = LocalTime.parse("23:59:59");
		System.out.println(time);  //23:59:59
		
		LocalDateTime dateTime = LocalDateTime.parse("2001-01-01T23:59:59");
		System.out.println(dateTime);  //2001-01-01T23:59:59
		
		DateTimeFormatter pattern = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime endOfYear = LocalDateTime.parse("2015-12-31 23:59:59", pattern);
		System.out.println(endOfYear);  //2015-12-31T23:59:59
	}

}
