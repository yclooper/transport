package com.transport.dao;

import com.transport.entity.Car;

import java.util.List;

public interface CarMapper {

    Car findCarByCarNumber(String carNumber);

    List<Car> findAllCar();

    void insert(Car car);

    void update(Car car);
}
