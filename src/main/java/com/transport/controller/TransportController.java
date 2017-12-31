package com.transport.controller;

import com.transport.entity.InfoBean;
import com.transport.service.TransportService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.sql.SQLException;
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

}
