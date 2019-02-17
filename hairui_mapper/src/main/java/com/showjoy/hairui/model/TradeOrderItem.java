package com.showjoy.hairui.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TradeOrderItem implements Serializable {
    private Integer id;

    private Long ordernumber;

    private Integer skuid;

    private BigDecimal price;

    private String producttiltle;

    private Date gmtModified;

    private Date gmtCreate;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(Long ordernumber) {
        this.ordernumber = ordernumber;
    }

    public Integer getSkuid() {
        return skuid;
    }

    public void setSkuid(Integer skuid) {
        this.skuid = skuid;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getProducttiltle() {
        return producttiltle;
    }

    public void setProducttiltle(String producttiltle) {
        this.producttiltle = producttiltle == null ? null : producttiltle.trim();
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }
}