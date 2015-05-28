package exercises;

import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTime {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar(); 
		TimeZone tz = gc.getTimeZone(); 
		gc.add(GregorianCalendar.MILLISECOND, +tz.getDSTSavings()); 
		System.out.println(gc.getTime()); 
	}

}
