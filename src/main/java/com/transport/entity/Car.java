package com.transport.entity;

/**
 * Created by chen on 2017/12/13.
 */
public class Car {

    private static final long serialVersionUID = 1L;
    private int id;
    private String car_number;
    private int car_state;
    private int del;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCar_number() {
        return car_number;
    }

    public void setCar_number(String car_number) {
        this.car_number = car_number;
    }

    public int getCar_state() {
        return car_state;
    }

    public void setCar_state(int car_state) {
        this.car_state = car_state;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }



    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", car_number='" + car_number + '\'' +
                ", car_state=" + car_state +
                ", del=" + del +
                '}';
    }
}
