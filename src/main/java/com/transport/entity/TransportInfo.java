package com.transport.entity;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by chen on 2017/12/13.
 */
public class TransportInfo {

    private int id;

    private int car_id;


    private int user_id;

    private BigDecimal gasoline_cost;

    private BigDecimal road_cost;

    private BigDecimal ferry_cost;

    private int state;

    private Date create_date;

    private Date update_date;

    private String weight;

    public Consigner getConsigner() {
        return consigner;
    }

    public void setConsigner(Consigner consigner) {
        this.consigner = consigner;
    }

    private Consigner consigner;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public BigDecimal getGasoline_cost() {
        return gasoline_cost;
    }

    public void setGasoline_cost(BigDecimal gasoline_cost) {
        this.gasoline_cost = gasoline_cost;
    }

    public BigDecimal getRoad_cost() {
        return road_cost;
    }

    public void setRoad_cost(BigDecimal road_cost) {
        this.road_cost = road_cost;
    }

    public BigDecimal getFerry_cost() {
        return ferry_cost;
    }

    public void setFerry_cost(BigDecimal ferry_cost) {
        this.ferry_cost = ferry_cost;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
