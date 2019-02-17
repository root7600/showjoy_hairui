package com.showjoy.result;

import java.io.Serializable;

/**
 * @Author: hairui
 * @Date: 2019/2/17 14:11
 */
public class TradeOrderItemDto implements Serializable{

    private Long orderNumber;
    private int id ;
    private String productTitle;
    private int skuId;

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public int getSkuId() {
        return skuId;
    }

    public void setSkuId(int skuId) {
        this.skuId = skuId;
    }

}
