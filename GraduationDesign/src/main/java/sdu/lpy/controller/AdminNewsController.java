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
	
	//活动管理页面
	@RequestMapping("news.do")
	public String news(Model model){
		
		List<News> newsList = adminNewsService.getNews();
		model.addAttribute("newsList", newsList);
		
		return "newsPage";
	}
	
	//活动详情查看
	@RequestMapping("shownews.do")
	public String shownews(String newId,Model model){
		News news = adminNewsService.selectByPrimaryKey(newId);
		model.addAttribute("a", news);
		return "showNews";
	}
	
	//增加活动页面跳转
	@RequestMapping("addnews.do")
	public String addnews(){
		return "addNews";
	}
	

	//增加活动
	@RequestMapping("addNews.do")
	public String addNews(News news){
		news.setNewId(WebUtil.autoCreateId());
		news.setNewsTime(new Date());
		adminNewsService.insertSelective(news);
		return "redirect:news.do";
	}
	
	//修改活动页面
	@RequestMapping("updatenews.do")
	public String updatenews(News news,Model model){
		model.addAttribute("a", news);
		return "updateNews";
	}
	
	//修改活动
	@RequestMapping("updateNews.do")
	public String updateNews(News news){
		news.setNewsTime(new Date());
		adminNewsService.updateByPrimaryKeySelective(news);
		return "redirect:news.do";
	}
	
	//删除活动
	@RequestMapping("deletenews.do")
	public String deletenews(String newId){
		adminNewsService.deleteByPrimaryKey(newId);
		return "redirect:news.do";
	}
}
