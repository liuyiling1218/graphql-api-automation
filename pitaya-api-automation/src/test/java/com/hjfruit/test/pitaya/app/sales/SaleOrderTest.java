package com.hjfruit.test.pitaya.app.sales;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.saleorder.SaleOderAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SaleOrderTest extends PitayaAppBaseTestV2 {
    @Autowired
    SaleOderAction saleOderAction;

    @Test
    @DisplayName("创建成品销售订单")
    public void createSaleOrder(){
        saleOderAction.createSaleOrder();




        }



    }









