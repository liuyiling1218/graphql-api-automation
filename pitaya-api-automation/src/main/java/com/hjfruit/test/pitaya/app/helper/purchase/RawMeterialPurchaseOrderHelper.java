package com.hjfruit.test.pitaya.app.helper.purchase;

import com.hjfruit.test.pitaya.app.actions.production.inorder.AcquireOrderAction;
import com.hjfruit.test.pitaya.app.entities.base.customer.CustomerPayload;
import com.hjfruit.test.pitaya.app.entities.commodity.CommoditySkuPayload;
import com.hjfruit.test.pitaya.app.entities.production.inorder.CreateAcquireInput;
import com.hjfruit.test.pitaya.app.entities.production.inorder.CreateAcquireItemInput;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.app.helper.base.SupplierHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 原料采购
 */
@Component
public class RawMeterialPurchaseOrderHelper {
    @Autowired
    AcquireOrderAction acquireOrderAction;
    @Autowired
    StoreHouseHelper storeHouseHelper;
    @Autowired
    SupplierHelper supplierHelper;
    @Autowired
    CommodityHelper commodityHelper;
    @Autowired
    CustomerHelper customerHelper;


    public void create(PitayaConstants.SupplierType supplierType, PitayaConstants.CustomerType customerType, String remark) {
        CreateAcquireInput createAcquireInput = new CreateAcquireInput();
        createAcquireInput.setCommodityType(PitayaConstants.CommodityType.RAW_MATERIAL.getTypeId());
        createAcquireInput.setWarehouseId(storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId());
        createAcquireInput.setSupplierId(supplierHelper.supplierPages_getFirstFoodAndFruitSupplier().getSupplierId());
        CustomerPayload customerPayload = customerHelper.allListCustomer_getFirstCustomer();
        createAcquireInput.setBelongType(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER.getCustomerTypeId());
        createAcquireInput.setBelongId(customerHelper.allListCustomer_getFirstCustomer().getCustomerId());
        createAcquireInput.setNote(remark);

        List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.RAW_MATERIAL, 2);
        createAcquireInput.setCommodities(commoditySkues.stream().map(o ->
        {
            CreateAcquireItemInput createAcquireItemInput = new CreateAcquireItemInput();
            createAcquireItemInput.setSkuId(o.getCommoditySkuId());
            createAcquireItemInput.setPricePosition(10);
            createAcquireItemInput.setPrice(new BigDecimal(10.22));
            createAcquireItemInput.setPriceType(o.getUnitType());
            createAcquireItemInput.setUnitQuantity(o.getUnitQuantity());
            createAcquireItemInput.setUnitType(o.getUnitType());
            createAcquireItemInput.setTotalQuantity(o.getTotalQuantity());
            createAcquireItemInput.setTotalType(o.getTotalType());
            return createAcquireItemInput;
        }).collect(Collectors.toList()));
        createAcquireInput.setCosts(null);
        acquireOrderAction.createAcquire(createAcquireInput);
    }
}
