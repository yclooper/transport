package com.transport.controller;

import com.transport.entity.Car;
import com.transport.entity.Result;
import com.transport.entity.User;
import com.transport.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    public Result<Integer> findCarByCarNumber(String carNumber) {

        Result<Integer> result = new Result<Integer>();
        try {
            Car car = carService.findCarByCarNumber(carNumber);
            result.setMsg("");
            result.setCode(1);
            result.setData(car.getId());
        } catch (Exception e) {
            e.printStackTrace();
            result.setMsg("获取数据失败");
            result.setCode(0);
            result.setData(0);
        }
        return result;
    }
}
