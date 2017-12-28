package com.transport.service;

import com.transport.entity.Car;

public interface CarService{

    Car findCarByCarNumber(String carNumber);
}
