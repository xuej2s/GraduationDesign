package sdu.lpy.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.data.PieData;
import com.github.abel533.echarts.json.GsonOption;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Line;
import com.github.abel533.echarts.series.Pie;

import sdu.lpy.dao.CardFeeMapper;
import sdu.lpy.dao.CourseSelectMapper;
import sdu.lpy.dao.MachineConfigMapper;
import sdu.lpy.dao.ProfitMapper;
import sdu.lpy.entity.CardProfit;
import sdu.lpy.entity.CourseProfit;
import sdu.lpy.entity.Profit;
import sdu.lpy.entity.TestGroup;
import sdu.lpy.service.ProfitChartService;
import sdu.lpy.util.WebUtil;

@Service("profitChartService")
public class ProfitChartServiceImpl implements ProfitChartService {

	@Autowired
	private CardFeeMapper cardFeeMapper;

	@Autowired
	private CourseSelectMapper courseSelectMapper;

	@Autowired
	private MachineConfigMapper machineConfigMapper;

	@Autowired
	private ProfitMapper profitMapper;

	public GsonOption getPieInOption(Date startTime, Date endTime) {
		// TODO Auto-generated method stub

		List<Profit> profits = profitMapper.getProfit(startTime, endTime);
		GsonOption gsonOption = new GsonOption();

		gsonOption.title("收益记录");
		gsonOption.legend("金额（元）");
		gsonOption.tooltip();

		Pie pie = new Pie("金额（元）");

		double courseIn = 0;
		double cardIn = 0;

		for (int i = 0; i < profits.size(); i++) {
			Profit profit = profits.get(i);
			courseIn += profit.getCourse();
			cardIn += profit.getVip();
		}

		pie.data(new PieData("课程收益", courseIn));
		pie.data(new PieData("办卡收益", cardIn));

		pie.radius(130);
		gsonOption.series(pie);

		return gsonOption;
	}

	public GsonOption getBarCardInOption(Date startTime, Date endTime) {
		// TODO Auto-generated method stub

		List<Profit> profits = profitMapper.getProfit(startTime, endTime);
		GsonOption gsonOption = new GsonOption();

		gsonOption.title("办卡收益");
		gsonOption.legend("金额（元）");
		gsonOption.tooltip();

		// x轴，时间轴
		CategoryAxis xAxis = new CategoryAxis();

		// y轴，值轴
		gsonOption.yAxis(new ValueAxis().boundaryGap(0d, 0.01));

		Bar bar = new Bar("金额（元）");

		for (int i = 0; i < profits.size(); i++) {
			Profit profit = profits.get(i);
			xAxis.data(WebUtil.changeDateToStringyyyy(profit.getDate()));
			bar.data(profit.getVip());
		}

		gsonOption.xAxis(xAxis);
		gsonOption.series(bar);
		return gsonOption;
	}

	public GsonOption getLineCardInOption(Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		List<Profit> profits = profitMapper.getProfit(startTime, endTime);
		GsonOption gsonOption = new GsonOption();

		gsonOption.title("办卡收益");
		gsonOption.legend("金额（元）");
		gsonOption.tooltip();

		// x轴，时间轴
		CategoryAxis xAxis = new CategoryAxis();

		// y轴，值轴
		gsonOption.yAxis(new ValueAxis().boundaryGap(0d, 0.01));

		Line line = new Line("金额（元）");

		for (int i = 0; i < profits.size(); i++) {
			Profit profit = profits.get(i);
			xAxis.data(WebUtil.changeDateToStringyyyy(profit.getDate()));
			line.data(profit.getVip());
		}

		gsonOption.xAxis(xAxis);
		gsonOption.series(line);
		return gsonOption;
	}

	public GsonOption getBarCourseInOption(Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		List<Profit> profits = profitMapper.getProfit(startTime, endTime);
		GsonOption gsonOption = new GsonOption();

		gsonOption.title("课程收益");
		gsonOption.legend("金额（元）");
		gsonOption.tooltip();

		// x轴，时间轴
		CategoryAxis xAxis = new CategoryAxis();

		// y轴，值轴
		gsonOption.yAxis(new ValueAxis().boundaryGap(0d, 0.01));

		Bar bar = new Bar("金额（元）");

		for (int i = 0; i < profits.size(); i++) {
			Profit profit = profits.get(i);
			xAxis.data(WebUtil.changeDateToStringyyyy(profit.getDate()));
			bar.data(profit.getCourse());
		}

		gsonOption.xAxis(xAxis);
		gsonOption.series(bar);
		return gsonOption;
	}

	public GsonOption getLineCourseInOption(Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		List<Profit> profits = profitMapper.getProfit(startTime, endTime);
		GsonOption gsonOption = new GsonOption();

		gsonOption.title("课程收益");
		gsonOption.legend("金额（元）");
		gsonOption.tooltip();

		// x轴，时间轴
		CategoryAxis xAxis = new CategoryAxis();

		// y轴，值轴
		gsonOption.yAxis(new ValueAxis().boundaryGap(0d, 0.01));

		Line line = new Line("金额（元）");

		for (int i = 0; i < profits.size(); i++) {
			Profit profit = profits.get(i);
			xAxis.data(WebUtil.changeDateToStringyyyy(profit.getDate()));
			line.data(profit.getCourse());
		}

		gsonOption.xAxis(xAxis);
		gsonOption.series(line);
		return gsonOption;
	}

	public GsonOption getPieOutOption(Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		List<Profit> profits = profitMapper.getProfit(startTime, endTime);
		GsonOption gsonOption = new GsonOption();

		gsonOption.title("支出记录");
		gsonOption.legend("金额（元）");
		gsonOption.tooltip();

		Pie pie = new Pie("金额（元）");

		double machineOut= 0;

		for (int i = 0; i < profits.size(); i++) {
			Profit profit = profits.get(i);
			machineOut += (profit.getMechine()*(-1));
		}

		pie.data(new PieData("器械支出", machineOut));

		pie.radius(100);
		gsonOption.series(pie);

		return gsonOption;
	}

	public GsonOption getBarMachineOutOption(Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		List<Profit> profits = profitMapper.getProfit(startTime, endTime);
		GsonOption gsonOption = new GsonOption();

		gsonOption.title("器械支出");
		gsonOption.legend("金额（元）");
		gsonOption.tooltip();

		// x轴，时间轴
		CategoryAxis xAxis = new CategoryAxis();

		// y轴，值轴
		gsonOption.yAxis(new ValueAxis().boundaryGap(0d, 0.01));

		Bar bar = new Bar("金额（元）");

		for (int i = 0; i < profits.size(); i++) {
			Profit profit = profits.get(i);
			xAxis.data(WebUtil.changeDateToStringyyyy(profit.getDate()));
			bar.data(profit.getMechine()*-1);
		}

		gsonOption.xAxis(xAxis);
		gsonOption.series(bar);
		return gsonOption;
	}

	public GsonOption getLineMachineOutOption(Date startTime, Date endTime) {
		// TODO Auto-generated method stub
		List<Profit> profits = profitMapper.getProfit(startTime, endTime);
		GsonOption gsonOption = new GsonOption();

		gsonOption.title("器械支出");
		gsonOption.legend("金额（元）");
		gsonOption.tooltip();

		// x轴，时间轴
		CategoryAxis xAxis = new CategoryAxis();

		// y轴，值轴
		gsonOption.yAxis(new ValueAxis().boundaryGap(0d, 0.01));

		Line line = new Line("金额（元）");

		for (int i = 0; i < profits.size(); i++) {
			Profit profit = profits.get(i);
			xAxis.data(WebUtil.changeDateToStringyyyy(profit.getDate()));
			line.data(profit.getMechine()*-1);
		}

		gsonOption.xAxis(xAxis);
		gsonOption.series(line);
		return gsonOption;
	}

}
