package com.transport.entity;

import java.util.Date;

/**
 * Created by chen on 2017/12/13.
 */
public class Consigner {

    private int id;

    private int transport_id;

    private String starting_place;

    private String ending_place;

    private int count;

    private String remark;

    private int state;

    private Date create_date;

    private Date update_date;

    private String phone;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTransport_id() {
        return transport_id;
    }

    public void setTransport_id(int transport_id) {
        this.transport_id = transport_id;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Consigner{" +
                "id=" + id +
                ", transport_id=" + transport_id +
                ", starting_place='" + starting_place + '\'' +
                ", ending_place='" + ending_place + '\'' +
                ", count=" + count +
                ", remark='" + remark + '\'' +
                ", state=" + state +
                ", create_date=" + create_date +
                ", update_date=" + update_date +
                ", phone='" + phone + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
