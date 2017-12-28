package com.transport.controller;

import com.transport.entity.Car;
import com.transport.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by chen on 2017/12/28.
 */

@Controller
public class CarController {


    @Resource
    private CarService carService;

    @RequestMapping("/findCarByCarNumber")
    public @ResponseBody
    Car findCarByCarNumber(String carNumber) {

        Car car = carService.findCarByCarNumber(carNumber);
        return car;
    }
}
