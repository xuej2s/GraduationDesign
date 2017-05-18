package sdu.lpy.service;

import java.util.Date;

import com.github.abel533.echarts.json.GsonOption;

public interface ProfitChartService {

	GsonOption getPieInOption(Date startTime, Date endTime);

	GsonOption getBarCardInOption(Date startTime, Date endTime);

	GsonOption getLineCardInOption(Date startTime, Date endTime);

	GsonOption getBarCourseInOption(Date startTime, Date endTime);

	GsonOption getLineCourseInOption(Date startTime, Date endTime);

	GsonOption getPieOutOption(Date startTime, Date endTime);

	GsonOption getBarMachineOutOption(Date startTime, Date endTime);

	GsonOption getLineMachineOutOption(Date startTime, Date endTime);

}
