package com.transport.entity;

import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * Created by chen on 2017/12/13.
 */
public class TransportTrns {

    private int id;

    private int transport_id;

    private String location_place;

    private String create_date;

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

    @Override
    public String toString() {
        return "TransportTrns{" +
                "id=" + id +
                ", transport_id=" + transport_id +
                ", location_place='" + location_place + '\'' +
                ", create_date=" + create_date +
                '}';
    }

    public String getLocation_place() {
        return location_place;
    }

    public void setLocation_place(String location_place) {
        this.location_place = location_place;
    }

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    public String getCreate_date() {
        return create_date;
    }

    public void setCreate_date(String create_date) {
        this.create_date = create_date;
    }
}
