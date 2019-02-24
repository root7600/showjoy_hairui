package com.showjoy.hairui;

import com.alibaba.fastjson.JSON;
import com.showjoy.hairui.provider.TradeOrderItemProvider;
import com.showjoy.hairui.result.TradeOrderItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author: hairui
 * @Date: 2019/2/23 11:46
 */
@Controller
public class OrderController {

    @Autowired
    private TradeOrderItemProvider tradeOrderItemProvider;

    @RequestMapping("/hello")
    @ResponseBody
    public String queryOrderList(){
        Long orderNumber=132l;
        TradeOrderItemDto tradeOrderItemDto = tradeOrderItemProvider.queryByOrderNumber(orderNumber);
        return JSON.toJSONString(tradeOrderItemDto);
    }
}
