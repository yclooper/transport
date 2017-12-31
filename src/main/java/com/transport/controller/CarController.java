package com.transport.controller;

import com.transport.entity.Car;
import com.transport.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by chen on 2017/12/28.
 */

@Controller
public class CarController {


    @Resource
    private CarService carService;

    @ResponseBody
    @RequestMapping(value = "/findCarByCarNumber")
    public Map<String, Object> findCarByCarNumber(String carNumber) {

        Car car = carService.findCarByCarNumber(carNumber);
        Map<String, Object> map = new HashMap<String, Object>();
        if (car == null) {
            map.put("code", 0);
        } else {
            map.put("code", 1);
            map.put("car_id", car.getId());
        }
        return map;
    }
}
