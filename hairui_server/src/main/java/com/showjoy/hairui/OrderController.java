package com.showjoy.hairui;

import com.alibaba.fastjson.JSON;
import com.showjoy.hairui.provider.TradeOrderItemProvider;
import com.showjoy.hairui.result.TradeOrderItemDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.BoundHashOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.UUID;

/**
 * @Author: hairui
 * @Date: 2019/2/23 11:46
 */
@Controller
@RequestMapping("/session")
public class OrderController {

    @Autowired
    private TradeOrderItemProvider tradeOrderItemProvider;
    @Autowired
    private StringRedisTemplate    stringRedisTemplate;


    @RequestMapping("/hello")
    @ResponseBody
    public String queryOrderList(){
        Long orderNumber=132l;
        TradeOrderItemDto tradeOrderItemDto = tradeOrderItemProvider.queryByOrderNumber(orderNumber);
        BoundHashOperations<String, Object, Object> hashOps = stringRedisTemplate.boundHashOps("hairui");
        hashOps.put("showjoy",String.valueOf(new Date().getTime()));
        return JSON.toJSONString(tradeOrderItemDto);
    }

    /**
     * 测试
     * @param session
     * @return
     */
    @RequestMapping("/uid")
    String uid(HttpSession session) {
        UUID uid = (UUID) session.getAttribute("uid");
        if (uid == null) {
            uid = UUID.randomUUID();
        }
        session.setAttribute("uid", uid);
        String id = session.getId();
        return id;
    }
}
