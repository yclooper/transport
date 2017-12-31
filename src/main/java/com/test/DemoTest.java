package com.test;

import com.transport.entity.InfoBean;
import com.transport.entity.TransportInfo;
import com.transport.service.CarService;
import com.transport.service.TransportService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration("classpath:spring-mybatis.xml")
public class DemoTest {

    @Resource
    private CarService carService;

    @Resource
    private TransportService transportService;

    @Test
    public void fun1() {
        System.out.println(carService.findCarByCarNumber("12345").toString());
    }

    @Test
    public void fun2() throws SQLException {
        List<InfoBean> transportListInfoByCarId = transportService.findTransportListInfoByCarId(1);
        for (int i = 0; i < transportListInfoByCarId.size(); i++) {
            System.out.println(transportListInfoByCarId.get(i));
        }

    }
}

