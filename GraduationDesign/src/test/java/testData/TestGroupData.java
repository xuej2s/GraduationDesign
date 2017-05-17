package testData;

import java.util.Date;
import java.util.List;

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
import sdu.lpy.dao.ProfitMapper;
import sdu.lpy.entity.CardFee;
import sdu.lpy.entity.TestGroup;

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
	
	
	
	@Test
	public void getGroupData(){
		System.out.println(cardFeeMapper.getCardProfit(null, null).size());
	}
}
