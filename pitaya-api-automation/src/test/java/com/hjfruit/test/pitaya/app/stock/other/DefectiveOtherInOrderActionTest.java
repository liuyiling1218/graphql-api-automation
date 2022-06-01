package com.hjfruit.test.pitaya.app.stock.other;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.stock.other.OtherInOrderAction;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.app.helper.base.SupplierHelper;
import com.hjfruit.test.pitaya.app.helper.other.OtherInorderHelper;
import com.hjfruit.test.pitaya.app.helper.purchase.RayMeterialPurchaseInOrderHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DisplayName("其他入库")
public class DefectiveOtherInOrderActionTest extends PitayaAppBaseTestV2 {
    @Autowired
    OtherInOrderAction otherInOrderAction;
    @Autowired
    StoreHouseHelper storeHouseHelper;
    @Autowired
    SupplierHelper supplierHelper;
    @Autowired
    CommodityHelper commodityHelper;
    @Autowired
    CustomerHelper customerHelper;
    @Autowired
    RayMeterialPurchaseInOrderHelper rayMeterialPurchaseInOrderHelper;
    @Autowired
    OtherInorderHelper otherInorderHelper;

    @Nested
    @DisplayName("新增其他入库订单")
    class CreateTest {
        @Test
        @DisplayName("新增原料订单-编辑订单-提交库管-全部入库")
        public void test_create_success() {
//          otherInorderHelper.create(PitayaConstants.CommodityType.RAW_MATERIAL);
            otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.PRODUCT, PitayaConstants.CustomerType.NO_CUSTOMER);
        }

        @Test
        @DisplayName("备注超长，新增订单失败")
        public void test_create_failure() {

        }
    }

    @Nested
    @DisplayName("提交库管")
    class SubmitTest {
        @Test
        @DisplayName("提交库管正常")
        public void test_create_success() {



        }
    }

    @Nested
    @DisplayName("修改其他入库订单正常")
    class ModifyTest {
        @Test
        @DisplayName("提交库管正常")
        public void test_create_success() {

        }
    }

    @Nested
    @DisplayName("取消订单正常")
    class CancelTest {
        @Test
        @DisplayName("提交库管正常")
        public void test_create_success() {

        }
    }
}