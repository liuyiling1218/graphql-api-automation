package com.hjfruit.test.pitaya.app.actions.stock.other;


import com.hjfruit.test.pitaya.app.apis.production.inorder.OtherInOrderApi;
import com.hjfruit.test.pitaya.app.apis.production.inorder.PurchaseOrderApi;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.commodity.CommoditySkuPayload;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.app.helper.base.SupplierHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 其他入库
 */
@Component
public class OtherInOrderAction {
    @Autowired
    OtherInOrderApi otherInOrderApi;
    @Autowired
    StoreHouseHelper storeHouseHelper;
    @Autowired
    SupplierHelper supplierHelper;
    @Autowired
    CommodityHelper commodityHelper;
    @Autowired
    CustomerHelper customerHelper;
    @Autowired
    PurchaseOrderApi purchaseOrderApi;

    /**
     * 创建其他入库
     *
     * @param commodityType
     * @param remark
     * @return
     */
    public String createOtherInOrder(PitayaConstants.CommodityType commodityType, PitayaConstants.CustomerType customerType) {
        CreateOtherInOrderInput createOtherInOrderInput = new CreateOtherInOrderInput();
        createOtherInOrderInput.setInOrderTypeId(PitayaConstants.InOrderType.OTHER_IN_APPLY.getTypeCode());
        createOtherInOrderInput.setCommodityTypeId(commodityType.getTypeId());
        createOtherInOrderInput.setWarehouseId(storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId());
        if (PitayaConstants.CommodityType.RAW_MATERIAL == commodityType) {
            createOtherInOrderInput.setSupplierId(supplierHelper.supplierPages_getFirstFoodAndFruitSupplier().getSupplierId());
        } else if (PitayaConstants.CommodityType.ASSIST == commodityType) {
            createOtherInOrderInput.setSupplierId(supplierHelper.supplierPages_getFirstAssitSupplier().getSupplierId());
        }
        if (Arrays.asList(PitayaConstants.CommodityType.ASSIST, PitayaConstants.CommodityType.DEFECTIVE).contains(commodityType) || PitayaConstants.CustomerType.NO_CUSTOMER == customerType) {
            createOtherInOrderInput.setCustomerTypeId(PitayaConstants.CustomerType.NO_CUSTOMER.getCustomerTypeId());
        } else if (PitayaConstants.CustomerType.CUSTOMER_GROUP == customerType) {
            createOtherInOrderInput.setCustomerTypeId(PitayaConstants.CustomerType.CUSTOMER_GROUP.getCustomerTypeId());
            createOtherInOrderInput.setCustomerId(customerHelper.getCustomer(PitayaConstants.CustomerType.NO_CUSTOMER).getBelongId());
        } else if (PitayaConstants.CustomerType.DESIGNATED_CUSTOMER == customerType) {
            createOtherInOrderInput.setCustomerTypeId(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER.getCustomerTypeId());
            createOtherInOrderInput.setCustomerId(customerHelper.getCustomer(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER).getBelongId());
        }
        createOtherInOrderInput.setInOrderDescription("创建其它入库订单");

        List<CreateOtherOrderItemInput> createOtherOrderItemInputs = new ArrayList<>();
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
        return otherInOrderApi.createOtherInOrder(createOtherInOrderInput);
    }

        //准备商品sku数据
//        List<CommoditySkuPayload> commoditySkues = commodityComponent.getCommoditySkues(commodityType, 10);
//        List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(commodityType, PitayaConstants.CommoditySkuType.DOUBLE_UNIT, 2);
//
//        createOtherInOrderInput.setCommodities(commoditySkues.stream().map(o -> {
//            CreateOtherOrderItemInput createOtherOrderItemInput = new CreateOtherOrderItemInput();
//            createOtherOrderItemInput.setCommoditySkuId(o.getCommoditySkuId());
//            createOtherOrderItemInput.setUnitQuantity(new BigDecimal(10.01));
//            createOtherOrderItemInput.setTotalQuantity(new BigDecimal(100.22));
//            createOtherOrderItemInput.setUnitPrice(new BigDecimal(20.1));
//            createOtherOrderItemInput.setUnitPriceType(o.getUnitType());
//            createOtherOrderItemInput.setTotalPrice(new BigDecimal(200.31));
//            return createOtherOrderItemInput;
//        }).collect(Collectors.toList()));
    /**
     * 新增其他入库
     *
     * @param createOtherInOrderInput
     * @return
     */
    public String createOtherInOrder(CreateOtherInOrderInput createOtherInOrderInput) {
        return otherInOrderApi.createOtherInOrder(createOtherInOrderInput);
    }

    /**
     * 提交库管
     *
     * @param inOrderId
     * @return
     */
    public String submitOtherInOrder(String inOrderId) {
        return otherInOrderApi.submitOtherInOrder(inOrderId);
    }

    /**
     * 修改其他入库订单
     *
     * @param
     * @return
     */
    public Boolean modifyOtherInOrder(String inOrderId) {
      ModifyOtherInOrderInput modifyOtherInOrderInput=new ModifyOtherInOrderInput();
        PurchaseOrderPayload purchaseOrderPayload = purchaseOrderApi.purchaseDetail(inOrderId);


        return otherInOrderApi.modifyOtherInOrder(modifyOtherInOrderInput);
    }

    /**
     * 取消其他入库订单
     *
     * @param
     * @return
     */
    public Boolean cancelOtherInOrder() {
        String otherInOrder = createOtherInOrder(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.CustomerType.NO_CUSTOMER);
        CancelOtherInOrderInput cancelOtherInOrderInput=new CancelOtherInOrderInput();
        cancelOtherInOrderInput.setInOrderId(otherInOrder);
        cancelOtherInOrderInput.setInOrderDescription("取消订单ING");
        return otherInOrderApi.cancelOtherInOrder(cancelOtherInOrderInput);
    }

    /**
     * 查询其他入库订单
     *
     * @param pageOtherInOrderInput
     * @param page
     * @return
     */
    public PageOtherInOrderPayload pageOtherInOrder(PageOtherInOrderInput pageOtherInOrderInput, Page page) {
        return otherInOrderApi.pageOtherInOrder(pageOtherInOrderInput, page);
    }
}
