package com.transport.service;

import com.transport.entity.Cost;
import com.transport.entity.InfoBean;
import com.transport.entity.PageBean;
import com.transport.entity.TransportInfo;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by chen on 2017/12/30.
 */
public interface TransportService {

    List<InfoBean> findTransportListInfoByCarId(int car_id,int page);


    int getCount(int carId);
//
    void update(TransportInfo transportInfo);
//
    int insert(TransportInfo transportInfo);

    Cost calCost(int carId);

    void updateLocation(int carId, String location);

//
//    Cost getMoneyCount(String carNumber) throws SQLException;
//
//
//    void updateLocation(TransportTrns transportTrns) throws SQLException;
//
//    TransportInfo findTransportByCarNumber(String carNumber) throws SQLException;
}
