package com.hjfruit.test.pitaya.app.base.warehouse;


import com.hjfruit.test.pitaya.app.PitayaAppBaseTest;
import com.hjfruit.test.pitaya.app.actions.base.store.StoreHouseAction;
import com.hjfruit.test.pitaya.app.entities.base.store.WarehouseInput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class StorehouseManagementTest extends PitayaAppBaseTest {
    @Autowired
    StoreHouseAction storeHouseAction;

    @Test
    @DisplayName("FLOW:创建-修改-删除")
    public void flow_create_update_delete() {
        //创建仓库
        WarehouseInput warehouseInput = new WarehouseInput();
        warehouseInput.setWarehouseName("[T]仓库名称");
        warehouseInput.setHouseNumber("[T]仓库门牌号");
        warehouseInput.setAddress("[T]仓库地址");
        warehouseInput.setRemark("[T]仓库备注");
        Integer warehouseId = storeHouseAction.insertWarehouse(warehouseInput);
        //修改仓库
        WarehouseInput warehouseUpdateInput = new WarehouseInput();
        warehouseUpdateInput.setWarehouseId(warehouseId);
        warehouseUpdateInput.setWarehouseName("[T]修改仓库名称");
        warehouseUpdateInput.setHouseNumber("[T]修改仓库门牌号");
        warehouseUpdateInput.setAddress("[T]修改仓库地址");
        warehouseUpdateInput.setRemark("[T]修改仓库备注");
        storeHouseAction.updateWarehouse(warehouseUpdateInput);
        //删除仓库
        storeHouseAction.deleteWarehouse(warehouseId);
    }
}
