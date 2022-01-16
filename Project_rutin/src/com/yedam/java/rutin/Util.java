package com.yedam.java.rutin;

import java.text.SimpleDateFormat;
import java.text.*;
import java.time.*;
import java.util.*;

public class Util {
	
	//시스템의 오늘 날짜 -> 문자열 서식 YYYY-MM-dd
	public static String toDayString(String format) {
		String today = new SimpleDateFormat(format).format(new Date());
		return today;
	}
}
