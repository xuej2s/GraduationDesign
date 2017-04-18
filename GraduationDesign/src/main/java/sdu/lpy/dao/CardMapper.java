package sdu.lpy.dao;

import sdu.lpy.entity.Card;

public interface CardMapper {
    int deleteByPrimaryKey(String cardType);

    int insert(Card record);

    int insertSelective(Card record);

    Card selectByPrimaryKey(String cardType);

    int updateByPrimaryKeySelective(Card record);

    int updateByPrimaryKey(Card record);
}