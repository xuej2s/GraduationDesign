package sdu.lpy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.entity.News;
import sdu.lpy.service.AdminNewsService;

@Controller
@RequestMapping("/vip/")
public class VipNewsController {

	@Autowired
	private AdminNewsService adminNewsService;

	@RequestMapping("news.do")
	public String news(Model model) {
		List<News> newsList = adminNewsService.getNews();
		model.addAttribute("newsList", newsList);
		return "vHomePage";
	}

	@RequestMapping("shownews.do")
	public String shownews(String newId,Model model){
		News news = adminNewsService.selectByPrimaryKey(newId);
		model.addAttribute("a", news);
		return "vShowNews";
	}
}
