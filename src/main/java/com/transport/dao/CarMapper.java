package com.transport.dao;

import com.transport.entity.Car;

public interface CarMapper {

    Car findCarByCarNumber(String carNumber);
}
