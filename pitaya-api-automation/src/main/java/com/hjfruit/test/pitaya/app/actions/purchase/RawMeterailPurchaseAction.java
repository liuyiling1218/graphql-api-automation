package com.hjfruit.test.pitaya.app.actions.purchase;

import com.hjfruit.test.pitaya.app.apis.production.inorder.AcquireOrderApi;
import com.hjfruit.test.pitaya.app.entities.base.customer.CustomerPayload;
import com.hjfruit.test.pitaya.app.entities.commodity.CommoditySkuPayload;
import com.hjfruit.test.pitaya.app.entities.production.inorder.CreateAcquireInput;
import com.hjfruit.test.pitaya.app.entities.production.inorder.CreateAcquireItemInput;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class RawMeterailPurchaseAction {
    @Autowired
    AcquireOrderApi acquireOrderApi;
    @Autowired
    com.hjfruit.test.pitaya.app.actions.base.supplier.SupplierAction supplierAction;
    @Autowired
    StoreHouseHelper storeHouseHelper;
    @Autowired
    CustomerHelper customerHelper;
    @Autowired
    CommodityHelper commodityHelper;

    /**
     * 创建采购订单——默认
     *
     * @return
     */
    public String create() {
        CreateAcquireInput createAcquireInput = new CreateAcquireInput();
        createAcquireInput.setCommodityType(PitayaConstants.CommodityType.RAW_MATERIAL.getTypeId());
        createAcquireInput.setWarehouseId(storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId());
//        createAcquireInput.setSupplierId(.().getSupplierId());
        CustomerPayload customerPayload = customerHelper.allListCustomer_getFirstCustomer();
        createAcquireInput.setBelongType(customerPayload.getCustomerGroupId());
        createAcquireInput.setBelongId(customerPayload.getCustomerId());
        createAcquireInput.setNote("自动化测试备注信息");
        List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.RAW_MATERIAL, 2);

        List<CreateAcquireItemInput> createAcquireItemInputs = new ArrayList<>();
        for (int i = 0; i < createAcquireItemInputs.size(); i++) {
            CreateAcquireItemInput createAcquireItemInput = new CreateAcquireItemInput();
            CommoditySkuPayload commoditySkuPayload = commoditySkues.get(i);
            createAcquireItemInput.setSkuId(commoditySkuPayload.getCommoditySkuId());
            createAcquireItemInput.setPricePosition(10);
            createAcquireItemInput.setPrice(new BigDecimal(10.5));
            createAcquireItemInput.setPriceType(commoditySkuPayload.getUnitType());
            createAcquireItemInput.setUnitQuantity(commoditySkuPayload.getUnitQuantity());
            createAcquireItemInput.setUnitType(commoditySkuPayload.getUnitType());
            createAcquireItemInput.setTotalQuantity(commoditySkuPayload.getTotalQuantity());
            createAcquireItemInput.setTotalType(commoditySkuPayload.getTotalType());

        }
        createAcquireInput.setCommodities(createAcquireItemInputs);
        createAcquireInput.setCosts(null);
        return acquireOrderApi.createAcquire(createAcquireInput);
    }


}
