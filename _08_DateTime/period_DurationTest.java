package javaStudy._08_DateTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class period_DurationTest {
	public static void main(String[] args) {
		
		LocalDate date1 = LocalDate.of(2021, 05, 1);
		LocalDate date2 = LocalDate.now();
		System.out.println(date1);
		System.out.println(date2);
		Period pe = Period.between(date1, date2);
		System.out.println(pe);
		System.out.println();
		
		LocalTime time1 = LocalTime.of(12, 00, 00);
		LocalTime time2 = LocalTime.now();
		System.out.println(time1);
		System.out.println(time2);
		
		Duration du = Duration.between(time1, time2);
		System.out.println(du);
		
		Period pe2 = Period.between(date1, date2);
		System.out.println(pe2);  //P2M4D
		
		Period pe3 = date1.until(date2);
		System.out.println(pe3);  //P2M4D
		
		long day = date1.until(date2, ChronoUnit.DAYS);
		System.out.println(day);  //65
		
		//
		
		
		pe2 = pe2.withYears(2020);
		pe2 = pe2.withMonths(12);
		pe2 = pe2.withDays(11);
		System.out.println(pe2);
		
	}

}
