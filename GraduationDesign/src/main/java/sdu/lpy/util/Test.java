package sdu.lpy.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		SimpleDateFormat dft = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		System.out.println(dft.format(date));
		
		Date date2 = WebUtil.getEndTime(date, 365);
		System.out.println(dft.format(date2));
	}

}
