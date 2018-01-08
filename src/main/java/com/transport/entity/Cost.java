package com.transport.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by chen on 2017/12/26.
 */
public class Cost implements Serializable {

    private static final long serialVersionUID = 1L;


    private int code;
    private BigDecimal ferry_cost;

    private BigDecimal road_cost;

    private BigDecimal gasoline_cost;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public BigDecimal getFerry_cost() {
        return ferry_cost;
    }

    public void setFerry_cost(BigDecimal ferry_cost) {
        this.ferry_cost = ferry_cost;
    }

    public BigDecimal getRoad_cost() {
        return road_cost;
    }

    public void setRoad_cost(BigDecimal road_cost) {
        this.road_cost = road_cost;
    }

    public BigDecimal getGasoline_cost() {
        return gasoline_cost;
    }

    public void setGasoline_cost(BigDecimal gasoline_cost) {
        this.gasoline_cost = gasoline_cost;
    }
}
