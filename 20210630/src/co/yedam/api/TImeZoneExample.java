package co.yedam.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TImeZoneExample {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초 E요일 a");
		Date now = new Date();
		System.out.println(sdf.format(now));
		
//		String[] timezones = TimeZone.getAvailableIDs();
//		for(String timezone : timezones) {
//			if(timezone.toLowerCase().indexOf("los") != -1)
//			System.out.println(timezone);
//		}
		
		Calendar today = Calendar.getInstance(TimeZone.getTimeZone("America/Los_Angeles"));
		System.out.println(today.get(Calendar.DATE));
		System.out.println(today.get(Calendar.HOUR));
		System.out.println(today.get(Calendar.MINUTE));
		System.out.println(today.get(Calendar.SECOND));
		System.out.println(today.get(Calendar.AM_PM));


	}

}
