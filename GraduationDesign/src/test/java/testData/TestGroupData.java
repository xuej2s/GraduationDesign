package testData;

import java.text.ParseException;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.github.abel533.echarts.Option;
import com.github.abel533.echarts.axis.CategoryAxis;
import com.github.abel533.echarts.axis.ValueAxis;
import com.github.abel533.echarts.code.Trigger;
import com.github.abel533.echarts.data.PieData;
import com.github.abel533.echarts.json.GsonOption;
import com.github.abel533.echarts.series.Bar;
import com.github.abel533.echarts.series.Pie;

import sdu.lpy.dao.CardFeeMapper;
import sdu.lpy.dao.CourseSelectMapper;
import sdu.lpy.dao.MachineConfigMapper;
import sdu.lpy.dao.ProfitMapper;
import sdu.lpy.entity.CardFee;
import sdu.lpy.entity.Profit;
import sdu.lpy.entity.TestGroup;
import sdu.lpy.util.ExportExcel;
import sdu.lpy.util.WebUtil;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class TestGroupData {

	private static Logger logger = Logger.getLogger(TestGroupData.class);

	@Autowired
	private CourseSelectMapper courseSelectMapper;

	@Autowired
	private CardFeeMapper cardFeeMapper;

	@Autowired
	private ProfitMapper profitMapper;

	@Autowired
	private MachineConfigMapper machineConfigMapper;

	@Test
	public void getGroupData() throws ParseException {
		String dateRange = "05/16/2017 - 05/16/2017";
		Date[] dates = WebUtil.changeDateRangeToDate(dateRange);
		
		Date startTime = dates[0];
		Date endTime = dates[1];
		
		System.out.println(profitMapper.getProfit(startTime, endTime).size());
		System.out.println(cardFeeMapper.getCardProfit(startTime, endTime).size());
		System.out.println(courseSelectMapper.getCourseProfit(startTime, endTime).size());
		System.out.println(machineConfigMapper.getMachineProfit(startTime, endTime).size());
	}
}
