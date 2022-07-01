package com.hjfruit.test.pitaya.app.actions.saleorder;

import com.hjfruit.test.pitaya.app.apis.base.customer.CustomerApi;
import com.hjfruit.test.pitaya.app.apis.production.outorder.SaleOrderApi;
import com.hjfruit.test.pitaya.app.entities.commodity.CommoditySkuPayload;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

@Component
public class SaleOderAction {
    @Autowired
    SaleOrderApi saleOrderApi;
    @Autowired
    CommodityHelper commodityHelper;
    @Autowired
    CustomerHelper customerHelper;
    @Autowired
    StoreHouseHelper storeHouseHelper;
    /**
     * 创建成品销售订单
     */
    public String  createSaleOrder() {
        CreateSaleOrderInput createSaleOrderInput = new CreateSaleOrderInput();
        createSaleOrderInput.setWarehouseId(storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId());
        createSaleOrderInput.setCustomerId(customerHelper.getCustomer(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER).getBelongId());
        createSaleOrderInput.setCustomerDistributionId(customerHelper.getCustomer(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER).getCustomerDistributionId());
        createSaleOrderInput.setSaleTime(System.currentTimeMillis());
        createSaleOrderInput.setOutOrderDescription("创建成品销售单成功啦~~~~！！！");
        List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.PRODUCT, 2);
        List<CommoditySkuPayload> commoditySkues1 = commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.ASSIST, 1);
        Integer commodityId = commoditySkues1.get(0).getCommodityId();
        createSaleOrderInput.setCommodityList(commoditySkues.stream().map(o -> {
            CreateSaleOrderItemInput createSaleOrderItemInput = new CreateSaleOrderItemInput();
            createSaleOrderItemInput.setCommoditySkuId(o.getCommoditySkuId());
            createSaleOrderItemInput.setPlanQuantity(8);
            createSaleOrderItemInput.setSalePrice(new BigDecimal(1.8));
            createSaleOrderItemInput.setSpecificationLabel("質量要好，個頭要大");
            createSaleOrderItemInput.setQuantityLabel("品質要好");
            OutOrderItemRequestInput outOrderItemRequestInput = OutOrderItemRequestInput.builder().requestText("250A胶盒").commodityId(commodityId.longValue()).build();
            List<OutOrderItemRequestInput> packageRequireInfos = new ArrayList<>();
            packageRequireInfos.add(outOrderItemRequestInput);
            createSaleOrderItemInput.setPackageRequireInfos(packageRequireInfos);
            return createSaleOrderItemInput;
        }).collect(Collectors.toList()));
        return saleOrderApi.createSaleOrder(createSaleOrderInput);
    }
    /**
     * 提交生产
     */
    public Boolean submitSaleOrder(String orderId) {
        Boolean aBoolean = saleOrderApi.submitSaleOrder(orderId);
        assertThat(aBoolean).isTrue();
        return aBoolean;
    }

    /**
     * 撤销生产
     */
    public Boolean undoSaleOrder(String orderId) {
        UndoSaleOrderInput undoSaleOrderInput = UndoSaleOrderInput.builder().outOrderId(orderId).undoDescription("撤销生产").build();
        Boolean aBoolean = saleOrderApi.undoSaleOrder(undoSaleOrderInput);
        assertThat(aBoolean).isTrue();
        return aBoolean;
    }

    /**
     * 再来一单
     */
    public String copySaleOrder(String orderId) {
        SaleOrderInput saleOrderInput = SaleOrderInput.builder().outOrderId(orderId).requestFlag(RequestFlag.SALE).build();
        String s = saleOrderApi.copySaleOrder(saleOrderInput);
        assertThat(s).isNotNull();
        return s;
    }

    /**
     * 取消订单
     */
    public Boolean cancelSaleOrder(String orderId) {
        CancelOutOrderInput cancelOutOrderInput = CancelOutOrderInput.builder().outOrderId(orderId).outOrderDescription("取消生产").build();
        Boolean aBoolean = saleOrderApi.cancelSaleOrder(cancelOutOrderInput);
        assertThat(aBoolean).isTrue();
        return aBoolean;
    }

    /**
     * 修改订单
     */
    public Boolean updateSaleOrder(String orderId) {
        UpdateSaleOrderInput updateSaleOrderInput = new UpdateSaleOrderInput();
        updateSaleOrderInput.setWarehouseId(storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId());
        updateSaleOrderInput.setCustomerId(customerHelper.getCustomer(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER).getBelongId());
        updateSaleOrderInput.setCustomerDistributionId(customerHelper.getCustomer(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER).getCustomerDistributionId());
        updateSaleOrderInput.setSaleTime(System.currentTimeMillis());
        updateSaleOrderInput.setOutOrderDescription("创建成品销售单成功啦~~~~！！！");
        updateSaleOrderInput.setOutOrderId(orderId);
        List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.PRODUCT, 2);
        List<CommoditySkuPayload> commoditySkues1 = commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.ASSIST, 1);
        Integer commodityId = commoditySkues1.get(0).getCommodityId();
        updateSaleOrderInput.setCommodityList(commoditySkues.stream().map(o -> {
            CreateSaleOrderItemInput createSaleOrderItemInput = new CreateSaleOrderItemInput();
            createSaleOrderItemInput.setCommoditySkuId(o.getCommoditySkuId());
            createSaleOrderItemInput.setPlanQuantity(9);
            createSaleOrderItemInput.setSalePrice(new BigDecimal(2.8));
            createSaleOrderItemInput.setQuantityLabel("品質要好");
            OutOrderItemRequestInput outOrderItemRequestInput = OutOrderItemRequestInput.builder().requestText("250A胶盒").commodityId(commodityId.longValue()).build();
            List<OutOrderItemRequestInput> packageRequireInfos = new ArrayList<>();
            packageRequireInfos.add(outOrderItemRequestInput);
            createSaleOrderItemInput.setPackageRequireInfos(packageRequireInfos);
            return createSaleOrderItemInput;
        }).collect(Collectors.toList()));
        return saleOrderApi.updateSaleOrder(updateSaleOrderInput);
    }













}
