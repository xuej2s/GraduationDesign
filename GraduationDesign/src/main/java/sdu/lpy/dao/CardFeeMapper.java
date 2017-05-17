package sdu.lpy.dao;

import java.util.Date;
import java.util.List;

import sdu.lpy.entity.CardFee;
import sdu.lpy.entity.CardFeeKey;
import sdu.lpy.entity.CardProfit;

public interface CardFeeMapper {
	int deleteByPrimaryKey(CardFeeKey key);

	int insert(CardFee record);

	int insertSelective(CardFee record);

	CardFee selectByPrimaryKey(CardFeeKey key);

	int updateByPrimaryKeySelective(CardFee record);

	int updateByPrimaryKey(CardFee record);

	List<CardFee> getCardFee(String date);
	
	List<CardProfit> getCardProfit(Date startTime,Date endTime);
	
}