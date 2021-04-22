package FunctionalInterfaces;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Month {

	public static List<Date> datesBetween(Date d1, Date d2) {

		List<Date> ret = new ArrayList<Date>();

		SimpleDateFormat sdf = new SimpleDateFormat("yy-MM-dd");

		Calendar c = Calendar.getInstance();

		c.setTime(d1);

		while (c.getTimeInMillis() < d2.getTime()) {

			c.add(Calendar.MONTH,1);

			String formatted = sdf.format(c.getTime());
			System.out.println(formatted);

			ret.add(c.getTime());
		}
		System.out.println(ret.size() + " Months found between  "+d1 +" and  "+d2);
		return ret;

	}

	public static void main(String[] args) {

		Date d = new Date(2017, 01, 11);
		Date d1 = new Date(2018, 02, 11);
		Month.datesBetween(d, d1);
	}
}