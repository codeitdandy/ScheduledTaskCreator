package com.allTasks.Utiliy;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;



public class UtilityTask {
	
	public enum Priority {
	    HIGH, LOW,MEDIUM;

	public static Priority getPriority(){
	    Priority[] pri = Priority.values();
	    Random generator = new Random();
	    return pri[generator.nextInt(pri.length)];
	    }
	}
	
	
	public static String generateRandomDate() throws ParseException {
		
		DateFormat formatter = new SimpleDateFormat("dd-MMM-yy HH:mm:ss");
        Calendar cal=Calendar.getInstance();
        String str_date1="17-June-07 02:10:15";
        String str_date2="27-June-07 02:10:20";

        cal.setTime(formatter.parse(str_date1));
        Long value1 = cal.getTimeInMillis();

        cal.setTime(formatter.parse(str_date2));
        Long value2 = cal.getTimeInMillis();

        long value3 = (long)(value1 + Math.random()*(value2 - value1));
        cal.setTimeInMillis(value3);
        return formatter.format(cal.getTime());
	}

}
