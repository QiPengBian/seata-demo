package com.bluemoon.provider.service.impl;

import com.bluemoon.provider.domain.TbOrderItem;
import javax.annotation.Resource;
import com.bluemoon.provider.mapper.TbOrderItemMapper;
import com.bluemoon.provider.service.api.TbOrderItemService;
import org.apache.dubbo.config.annotation.Service;

@Service(version="1.0.0")
public class TbOrderItemServiceImpl implements TbOrderItemService{

    @Resource
    private TbOrderItemMapper tbOrderItemMapper;

    @Override
    public void insert(TbOrderItem tbOrderItem) {
        tbOrderItemMapper.insert(tbOrderItem);
    }
}
