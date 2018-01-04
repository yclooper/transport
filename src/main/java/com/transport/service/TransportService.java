package com.transport.service;

import com.transport.entity.Cost;
import com.transport.entity.InfoBean;
import com.transport.entity.TransportInfo;
import com.transport.entity.TransportTrns;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/**
 * Created by chen on 2017/12/30.
 */
public interface TransportService {

    public List<InfoBean> findTransportListInfoByCarId(int car_id) throws SQLException;


//    public int getCount(int carId) throws SQLException;
//
    void update(TransportInfo transportInfo);
//
    void insert(TransportInfo transportInfo);
//
//    Cost getMoneyCount(String carNumber) throws SQLException;
//
//
//    void updateLocation(TransportTrns transportTrns) throws SQLException;
//
//    TransportInfo findTransportByCarNumber(String carNumber) throws SQLException;
}
