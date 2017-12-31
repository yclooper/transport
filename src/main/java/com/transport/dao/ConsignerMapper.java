package com.transport.dao;

import com.transport.entity.Consigner;

/**
 * Created by chen on 2017/12/30.
 */
public interface ConsignerMapper {

    public Consigner findConsignerByTransportId(int tspId);

    public void insert(Consigner consigner);

    public void update(Consigner consigner);
}
