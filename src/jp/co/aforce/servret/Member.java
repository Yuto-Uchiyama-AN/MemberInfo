package jp.co.aforce.servret;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Member {

	public String time() {
		LocalDateTime nowDate = LocalDateTime.now();
	    System.out.println(nowDate);

	     DateTimeFormatter dtf3 =
	             DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
	                 String formatNowDate = dtf3.format(nowDate);
	                 System.out.println(formatNowDate);
					return formatNowDate;

	}



}
