package com.transport.controller;

import com.transport.entity.Car;
import com.transport.entity.Result;
import com.transport.entity.User;
import com.transport.service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
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
            result.setMsg("获取数据失败");
            result.setCode(0);
            result.setData(0);
        }
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "/carLists")
    public Result<List<Car>> findAllCar() {
        Result<List<Car>> result = new Result<List<Car>>();

        try {
            List<Car> allCar = carService.findAllCar();
            result.setCode(1);
            result.setData(allCar);
        } catch (Exception e) {
            result.setCode(0);
            result.setMsg("获取数据失败");
        }
        return result;
    }

    @Transactional
    @ResponseBody
    @RequestMapping(value = "/addAndUpdateCar")
    public Result<String> addAndUpdateCar(@RequestBody Car car) {
        Result<String> result = new Result<String>();

        try {
            if (car.getId() != 0) {//修改
                carService.update(car);
            } else {
                carService.insert(car);
            }
            result.setCode(1);
            result.setMsg("操作成功");
        } catch (Exception e) {
            result.setCode(0);
            result.setMsg("操作失败");
        }
        return result;
    }

    @Transactional
    @ResponseBody
    @RequestMapping(value = "/deleteCar")
    public Result<String> deleteCar(int id) {
        Result<String> result = new Result<String>();

        try {
            carService.deleteCar(id);
            result.setCode(1);
            result.setMsg("操作成功");
        } catch (Exception e) {
            result.setCode(0);
            result.setMsg("操作失败");
        }
        return result;
    }

}
