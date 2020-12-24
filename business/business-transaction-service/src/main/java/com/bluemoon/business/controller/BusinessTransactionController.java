package com.bluemoon.business.controller;

import com.bluemoon.provider.domain.TbOrder;
import com.bluemoon.provider.domain.TbOrderItem;
import com.bluemoon.provider.service.api.ProviderTransactionService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "transaction")
public class BusinessTransactionController {

    @Reference(version = "1.0.0")
    private ProviderTransactionService providerTransactionService;

    @GetMapping(value = "create/order/{userId}")
    public String createOrder(@PathVariable Long userId) {
        TbOrder tbOrder = new TbOrder();
        tbOrder.setOrderId(userId);
        tbOrder.setUserId(userId);

        TbOrderItem tbOrderItem = new TbOrderItem();
        tbOrderItem.setOrderId(userId);
        tbOrderItem.setOrderItemId(userId);
        tbOrderItem.setUserId(userId);

        providerTransactionService.createOrder(tbOrder, tbOrderItem);
        return "ok";
    }
}
