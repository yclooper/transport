package com.transport.service;

import com.transport.entity.*;

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

    TransportInfo findTransportInfoByCarId(int carId);

    void updateCost(TransportInfo transportInfo);

    List<InfoBean> findInfoListByState(int state, int page);

    List<TransportTrns> findAddressList(int transportId);

    InfoBean findInfoBeanByCarId(int carId);

//
//    Cost getMoneyCount(String carNumber) throws SQLException;
//
//
//    void updateLocation(TransportTrns transportTrns) throws SQLException;
//
//    TransportInfo findTransportByCarNumber(String carNumber) throws SQLException;
}
