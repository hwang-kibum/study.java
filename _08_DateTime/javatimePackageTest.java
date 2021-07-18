package javaStudy._08_DateTime;

import java.time.*;

public class javatimePackageTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2021, 07, 02);
		LocalTime time = LocalTime.of(12, 36, 56);
		
		LocalDateTime dateTime = LocalDateTime.of(date,  time);
		System.out.println(dateTime);   //2021-07-02T12:36:56

		LocalDateTime dateTime6 = date.atStartOfDay(); 
		System.out.println(dateTime6);  //2021-07-02T00:00
		System.out.println();
		
		ZoneId zid = ZoneId.of("Asia/Seoul");
		ZonedDateTime zdt = dateTime.atZone(zid);
		System.out.println(zdt);  //2021-07-02T12:36:56+09:00[Asia/Seoul]
		
		ZonedDateTime zdt2 = LocalDate.now().atStartOfDay(zid);
		System.out.println(zdt2); //2021-07-05T00:00+09:00[Asia/Seoul]
	}

}
