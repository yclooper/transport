package com.transport.service.impl;

import com.transport.dao.ConsignerMapper;
import com.transport.dao.TransportMapper;
import com.transport.dao.UserMapper;
import com.transport.entity.*;
import com.transport.service.TransportService;
import com.transport.service.UserService;
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

    public List<InfoBean> findTransportListInfoByCarId(int car_id,int page){
        int count = transportMapper.getCount(car_id);
        PageBean pageBean = new PageBean(page, count);
        List<InfoBean> list = transportMapper.findTransportListInfoByCarId(car_id, pageBean.getCurrentCount(), pageBean.getPageNum());
        return list;
    }

    public int getCount(int carId) {
        return transportMapper.getCount(carId);
    }


    //    public int getCount(int carId) throws SQLException {
//        return transportMapper.getCount(carId);
//    }
//
    public void update(TransportInfo transportInfo) {
        transportMapper.update(transportInfo);
    }

    public int insert(TransportInfo transportInfo) {

        return transportMapper.insert(transportInfo);
    }

    public Cost calCost(int carId) {
        return transportMapper.countCost(carId);
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
