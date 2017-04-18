package sdu.lpy.dao;

import sdu.lpy.entity.CardFee;
import sdu.lpy.entity.CardFeeKey;

public interface CardFeeMapper {
    int deleteByPrimaryKey(CardFeeKey key);

    int insert(CardFee record);

    int insertSelective(CardFee record);

    CardFee selectByPrimaryKey(CardFeeKey key);

    int updateByPrimaryKeySelective(CardFee record);

    int updateByPrimaryKey(CardFee record);
}