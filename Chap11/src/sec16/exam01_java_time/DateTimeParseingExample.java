package sec16.exam01_java_time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeParseingExample {
	public static void main(String[] args) {
		DateTimeFormatter formatter;
		LocalDate localDate;
		
		localDate = LocalDate.parse("2024-05-21");
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ISO_LOCAL_DATE;
		localDate = LocalDate.parse("2024-05-21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyy/MM/dd");
		localDate = LocalDate.parse("2024/05/21", formatter);
		System.out.println(localDate);
		
		formatter = DateTimeFormatter.ofPattern("yyy.MM.dd");
		localDate = LocalDate.parse("2024.05.21", formatter);
		System.out.println(localDate);
	}
}
