package com.showjoy.provider.impl;

import com.showjoy.hairui.dao.TradeOrderItemMapper;
import com.showjoy.hairui.model.TradeOrderItem;
import com.showjoy.hairui.model.TradeOrderItemExample;
import com.showjoy.provider.TradeOrderItemProvider;
import com.showjoy.result.TradeOrderItemDto;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: hairui
 * @Date: 2019/2/17 14:13
 */

@Service
public class TradeOrderItemProviderImpl implements TradeOrderItemProvider {


    @Resource
    private TradeOrderItemMapper tradeOrderItemMapper;

    @Override
    public TradeOrderItemDto queryByOrderNumber(Long orderNumber) {

        TradeOrderItemExample tradeOrderItemExample = new TradeOrderItemExample();
        TradeOrderItemExample.Criteria criteria = tradeOrderItemExample.createCriteria();
        criteria.andOrdernumberEqualTo(orderNumber);
        List<TradeOrderItem> tradeOrderItems = tradeOrderItemMapper.selectByExample(tradeOrderItemExample);
        if(CollectionUtils.isEmpty(tradeOrderItems)){
            return null;
        }

        return this.buildTradeOrderItemDto(tradeOrderItems);
    }

    private TradeOrderItemDto buildTradeOrderItemDto(List<TradeOrderItem> tradeOrderItems){
        TradeOrderItemDto tradeOrderItemDto = new TradeOrderItemDto();
        TradeOrderItem tradeOrderItem = tradeOrderItems.get(0);
        tradeOrderItemDto.setId(tradeOrderItem.getId());
        tradeOrderItemDto.setOrderNumber(tradeOrderItem.getOrdernumber());
        tradeOrderItemDto.setProductTitle(tradeOrderItem.getProducttiltle());
        tradeOrderItemDto.setSkuId(tradeOrderItemDto.getSkuId());
        return tradeOrderItemDto;
    }

}
