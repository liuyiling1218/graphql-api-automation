package com.hjfruit.test.pitaya.app.helper.other;

import com.hjfruit.test.pitaya.app.actions.stock.other.OtherInOrderAction;
import com.hjfruit.test.pitaya.app.entities.commodity.CommoditySkuPayload;
import com.hjfruit.test.pitaya.app.entities.production.inorder.CreateOtherInOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.inorder.CreateOtherOrderItemInput;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.app.helper.base.SupplierHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class OtherInorderHelper {
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
    public String create(PitayaConstants.CommodityType commodityType) {
        //otherInOrderAction.createOtherInOrder(PitayaConstants.CommodityType.DEFECTIVE, PitayaConstants.CustomerType.NO_CUSTOMER, RandomStringUtils.random(200));
        CreateOtherInOrderInput createOtherInOrderInput = new CreateOtherInOrderInput();
        createOtherInOrderInput.setInOrderTypeId(PitayaConstants.InOrderType.OTHER_IN_APPLY.getTypeCode());
        createOtherInOrderInput.setCommodityTypeId(commodityType.getTypeId());
        createOtherInOrderInput.setWarehouseId(storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId());
        createOtherInOrderInput.setSupplierId(supplierHelper.supplierPages_getFirstAssitSupplier().getSupplierId());
        createOtherInOrderInput.setCustomerTypeId(PitayaConstants.CustomerType.NO_CUSTOMER.getCustomerTypeId());
        createOtherInOrderInput.setInOrderDescription(RandomStringUtils.random(200));
        List<CreateOtherOrderItemInput> createOtherOrderItemInputs = new ArrayList<>();
//List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.ASSIST, PitayaConstants.CommoditySkuType.SINGLE_UNIT, 2);
        if (Arrays.asList(PitayaConstants.CommodityType.ASSIST,PitayaConstants.CommodityType.DEFECTIVE,PitayaConstants.CommodityType.BOX).contains(commodityType)) {
            List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(commodityType, PitayaConstants.CommoditySkuType.SINGLE_UNIT, 2);
            for (CommoditySkuPayload commoditySkuPayload : commoditySkues) {
                CreateOtherOrderItemInput createOtherOrderItemInput = new CreateOtherOrderItemInput();
                createOtherOrderItemInput.setCommoditySkuId(commoditySkuPayload.getCommoditySkuId());
                createOtherOrderItemInput.setTotalPrice(new BigDecimal(100));
                createOtherOrderItemInput.setUnitQuantity(new BigDecimal(100.11));
//                createOtherOrderItemInput.setTotalQuantity(new BigDecimal(100.22));
                createOtherOrderItemInput.setUnitPrice(new BigDecimal(10.22));
                createOtherOrderItemInput.setUnitPriceType(commoditySkuPayload.getUnitType());
                createOtherOrderItemInputs.add(createOtherOrderItemInput);
            }
            createOtherInOrderInput.setCommodities(createOtherOrderItemInputs);
        }else {
            List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(commodityType, PitayaConstants.CommoditySkuType.DOUBLE_UNIT, 2);
            for (CommoditySkuPayload commoditySkuPayload : commoditySkues) {
                CreateOtherOrderItemInput createOtherOrderItemInput = new CreateOtherOrderItemInput();
                createOtherOrderItemInput.setCommoditySkuId(commoditySkuPayload.getCommoditySkuId());
                createOtherOrderItemInput.setTotalPrice(new BigDecimal(100));
                createOtherOrderItemInput.setUnitQuantity(new BigDecimal(100.11));
                createOtherOrderItemInput.setTotalQuantity(new BigDecimal(100.22));
                createOtherOrderItemInput.setUnitPrice(new BigDecimal(10.22));
                createOtherOrderItemInput.setUnitPriceType(commoditySkuPayload.getUnitType());
                createOtherOrderItemInputs.add(createOtherOrderItemInput);
            }
            createOtherInOrderInput.setCommodities(createOtherOrderItemInputs);

        }
//            createOtherInOrderInput.setCommodities(commodityHelper.getCommoditySkues(commodityType, PitayaConstants.CommoditySkuType.SINGLE_UNIT, 2).stream().map(o ->
//            {
//                CreateOtherOrderItemInput createOtherOrderItemInput = new CreateOtherOrderItemInput();
//                createOtherOrderItemInput.setCommoditySkuId(o.getCommoditySkuId());
//                createOtherOrderItemInput.setUnitQuantity(new BigDecimal(100.11));
//                createOtherOrderItemInput.setTotalQuantity(new BigDecimal(100.22));
//                createOtherOrderItemInput.setUnitPrice(new BigDecimal(10.22));
//                createOtherOrderItemInput.setUnitPriceType(o.getUnitType());
//                return createOtherOrderItemInput;
//            }).collect(Collectors.toList()));
        return otherInOrderAction.createOtherInOrder(createOtherInOrderInput);


    }






}
