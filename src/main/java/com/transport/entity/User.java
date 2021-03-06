package com.transport.entity;

/**
 * Created by chen on 2017/12/13.
 */
public class User {

    private int id;

    private String user_name;

    private String card_no;

    private String phone;

    private String link_address;

    private int del;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getCard_no() {
        return card_no;
    }

    public void setCard_id(String card_no) {
        this.card_no = card_no;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLink_address() {
        return link_address;
    }

    public void setLink_address(String link_address) {
        this.link_address = link_address;
    }

    public int getDel() {
        return del;
    }

    public void setDel(int del) {
        this.del = del;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", card_id='" + card_no + '\'' +
                ", phone='" + phone + '\'' +
                ", link_address='" + link_address + '\'' +
                ", del=" + del +
                '}';
    }
}
