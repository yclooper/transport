package com.transport.service;

import com.transport.entity.Consigner;

/**
 * Created by chen on 2017/12/31.
 */
public interface ConsignerService {

    public Consigner findConsignerByTransportId(int tspId);

    public void addTransportConsignerInfo(Consigner consigner);

    public void update(Consigner consigner);
}
