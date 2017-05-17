package sdu.lpy.dao;

import java.util.Date;
import java.util.List;

import sdu.lpy.entity.Profit;

public interface ProfitMapper {
    int insert(Profit record);

    int insertSelective(Profit record);
    
    List<Profit> getProfit(Date startTime,Date endTime);
}