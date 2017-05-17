package sdu.lpy.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.alibaba.fastjson.JSON;
import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.PieData;
import com.github.abel533.echarts.json.GsonOption;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Pie;
import com.google.gson.Gson;

import net.sf.json.JSONArray;
import sdu.lpy.dao.CourseSelectMapper;
import sdu.lpy.entity.TestGroup;

@Controller
@RequestMapping("/echart/")
public class TestEchart {

	@Autowired
	private CourseSelectMapper courseSelectMapper;
	
	@RequestMapping("testjsp..do")
	public String testjsp(){
		
		return "";
	}

	@RequestMapping("test.do")
	public String test(Model model) {
		List<TestGroup> testGroups = courseSelectMapper.testGroupBy();
		GsonOption gsonOption = new GsonOption();
		gsonOption.title("课程收益");
		gsonOption.legend("金额（元）");
		gsonOption.tooltip();

		// x轴，时间轴
		CategoryAxis xAxis = new CategoryAxis();

		// y轴，值轴
		gsonOption.yAxis(new ValueAxis().boundaryGap(0d,0.01));

		Bar bar = new Bar("金额（元）");

		Pie pie = new Pie("金额（元）");

		for (int i = 0; i < testGroups.size(); i++) {
			
			xAxis.data(testGroups.get(i).getSelectTime());
			bar.data(testGroups.get(i).getProfit());
			pie.data(new PieData(testGroups.get(i).getSelectTime(), testGroups.get(i).getProfit()));
		}

		gsonOption.xAxis(xAxis);
		pie.center(600, 250).radius(100);
		gsonOption.series(bar,pie);

		System.out.println(gsonOption.toString());
		model.addAttribute("option", gsonOption.toString());
		return "testEchart";
	}

}
