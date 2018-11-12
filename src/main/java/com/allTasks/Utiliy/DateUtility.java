package com.allTasks.Utiliy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtility {
	
	public static String getRandomDate() throws ParseException {
		DateFormat formatter = new SimpleDateFormat("dd-MMM-yy");
        Calendar cal=Calendar.getInstance();
        String str_date1="01-Dec-18";
        String str_date2="27-Dec-18";

        cal.setTime(formatter.parse(str_date1));
        Long value1 = cal.getTimeInMillis();

        cal.setTime(formatter.parse(str_date2));
        Long value2 = cal.getTimeInMillis();

        long value3 = (long)(value1 + Math.random()*(value2 - value1));
        cal.setTimeInMillis(value3);
        return (formatter.format(cal.getTime()));
	}

}
