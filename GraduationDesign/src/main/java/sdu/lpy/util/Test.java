package sdu.lpy.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		 SimpleDateFormat dateFm = new SimpleDateFormat("EEEE");
		 String datestring = "星期一";
		 System.out.println(dateFm.parse(datestring));
	}

}
