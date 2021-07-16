package co.yedam.api;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocaldateTimeExample {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(dtf)); //LocalDateTime -> String
		
		LocalDateTime anytime =LocalDateTime.parse("2021-06-13 15:00:00",dtf);  //String -> LocalDatetime
		dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH");
		anytime = LocalDateTime.parse("2021/05/01 14",dtf);
		
		System.out.println(anytime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
		
		System.out.println(anytime.getMonthValue()+"월");
		System.out.println(anytime.getMonth());
		LocalDateTime ti = LocalDateTime.now().withYear(2020).withMonth(7).withDayOfMonth(5).withHour(15).withMinute(30).withSecond(25);
		System.out.println(ti.format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss")));
		
		LocalDateTime yourBirth = LocalDateTime.now().withYear(1995).withMonth(10).withDayOfMonth(29).withHour(4).withMinute(45).withSecond(30);
		System.out.println(yourBirth.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a HH:mm:ss ")));
		
//		now.format(dtf) anytime.format(dtf)
	}

}
