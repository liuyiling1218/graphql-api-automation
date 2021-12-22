package com.hjfruit.test.pitaya.app.purchase;

import com.hjfruit.test.pitaya.actions.production.inorder.PurchaseOrderAction;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @description {}
 * @Author 吴随伟
 * @date 2021/12/22
 */
public class PurchaseOrderTest extends PitayaAppBaseTest {
    @Autowired
    PurchaseOrderAction purchaseOrderAction;

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    @DisplayName("新增采购-取消订单")
    public void testCreatePurchase2CacelOrder() {
//        purchaseOrderAction.insertPurchase();
//        purchaseOrderAction.cancelPurchase();

//        jdbcTemplate.queryForList("select user_id from user where id =1", Integer.class);
    }
}
