package com.manwudingzhi.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {
	public  static String coverToString(Date date){
		if(null==date){
			return "";
		}else{
			return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date).toString();
		}
		
	}
}
