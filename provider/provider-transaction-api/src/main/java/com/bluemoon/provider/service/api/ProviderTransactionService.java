package com.bluemoon.provider.service.api;

import com.bluemoon.provider.domain.TbOrder;
import com.bluemoon.provider.domain.TbOrderItem;

public interface ProviderTransactionService {

    void createOrder(TbOrder tbOrder, TbOrderItem tbOrderItem);

}
