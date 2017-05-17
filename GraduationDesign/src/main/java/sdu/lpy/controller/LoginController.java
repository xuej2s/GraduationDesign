package sdu.lpy.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.jms.Session;
import javax.json.Json;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;

import net.sf.json.JSONArray;
import sdu.lpy.entity.News;
import sdu.lpy.entity.Vip;
import sdu.lpy.service.AdminNewsService;
import sdu.lpy.service.LoginService;
import sdu.lpy.service.VipConfigService;
import sdu.lpy.util.WebUtil;

@Controller
@RequestMapping("/login/")
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@Autowired
	private VipConfigService vipConfigService;

	@Autowired
	private AdminNewsService adminNewsService;
	//经营者登陆页面
	@RequestMapping("admin.do")
	public String adminLogin() {

		return "login";

	}

	//经营者登陆身份验证
	@RequestMapping("ahomepage.do")
	public String aLogin(String inputEmail, String inputPassword) {

		if (inputPassword.equals(loginService.getAdminPwd(inputEmail))) {
			if (vipConfigService.getCardFee(new Date()).size() == 0) {
				vipConfigService.insertCardFee();
			}
			return "homePage";

		} else {

			return "login";

		}

	}

	//会员登陆页面
	@RequestMapping("vip.do")
	public String vipLogin() {

		return "vipLogin";

	}

	//会员身份验证
	@RequestMapping(value = "vlogin.do", method = RequestMethod.POST)

	public void vLogin(String loginname, String password, HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String errInfo = "";
		HttpSession session = request.getSession();
		if (WebUtil.notEmpty(loginname) && WebUtil.notEmpty(password)) {

			String pwd = loginService.getVipPwd(loginname);
			if (password.equals(pwd)) {
				session.setAttribute("vipId", loginname);
				errInfo = "success";// 成功
			} else {
				errInfo = "usererror";// 用户名或密码错误
			}

		} else {
			errInfo = "error";// 缺少参数
		}

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("result", errInfo);
		jsonObject.put("session", session);
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		response.getWriter().print(jsonObject.toJSONString());

	}

	//获取会员身份id
	@RequestMapping("/vhomepage.do")
	public String vHomePage(HttpServletRequest request,Model model) {
		String vipId = (String) request.getSession().getAttribute("vipId");
		Vip vip = vipConfigService.getVip(vipId);
		request.getSession().setAttribute("cardType", vip.getCardType());
		List<News> newsList = adminNewsService.getNews();
		model.addAttribute("newsList", newsList);
		model.addAttribute("vipId", vipId);
		System.out.println(vipId);
		return "vHomePage";
	}

}
