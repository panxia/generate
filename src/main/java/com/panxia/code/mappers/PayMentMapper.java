package com.panxia.code.mappers;

import com.panxia.code.PayMent;

public interface PayMentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PayMent record);

    int insertSelective(PayMent record);

    PayMent selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PayMent record);

    int updateByPrimaryKey(PayMent record);
}