package com.hjfruit.test.pitaya.app.actions.base.store;

import com.hjfruit.test.pitaya.app.apis.base.store.StorehouseApi;
import com.hjfruit.test.pitaya.app.entities.base.store.WarehouseInput;
import com.hjfruit.test.pitaya.app.entities.base.store.WarehousePayload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Component
public class StoreHouseAction {
    @Autowired
    StorehouseApi storehouseApi;

    /**
     * 获取仓库列表
     *
     * @return
     */
    public List<WarehousePayload> listWarehouse() {
        return storehouseApi.listWarehouse();
    }

    /**
     * 获取用户仓库
     *
     * @return
     */
    public List<WarehousePayload> userWarehouse() {
        return storehouseApi.userWarehouse();
    }

    /**
     * 获取仓库详情
     *
     * @param warehouseId
     * @return
     */
    public WarehousePayload warehouse(String warehouseId) {
        return storehouseApi.warehouse(warehouseId);
    }

    /**
     * 新增仓库
     *
     * @param warehouseInput
     * @return
     */
    public String insertWarehouse(WarehouseInput warehouseInput) {
        String id = storehouseApi.insertWarehouse(warehouseInput);
        /*
         * 断言：列表中正常展示已新增仓库
         */
        assertThat(listWarehouse().get(0).getWarehouseName()).isEqualTo(warehouseInput.getWarehouseName());
        return id;
    }

    /**
     * 修改仓库
     *
     * @param warehouseInput
     * @return
     */
    public String updateWarehouse(WarehouseInput warehouseInput) {
        String id = storehouseApi.updateWarehouse(warehouseInput);
        /**
         * 断言：列表中的数据显示正常
         */
        String warehouseName = listWarehouse().get(0).getWarehouseName();
        assertThat(warehouseName).isEqualTo(warehouseInput.getWarehouseName());
        /*
         * 断言: 详情仓库名称正常
         */
        WarehousePayload warehousePayload = warehouse(warehouseInput.getWarehouseId());
        assertThat(warehousePayload.getWarehouseName()).isEqualTo(warehouseInput.getWarehouseName());
        return id;
    }

    /**
     * 删除仓库
     *
     * @param warehouseId
     * @return
     */
    public String deleteWarehouse(String warehouseId) {
        String id = storehouseApi.deleteWarehouse(warehouseId);
        /*
         * 断言：列表无相关数据
         */
        List<WarehousePayload> warehousePayloads = listWarehouse();
        assertThat(warehousePayloads.stream().allMatch(o -> o.getWarehouseId().equals(warehouseId))).isFalse();
        return id;
    }


}
