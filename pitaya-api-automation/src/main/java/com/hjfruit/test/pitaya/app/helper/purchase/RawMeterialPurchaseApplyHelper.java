package com.hjfruit.test.pitaya.app.helper.purchase;

import com.hjfruit.test.pitaya.app.actions.production.inorder.AcquireOrderAction;
import com.hjfruit.test.pitaya.app.actions.v2.api.BaseAction;
import com.hjfruit.test.pitaya.app.entities.commodity.CommoditySkuPayload;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.FreightType;
import com.hjfruit.test.pitaya.app.entities.v2.types.PayMode;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.app.helper.base.SupplierHelper;
import com.hjfruit.test.pitaya.app.model.base.CustomerModel;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 原料采购
 */
@Component
public class RawMeterialPurchaseApplyHelper {
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
    @Autowired
    BaseAction baseAction;


    public String Rawcreate() {
        return create(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER, RandomStringUtils.random(200), PitayaConstants.CommodityType.RAW_MATERIAL);
    }

    public String Accessoriescreate() {
        return create(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER, RandomStringUtils.random(200), PitayaConstants.CommodityType.ASSIST);
    }

    /**
     * @param customerType
     * @param remark
     * @return
     */
    public String create(PitayaConstants.CustomerType customerType, String remark, PitayaConstants.CommodityType commodityType) {
        //获取仓库
        String warehouseId = storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId();
        //获取供应商
        Integer supplierId = supplierHelper.supplierPages_getFirstFoodAndFruitSupplier().getSupplierId();
        //获取客户
        CustomerModel customerModel = customerHelper.getCustomer(customerType);

        //获取随机2个商品SKU
//        List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.RAW_MATERIAL, 2);
        List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(commodityType, 2);

        CreateAcquireInput createAcquireInput = new CreateAcquireInput();
        createAcquireInput.setCommodityType(commodityType.getTypeId());
        createAcquireInput.setWarehouseId(warehouseId);
        createAcquireInput.setSupplierId(supplierId);
        createAcquireInput.setBelongType(customerModel.getBelongType());
        createAcquireInput.setBelongId(customerModel.getBelongId());
        createAcquireInput.setNote(remark);
        List<CreateAcquireItemInput> collect = commoditySkues.stream().map(o ->
        {
            CreateAcquireItemInput createAcquireItemInput = new CreateAcquireItemInput();
            createAcquireItemInput.setSkuId(o.getCommoditySkuId());
            createAcquireItemInput.setPricePosition(10);
            createAcquireItemInput.setPrice(new BigDecimal(10.22));
            createAcquireItemInput.setPriceType(o.getUnitType());
            createAcquireItemInput.setUnitQuantity(new BigDecimal(100.22));
            createAcquireItemInput.setUnitType(o.getUnitType());
            if (!commodityType.equals(PitayaConstants.CommodityType.ASSIST)) {
                createAcquireItemInput.setTotalQuantity(new BigDecimal(102.24));
                createAcquireItemInput.setTotalType(o.getTotalType());
            } else {
                createAcquireItemInput.setTotalQuantity(new BigDecimal(0));
                createAcquireItemInput.setTotalType(0);
            }
            return createAcquireItemInput;
        }).collect(Collectors.toList());
        createAcquireInput.setCommodities(collect);


        //获取费用类型
        FreightType freightType = baseAction.freightTypes().get(0);

        //获取付款方式
        PayMode payMode = baseAction.payModes().get(0);

        CreateCostInput createCostInput = new CreateCostInput();
        createCostInput.setTypeId(freightType.getFreightId());
        createCostInput.setSupplierId(supplierHelper.supplierPages_getFirstSupplierBySupplierTypeIds(Arrays.asList(PitayaConstants.SupplierType.TRANSPORT.getTypeId())).getSupplierId());
        createCostInput.setAmount(new BigDecimal(200.02));
        createCostInput.setNote("");
        createCostInput.setPayMode(payMode.getCode());
        createAcquireInput.setCosts(Arrays.asList(createCostInput));
        return acquireOrderAction.createAcquire(createAcquireInput);
    }

    public Boolean update(String applyId) {
        //数据回填
        GetAcquireInput getAcquireInput = new GetAcquireInput();
        getAcquireInput.setApplyId(applyId);
        AcquirePayload acquirePayload = acquireOrderAction.getAcquire(getAcquireInput);
        UpdateAcquireInput updateAcquireInput = new UpdateAcquireInput();
        updateAcquireInput.setApplyId(acquirePayload.getApplyId());
        updateAcquireInput.setWarehouseId(acquirePayload.getWarehouseId());
        updateAcquireInput.setSupplierId(acquirePayload.getSupplierId());
        updateAcquireInput.setBelongType(acquirePayload.getBelongType());
        updateAcquireInput.setBelongId(acquirePayload.getBelongId());
        updateAcquireInput.setNote(acquirePayload.getNote());
        updateAcquireInput.setCommodities(acquirePayload.getCommodities().stream().map(o -> {
            CreateAcquireItemInput createAcquireItemInput = new CreateAcquireItemInput();
            createAcquireItemInput.setSkuId(o.getSkuId());
            createAcquireItemInput.setPricePosition(o.getPricePosition());
            createAcquireItemInput.setPrice(o.getPrice());
            createAcquireItemInput.setPriceType(o.getPriceType());
            createAcquireItemInput.setUnitQuantity(o.getUnitQuantity());
            createAcquireItemInput.setUnitType(o.getUnitType());
            createAcquireItemInput.setTotalQuantity(o.getTotalQuantity());
            createAcquireItemInput.setTotalType(o.getTotalType());
            return createAcquireItemInput;
        }).collect(Collectors.toList()));
        updateAcquireInput.setCosts(acquirePayload.getCosts().stream().map(o -> {
            CreateCostInput createCostInput = new CreateCostInput();
            createCostInput.setTypeId(o.getTypeId());
            createCostInput.setSupplierId(o.getSupplierId());
            createCostInput.setAmount(o.getAmount());
            createCostInput.setNote(o.getNote());
            createCostInput.setPayMode(o.getPayMode());
            return createCostInput;
        }).collect(Collectors.toList()));
        return acquireOrderAction.updateAcquire(updateAcquireInput);
    }


    public String submit(String applyId) {
        SubmitAcquireInput submitAcquireInput = new SubmitAcquireInput();
        submitAcquireInput.setApplyId(applyId);
        return acquireOrderAction.submitAcquire(submitAcquireInput);
    }

    public Boolean cancel(String applyId) {
        CancelAcquireInput cancelAcquireInput = new CancelAcquireInput();
        cancelAcquireInput.setApplyId(applyId);
        cancelAcquireInput.setNote(RandomStringUtils.random(100));
        return acquireOrderAction.cancelAcquire(cancelAcquireInput);
    }

}