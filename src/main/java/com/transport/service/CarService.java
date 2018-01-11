package com.transport.service;

import com.transport.entity.Car;

import java.util.List;

public interface CarService{

    Car findCarByCarNumber(String carNumber);

    List<Car> findAllCar();

    void insert(Car car);

    void update(Car car);

    void deleteCar(int id);
}
