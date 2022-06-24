package com.hjfruit.test.pitaya.app.stock.other;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.production.inorder.InOrderAuditAction;
import com.hjfruit.test.pitaya.app.actions.stock.other.OtherInOrderAction;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.app.helper.base.SupplierHelper;
import com.hjfruit.test.pitaya.app.helper.purchase.InOrderHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
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
    InOrderHelper inOrderHelper;
    @Autowired
    InOrderAuditAction inOrderAuditAction;

        @Test
        @DisplayName("新增原料订单-提交库管-驳回订单-再次提交库管-全部入库")
        public void test_create_raw_material() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            inOrderHelper.rejectedInOrder(otherInOrder);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            inOrderHelper.otherInOrder(otherInOrder);
        }
        @Test
        @DisplayName("新增原料订单-编辑订单（删除其中一个SKU）-提交库管-全部入库")
        public void test_create_raw_material_update() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.modifyOtherInOrder(otherInOrder, "删除其中一个sku");
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            inOrderHelper.otherInOrder(otherInOrder);
        }
        @Test
        @DisplayName("新增辅料订单-修改订单-提交库管-全部入库")
        public void test_create_Accessories() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.ASSIST, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.modifyOtherInOrder(otherInOrder);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            inOrderHelper.otherInOrder(otherInOrder);
        }
        @Test
        @DisplayName("新增成品订单-修改订单-提交库管-全部入库")
        public void test_create_product() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.PRODUCT, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.modifyOtherInOrder(otherInOrder);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            inOrderHelper.otherInOrder(otherInOrder);
        }
        @Test
        @DisplayName("新增半成品订单-修改订单-提交库管-全部入库")
        public void test_create_half_product() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.HALF_PRODUCT, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.modifyOtherInOrder(otherInOrder);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            inOrderHelper.otherInOrder(otherInOrder);
        }
        @Test
        @DisplayName("新增次品订单-修改订单-提交库管-全部入库")
        public void test_create_defective() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.DEFECTIVE, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.modifyOtherInOrder(otherInOrder);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            inOrderHelper.otherInOrder(otherInOrder);
        }
        @Test
        @DisplayName("新增退货品订单-修改订单-提交库管-全部入库")
        public void test_create_return() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.REBACK, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.modifyOtherInOrder(otherInOrder);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            inOrderHelper.otherInOrder(otherInOrder);
        }
        @Test
        @DisplayName("新增周转筐订单-修改订单-提交库管-全部入库")
        public void test_create_box() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.BOX, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.modifyOtherInOrder(otherInOrder);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            inOrderHelper.otherInOrder(otherInOrder);
        }
        @Test
        @DisplayName("新增订单-取消订单")
        public void test_create_cancel() {
            otherInOrderAction.cancelOtherInOrder();
        }
        @Test
        @DisplayName("新增原料订单-提交订单-驳回订单-取消订单")
        public void test_turn_down_cancel() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            inOrderHelper.rejectedInOrder(otherInOrder);
            otherInOrderAction.cancelOtherInOrder(otherInOrder);
        }
        @Test
        @DisplayName("新增原料订单-提交订单-部分入库-完成入库")
        public void test_Partial_storage_complete() {
            String otherInOrder = otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.CustomerType.NO_CUSTOMER);
            otherInOrderAction.submitOtherInOrder(otherInOrder);
            inOrderHelper.otherInOrderPartIn(otherInOrder);
            inOrderAuditAction.finishInbound(otherInOrder);

        }
    }

