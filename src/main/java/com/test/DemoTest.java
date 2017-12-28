package com.test;

import com.transport.service.CarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration("classpath:spring-mybatis.xml")
public class DemoTest {

    @Resource
    private CarService carService;

    @Test
    public void fun1() {
        System.out.println(carService.findCarByCarNumber("12345").toString());
    }
}

