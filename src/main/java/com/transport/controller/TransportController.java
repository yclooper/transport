package com.transport.controller;

import com.transport.entity.Consigner;
import com.transport.entity.InfoBean;
import com.transport.entity.TransportInfo;
import com.transport.entity.User;
import com.transport.service.ConsignerService;
import com.transport.service.TransportService;
import com.transport.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public Map<String, Object> findInfoBeanList(int car_id) throws SQLException {

        Map map = new HashMap<String, Object>();
        List<InfoBean> infoBeans = transportService.findTransportListInfoByCarId(car_id);

        if (infoBeans != null) {
            map.put("list", infoBeans);
            map.put("code", 1);
        } else {
            map.put("code", 0);
        }
        return map;
    }


    @Transactional
    @ResponseBody
    @RequestMapping(value = "/addAndEditInfoServlet")
    public Map<String, Object> insert(@RequestBody InfoBean infoBean) {
        Map<String, Object> map = new HashMap<String, Object>();

        try {
            TransportInfo transportInfo = new TransportInfo();
            Date date = new Date();
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
                transportInfo.setCreate_date(date);
                transportInfo.setUpdate_date(date);
                transportInfo.setState(infoBean.getState());
                transportService.insert(transportInfo);


                consigner.setCount(infoBean.getCount());
                consigner.setStarting_place(infoBean.getStarting_place());
                consigner.setEnding_place(infoBean.getEnding_place());
                consigner.setState(0);
                consigner.setName(infoBean.getName());
                consigner.setPhone(infoBean.getPhone());
                consigner.setRemark(infoBean.getRemark());
                consigner.setCreate_date(date);
                consigner.setUpdate_date(date);
                consigner.setTransport_id(transportInfo.getId());
                consignerService.insert(consigner);

                map.put("code", 1);

            } else if (infoBean.getType() == 2) {//修改
                transportInfo.setId(infoBean.getId());
                transportInfo.setState(infoBean.getState());
                transportInfo.setUpdate_date(date);

                transportService.update(transportInfo);


                consigner.setUpdate_date(date);
                consigner.setTransport_id(infoBean.getId());
                consigner.setRemark(infoBean.getRemark());
                consignerService.update(consigner);

                map.put("code", 1);
            }
        } catch (Exception e) {
            map.put("code", 0);
        }

        return map;
    }
}
