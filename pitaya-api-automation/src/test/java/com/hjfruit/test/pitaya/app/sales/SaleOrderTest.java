package com.hjfruit.test.pitaya.app.sales;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.saleorder.SaleOderAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
@DisplayName("成品销售相关流程")
public class SaleOrderTest extends PitayaAppBaseTestV2 {
    @Autowired
    SaleOderAction saleOderAction;
    @Test
    @DisplayName("创建成品销售订单-提交生产-撤销生产")
    public void createSaleOrder_submit_undo() {
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
        saleOderAction.undoSaleOrder(saleOrder);
    }

    @Test
    @DisplayName("创建成品销售订单-再来一单")
    public void create_submit_copy() {
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.copySaleOrder(saleOrder);
    }

    @Test
    @DisplayName("创建成品销售订单-取消订单")
    public void create_cancel() {
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.cancelSaleOrder(saleOrder);
    }

    @Test
    @DisplayName("创建成品销售订单-修改订单")
    public void create_update() {
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.updateSaleOrder(saleOrder);
    }

    @Test
    @DisplayName("创建成品销售订单-提交生产")
    public void create_submit() {
        String saleOrder = saleOderAction.createSaleOrder();
        saleOderAction.submitSaleOrder(saleOrder);
    }


}



