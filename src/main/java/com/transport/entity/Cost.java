package com.transport.entity;

import java.math.BigDecimal;

/**
 * Created by chen on 2017/12/26.
 */
public class Cost {

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    private int code;
    private BigDecimal ferry_cost_total;

    private BigDecimal road_cost_total;

    private BigDecimal gasoline_cost_total;

    public BigDecimal getFerry_cost_total() {
        return ferry_cost_total;
    }

    public void setFerry_cost_total(BigDecimal ferry_cost_total) {
        this.ferry_cost_total = ferry_cost_total;
    }

    public BigDecimal getRoad_cost_total() {
        return road_cost_total;
    }

    public void setRoad_cost_total(BigDecimal road_cost_total) {
        this.road_cost_total = road_cost_total;
    }

    public BigDecimal getGasoline_cost_total() {
        return gasoline_cost_total;
    }


    public void setGasoline_cost_total(BigDecimal gasoline_cost_total) {
        this.gasoline_cost_total = gasoline_cost_total;
    }

    @Override
    public String toString() {
        return "Cost{" +
                "code=" + code +
                ", ferry_cost_total=" + ferry_cost_total +
                ", road_cost_total=" + road_cost_total +
                ", gasoline_cost_total=" + gasoline_cost_total +
                '}';
    }
}
