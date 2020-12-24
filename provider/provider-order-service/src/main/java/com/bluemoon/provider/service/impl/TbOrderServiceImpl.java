package com.bluemoon.provider.service.impl;

import com.bluemoon.provider.domain.TbOrder;
import javax.annotation.Resource;
import com.bluemoon.provider.mapper.TbOrderMapper;
import com.bluemoon.provider.service.api.TbOrderService;
import org.apache.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class TbOrderServiceImpl implements TbOrderService{

    @Resource
    private TbOrderMapper tbOrderMapper;

    @Override
    public void insert(TbOrder tbOrder) {
        tbOrderMapper.insert(tbOrder);
    }
}
