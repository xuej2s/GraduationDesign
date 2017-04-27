package sdu.lpy.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import sdu.lpy.entity.News;
import sdu.lpy.service.AdminNewsService;
import sdu.lpy.util.WebUtil;

@Controller
@RequestMapping("/admin/")
public class AdminNewsController {

	@Autowired
	private AdminNewsService adminNewsService;
	
	@RequestMapping("news.do")
	public String news(Model model){
		
		List<News> newsList = adminNewsService.getNews();
		model.addAttribute("newsList", newsList);
		
		return "newsPage";
	}
	
	@RequestMapping("shownews.do")
	public String shownews(String newId,Model model){
		News news = adminNewsService.selectByPrimaryKey(newId);
		model.addAttribute("a", news);
		return "showNews";
	}
	
	@RequestMapping("addnews.do")
	public String addnews(){
		return "addNews";
	}
	

	@RequestMapping("addNews.do")
	public String addNews(News news){
		news.setNewId(WebUtil.autoCreateId());
		news.setNewsTime(new Date());
		adminNewsService.insertSelective(news);
		return "redirect:news.do";
	}
	
	@RequestMapping("updatenews.do")
	public String updatenews(News news,Model model){
		model.addAttribute("a", news);
		return "updateNews";
	}
	
	
	@RequestMapping("updateNews.do")
	public String updateNews(News news){
		news.setNewsTime(new Date());
		adminNewsService.updateByPrimaryKeySelective(news);
		return "redirect:news.do";
	}
	
	@RequestMapping("deletenews.do")
	public String deletenews(String newId){
		adminNewsService.deleteByPrimaryKey(newId);
		return "redirect:news.do";
	}
}
