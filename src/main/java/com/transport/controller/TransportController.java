package com.transport.controller;

import com.transport.entity.*;
import com.transport.service.ConsignerService;
import com.transport.service.TransportService;
import com.transport.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;

/**
 * Created by chen on 2017/12/30.
 */

@Controller
public class TransportController {

    @Resource
    private TransportService transportService;

    @Resource
    private ConsignerService consignerService;

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/findListInfo")
    public Map<String, Object> findInfoBeanList(int car_id, int page) {

        Map map = new HashMap<String, Object>();

        try {
            List<InfoBean> infoBeans = transportService.findTransportListInfoByCarId(car_id, page);
            map.put("list", infoBeans == null ? new ArrayList<InfoBean>() : infoBeans);
            map.put("code", 1);
        } catch (Exception e) {
            map.put("code", 0);
            map.put("code", new ArrayList<InfoBean>());
        }

        return map;
    }


    @Transactional
    @ResponseBody
    @RequestMapping(value = "/addAndEditInfoServlet")
    public Result<String> insert(@RequestBody InfoBean infoBean) {

        Result<String> result = new Result<String>();

        try {
            TransportInfo transportInfo = new TransportInfo();
            Consigner consigner = new Consigner();
            if (infoBean.getType() == 1) {//新增
                transportInfo.setCar_id(infoBean.getCar_id());

                User driver = userService.findUserByName(infoBean.getUser_name());

                if (driver != null) {
                    transportInfo.setUser_id(driver.getId());
                }
                transportInfo.setGasoline_cost(infoBean.getGasoline_cost());
                transportInfo.setRoad_cost(infoBean.getRoad_cost());
                transportInfo.setFerry_cost(infoBean.getFerry_cost());
                transportInfo.setWeight(infoBean.getWeight());
                transportInfo.setState(infoBean.getState());
                transportService.insert(transportInfo);


                consigner.setCount(infoBean.getCount());
                consigner.setStarting_place(infoBean.getStarting_place());
                consigner.setEnding_place(infoBean.getEnding_place());
                consigner.setState(0);
                consigner.setName(infoBean.getName());
                consigner.setPhone(infoBean.getPhone());
                consigner.setRemark(infoBean.getRemark());
                consigner.setTransport_id(transportInfo.getId());
                consignerService.insert(consigner);

                result.setCode(1);
                result.setMsg("");
            } else if (infoBean.getType() == 2) {//修改
                transportInfo.setId(infoBean.getId());
                transportInfo.setState(infoBean.getState());

                transportService.update(transportInfo);

                consigner.setTransport_id(infoBean.getId());
                consigner.setRemark(infoBean.getRemark());
                consignerService.update(consigner);

                result.setCode(1);
                result.setMsg("");
            }
        } catch (Exception e) {
            result.setCode(0);
            result.setData("操作失败");
            result.setMsg("操作失败");
        }

        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/countMoney")
    public Cost countMoney(int carId) {
        Cost cost = null;
        try {
            cost = transportService.calCost(carId);
            cost.setCode(1);
        } catch (Exception e) {
            cost = new Cost();
            cost.setCode(0);
        }
        return cost;
    }

    @ResponseBody
    @RequestMapping(value = "/costMoney")
    public TransportInfo calCost(int carId) {
        return transportService.findTransportInfoByCarId(carId);
    }

    @ResponseBody
    @RequestMapping(value = "/updateLocation")
    public Result<String> updateLocation(int carId, String location) {
        Result<String> result = new Result<String>();
        try {
            transportService.updateLocation(carId, location);
            result.setCode(1);
        } catch (Exception e) {
            result.setMsg("更新失败");
            result.setCode(0);
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/updateCost")
    public Result<String> updateCost(@RequestBody TransportInfo transportInfo) {
        Result<String> result = new Result<String>();
        try {
            transportService.updateCost(transportInfo);
            result.setCode(1);
        } catch (Exception e) {
            result.setCode(0);
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/findListInfoByState")
    public Result<List<InfoBean>> getInfo(int state, int page) {
        Result<List<InfoBean>> result = new Result<List<InfoBean>>();
        try {
            List<InfoBean> infoListByState = transportService.findInfoListByState(state == 1 ? 2 : state, page);
            result.setCode(1);
            result.setMsg("");
            result.setData(infoListByState);
        } catch (Exception e) {
            result.setCode(0);
            result.setMsg("获取数据失败");
        }

        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/findAdreesList")
    public Result<List<TransportTrns>> getAddressList(int id) {
        Result<List<TransportTrns>> result = new Result<List<TransportTrns>>();
        try {
            List<TransportTrns> addressList = transportService.findAddressList(id);
            result.setData(addressList);
            result.setCode(1);
            result.setMsg("");
        } catch (Exception e) {
            result.setData(new ArrayList<TransportTrns>());
            result.setCode(0);
            result.setMsg("获取数据失败");
        }

        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/findInfoBeanByCarId")
    public Result<InfoBean> findInfoBeanByCarId(int carId) {
        Result<InfoBean> result = new Result<InfoBean>();
        try {
            InfoBean infoBean = transportService.findInfoBeanByCarId(carId);
            result.setCode(1);
            result.setData(infoBean);
        } catch (Exception e) {
            e.printStackTrace();
            result.setCode(0);
            result.setMsg("请求失败");
        }
        return result;
    }
}
