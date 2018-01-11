package com.transport.service.impl;

import com.transport.dao.CarMapper;
import com.transport.entity.Car;
import com.transport.service.CarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Resource
    private CarMapper carMapper;

    public Car findCarByCarNumber(String carNumber) {

        return carMapper.findCarByCarNumber(carNumber);
    }

    public List<Car> findAllCar() {
        return carMapper.findAllCar();
    }

    public void insert(Car car) {
        carMapper.insert(car);
    }

    public void update(Car car) {
        carMapper.update(car);
    }

}
