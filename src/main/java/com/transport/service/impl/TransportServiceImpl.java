package com.transport.service.impl;

import com.transport.dao.ConsignerMapper;
import com.transport.dao.TransportMapper;
import com.transport.entity.*;
import com.transport.service.TransportService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by chen on 2017/12/30.
 */
@Service
public class TransportServiceImpl implements TransportService {

    @Resource
    private TransportMapper transportMapper;

    @Resource
    private ConsignerMapper consignerMapper;


    public List<InfoBean> findTransportListInfoByCarId(int car_id) throws SQLException {

        return transportMapper.findTransportListInfoByCarId(car_id);
    }


    //    public int getCount(int carId) throws SQLException {
//        return transportMapper.getCount(carId);
//    }
//
    public void update(TransportInfo transportInfo) {
        transportMapper.update(transportInfo);
    }

    public void insert(TransportInfo transportInfo) {

    }

    //
    @Transactional
    public void addInfo(InfoBean infoBean) {

        TransportInfo transportInfo = new TransportInfo();
        transportInfo.setCar_id(infoBean.getCar_id());
        transportInfo.setUser_id(infoBean.getUser_id());
        transportInfo.setGasoline_cost(infoBean.getGasoline_cost());
        transportInfo.setRoad_cost(infoBean.getRoad_cost());
        transportInfo.setFerry_cost(infoBean.getFerry_cost());
        transportInfo.setWeight(infoBean.getWeight());
        Date date = new Date();
        transportInfo.setCreate_date(date);
        transportInfo.setUpdate_date(date);
        int transprot_id = transportMapper.addInfo(transportInfo);


        Consigner consigner = new Consigner();
        consigner.setCount(infoBean.getCount());
        consigner.setStarting_place(infoBean.getStarting_place());
        consigner.setEnding_place(infoBean.getEnding_place());
        consigner.setState(0);
        consigner.setName(infoBean.getName());
        consigner.setPhone(infoBean.getPhone());
        consigner.setRemark(infoBean.getRemark());
        consigner.setCreate_date(date);
        consigner.setUpdate_date(date);
        consigner.setTransport_id(transprot_id);
    }

//    public Cost getMoneyCount(String carNumber) throws SQLException {
//        return transportMapper.getMoneyCount(carNumber);
//    }
//
//    public void updateLocation(TransportTrns transportTrns) throws SQLException {
//        transportMapper.updateLocation(transportTrns);
//    }
//
//    public TransportInfo findTransportByCarNumber(String carNumber) throws SQLException {
//        return null;
//    }
}
