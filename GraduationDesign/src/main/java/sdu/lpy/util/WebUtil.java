package sdu.lpy.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

public class WebUtil {

	
	public static boolean notEmpty(String s) {
		return s != null && !"".equals(s) ;
	}

	public static boolean isEmpty(String s) {
		return s == null || "".equals(s);
	}
	
	//将前台形如MM/dd/yyyy格式的string类型数据转换为date类型
	public static Date[] changeDateRangeToDate(String dateRange) throws ParseException{
		String[] dates = dateRange.split(" - ");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date dateOp = sdf.parse(dates[0]);
		Date dateEd = sdf.parse(dates[1]);
		Date[] dates2 = {dateOp,dateEd};
		return dates2;
	}
	
	//date转string（MM/dd/yyyy）
	public static String changeDateToString(Date date){
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String sdate = sdf.format(date);
		return sdate;
	}
	
	public static String autoCreateId(){
		UUID uuid = UUID.randomUUID();
		String id = uuid.toString();
		
		return id;
	}
	
	public static String getCurrentTime(){
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
		return df.format(new Date());// new Date()为获取当前系统时间
	}
	
	public static Date getEndTime(Date currentTime ,int day){
		
		Calendar date = Calendar.getInstance();
		date.setTime(currentTime);
		
		date.set(Calendar.DATE, date.get(Calendar.DATE) + day);
		return date.getTime();
	}
	
}
