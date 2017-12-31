package com.transport.service.impl;

import com.transport.dao.ConsignerMapper;
import com.transport.entity.Consigner;
import com.transport.service.ConsignerService;

import javax.annotation.Resource;

/**
 * Created by chen on 2017/12/31.
 */
public class ConsignerServiceImpl implements ConsignerService {

    @Resource
    private ConsignerMapper consignerMapper;

    public Consigner findConsignerByTransportId(int tspId) {
        return consignerMapper.findConsignerByTransportId(tspId);
    }

    public void addTransportConsignerInfo(Consigner consigner) {
        consignerMapper.insert(consigner);
    }

    public void update(Consigner consigner) {
        consignerMapper.update(consigner);
    }
}
