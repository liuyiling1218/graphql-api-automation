package com.hjfruit.test.pitaya.app.stock.other;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.stock.other.OtherInOrderAction;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.app.helper.base.SupplierHelper;
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
    @Nested
    @DisplayName("新增其他入库订单")
    class CreateTest {
        @Test
        @DisplayName("新增原料订单-编辑订单-提交库管-全部入库")
        public void test_create_raw_material() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            rayMeterialPurchaseInOrderHelper.rejectedInOrder(otherInOrder);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            rayMeterialPurchaseInOrderHelper.otherInOrder(otherInOrder);
        }

        @Test
        @DisplayName("新增辅料订单")
        public void test_create_Accessories() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.ASSIST, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            rayMeterialPurchaseInOrderHelper.otherInOrder(otherInOrder);
        }
        @Test
        @DisplayName("新增成品订单")
        public void test_create_product() {

            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.PRODUCT, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            rayMeterialPurchaseInOrderHelper.otherInOrder(otherInOrder);
        }
        @Test
        @DisplayName("新增半成品订单")
        public void test_create_half_product() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.HALF_PRODUCT, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            rayMeterialPurchaseInOrderHelper.otherInOrder(otherInOrder);
        }

        @Test
        @DisplayName("新增次品订单")
        public void test_create_defective() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.DEFECTIVE, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            rayMeterialPurchaseInOrderHelper.otherInOrder(otherInOrder);
        }

        @Test
        @DisplayName("新增退货品订单")
        public void test_create_return() {

            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.REBACK, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            rayMeterialPurchaseInOrderHelper.otherInOrder(otherInOrder);
        }

        @Test
        @DisplayName("新增周转筐订单")
        public void test_create_box() {

            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.BOX, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            rayMeterialPurchaseInOrderHelper.otherInOrder(otherInOrder);

        }
        @Test
        @DisplayName("新增订单-取消订单")
        public void test_create_Cancel(){
            otherInOrderAction.cancelOtherInOrder();
        }

    }
}
   /* @Nested
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
    }*/
