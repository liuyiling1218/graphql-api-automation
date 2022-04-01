package com.hjfruit.test.pitaya.app.stock.other;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTest;
import com.hjfruit.test.pitaya.app.actions.stock.other.OtherInOrderAction;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.app.helper.base.SupplierHelper;
import com.hjfruit.test.pitaya.app.entities.commodity.CommoditySkuPayload;
import com.hjfruit.test.pitaya.app.entities.production.inorder.CreateOtherInOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.inorder.CreateOtherOrderItemInput;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@DisplayName("其他入库")
public class DefectiveOtherInOrderActionTest extends PitayaAppBaseTest {
    @Autowired
    OtherInOrderAction otherInOrderAction;
    @Autowired
    StoreHouseHelper storeHouseHelper;
    @Autowired
    SupplierHelper supplierHelper;
    @Autowired
    CommodityHelper commodityHelper;

    @Nested
    @DisplayName("新增其他入库订单")
    class CreateTest {
        @Test
        @DisplayName("新增订单正常")
        public void test_create_success() {
//            otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.DEFECTIVE, PitayaConstants.CustomerType.NO_CUSTOMER, RandomStringUtils.random(200));
            CreateOtherInOrderInput createOtherInOrderInput = new CreateOtherInOrderInput();
            createOtherInOrderInput.setInOrderTypeId(PitayaConstants.InOrderType.OTHER_IN_APPLY.getTypeCode());
            createOtherInOrderInput.setCommodityTypeId(PitayaConstants.CommodityType.ASSIST.getTypeId());
            createOtherInOrderInput.setWarehouseId(storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId());
            createOtherInOrderInput.setSupplierId(supplierHelper.supplierPages_getFirstAssitSupplier().getSupplierId());
            createOtherInOrderInput.setCustomerTypeId(PitayaConstants.CustomerType.NO_CUSTOMER.getCustomerTypeId());
            createOtherInOrderInput.setInOrderDescription(RandomStringUtils.random(200));
            List<CreateOtherOrderItemInput> createOtherOrderItemInputs = new ArrayList<>();
            List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.ASSIST, PitayaConstants.CommoditySkuType.SINGLE_UNIT, 2);
            for (CommoditySkuPayload commoditySkuPayload : commoditySkues) {
                CreateOtherOrderItemInput createOtherOrderItemInput = new CreateOtherOrderItemInput();
                createOtherOrderItemInput.setCommoditySkuId(commoditySkuPayload.getCommoditySkuId());
                createOtherOrderItemInput.setUnitQuantity(new BigDecimal(100.11));
//                createOtherOrderItemInput.setTotalQuantity(new BigDecimal(100.22));
                createOtherOrderItemInput.setUnitPrice(new BigDecimal(10.22));
                createOtherOrderItemInput.setUnitPriceType(commoditySkuPayload.getUnitType());
                createOtherOrderItemInputs.add(createOtherOrderItemInput);
            }

            createOtherInOrderInput.setCommodities(createOtherOrderItemInputs);


            createOtherInOrderInput.setCommodities(commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.ASSIST, PitayaConstants.CommoditySkuType.SINGLE_UNIT, 2).stream().map(o ->
            {
                CreateOtherOrderItemInput createOtherOrderItemInput = new CreateOtherOrderItemInput();
                createOtherOrderItemInput.setCommoditySkuId(o.getCommoditySkuId());
                createOtherOrderItemInput.setUnitQuantity(new BigDecimal(100.11));
//                createOtherOrderItemInput.setTotalQuantity(new BigDecimal(100.22));
                createOtherOrderItemInput.setUnitPrice(new BigDecimal(10.22));
                createOtherOrderItemInput.setUnitPriceType(o.getUnitType());
                return createOtherOrderItemInput;
            }).collect(Collectors.toList()));

            otherInOrderAction.createOtherInOrder(createOtherInOrderInput);
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