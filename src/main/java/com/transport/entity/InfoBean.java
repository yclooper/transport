package com.transport.entity;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by chen on 2017/12/13.
 */
public class InfoBean {

    private int id;

    private int user_id;

    private String user_name;

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    private int state;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    private int car_id;

    private String starting_place;

    private String ending_place;


    private int count;

    private String remark;

    private String phone;

    private String name;

    private double weight;

    private BigDecimal gasoline_cost;

    private BigDecimal road_cost;

    private BigDecimal ferry_cost;


    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date update_date;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private int type;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getStarting_place() {
        return starting_place;
    }

    public void setStarting_place(String starting_place) {
        this.starting_place = starting_place;
    }

    public String getEnding_place() {
        return ending_place;
    }

    public void setEnding_place(String ending_place) {
        this.ending_place = ending_place;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    @Override
    public String toString() {
        return "InfoBean{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", user_name='" + user_name + '\'' +
                ", state=" + state +
                ", car_id=" + car_id +
                ", starting_place='" + starting_place + '\'' +
                ", ending_place='" + ending_place + '\'' +
                ", count=" + count +
                ", remark='" + remark + '\'' +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                ", gasoline_cost=" + gasoline_cost +
                ", road_cost=" + road_cost +
                ", ferry_cost=" + ferry_cost +
                '}';
    }
}
