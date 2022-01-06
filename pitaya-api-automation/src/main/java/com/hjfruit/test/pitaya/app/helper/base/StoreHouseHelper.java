package com.hjfruit.test.pitaya.app.helper.base;

import com.hjfruit.test.pitaya.app.apis.base.store.StorehouseApi;
import com.hjfruit.test.pitaya.app.entities.base.store.WarehousePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StoreHouseHelper {
    @Autowired
    StorehouseApi storehouseApi;


    /**
     * 获取所属仓库
     *
     * @return
     */
    public List<WarehousePayload> userWarehouse() {
        return storehouseApi.userWarehouse();
    }

    /**
     * 获取第一个仓库
     *
     * @return
     */
    public WarehousePayload userWarehouse_getFirstWarehouse() {
        return userWarehouse().get(0);
    }


}
