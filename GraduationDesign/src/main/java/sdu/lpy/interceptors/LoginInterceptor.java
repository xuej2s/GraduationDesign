package sdu.lpy.interceptors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{

	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2 ) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("--------------------");
		if (request.getSession().getAttribute("inputEmail") != null && request.getSession().getAttribute("inputPassword") != null) {

				return true;
		}
		System.out.println("=================");
		response.sendRedirect("http://localhost:8080/GraduationDesign/login/a.do");
		return false;
	}

	

}
