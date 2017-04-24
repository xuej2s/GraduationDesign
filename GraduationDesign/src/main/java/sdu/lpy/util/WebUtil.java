package sdu.lpy.util;

public class WebUtil {

	
	public static boolean notEmpty(String s) {
		return s != null && !"".equals(s) ;
	}

	public static boolean isEmpty(String s) {
		return s == null || "".equals(s);
	}
	
	
}
