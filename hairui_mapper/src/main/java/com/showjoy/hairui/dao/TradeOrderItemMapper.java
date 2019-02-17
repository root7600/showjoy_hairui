package com.showjoy.hairui.dao;

import com.showjoy.hairui.model.TradeOrderItem;
import com.showjoy.hairui.model.TradeOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TradeOrderItemMapper {
    long countByExample(TradeOrderItemExample example);

    int deleteByExample(TradeOrderItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TradeOrderItem record);

    int insertSelective(TradeOrderItem record);

    List<TradeOrderItem> selectByExample(TradeOrderItemExample example);

    TradeOrderItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TradeOrderItem record, @Param("example") TradeOrderItemExample example);

    int updateByExample(@Param("record") TradeOrderItem record, @Param("example") TradeOrderItemExample example);

    int updateByPrimaryKeySelective(TradeOrderItem record);

    int updateByPrimaryKey(TradeOrderItem record);
}