package com.transport.service;

import com.transport.entity.InfoBean;
import com.transport.entity.TransportInfo;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by chen on 2017/12/30.
 */
public interface TransportService {

    public List<InfoBean> findTransportListInfoByCarId(int car_id) throws SQLException;


//    public int getCount(int carId) throws SQLException;
//
    void update(TransportInfo transportInfo);
//
    int insert(TransportInfo transportInfo);

//
//    Cost getMoneyCount(String carNumber) throws SQLException;
//
//
//    void updateLocation(TransportTrns transportTrns) throws SQLException;
//
//    TransportInfo findTransportByCarNumber(String carNumber) throws SQLException;
}
