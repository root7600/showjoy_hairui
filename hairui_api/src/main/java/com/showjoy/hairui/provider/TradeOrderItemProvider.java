package com.showjoy.hairui.provider;

import com.showjoy.hairui.result.TradeOrderItemDto;

/**
 * @Author: hairui
 * @Date: 2019/2/17 14:07
 */
public interface TradeOrderItemProvider {

     TradeOrderItemDto queryByOrderNumber(Long orderNumber);
}
