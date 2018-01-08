package com.transport.dao;

import com.transport.entity.*;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by chen on 2017/12/30.
 */
public interface TransportMapper {

    public List<InfoBean> findTransportListInfoByCarId(int car_id, int currentNum,int pageNumber);


    public int getCount(int carId);

    //
    public void update(TransportInfo transportInfo);

    //
    public Integer insert(TransportInfo transportInfo);

    Cost countCost(int carId);

    void updateLocation(TransportTrns transportTrns);

    TransportInfo findTransportInfoByCarId(int carId);

    void updateCost(TransportInfo transportInfo);
//
//    Cost getMoneyCount(String carNumber) throws SQLException;
//
//
//    void updateLocation(TransportTrns transportTrns) throws SQLException;
//
//    TransportInfo findTransportByCarNumber(String carNumber) throws SQLException;
}
