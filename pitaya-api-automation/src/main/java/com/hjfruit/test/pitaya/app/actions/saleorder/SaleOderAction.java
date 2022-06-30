package com.hjfruit.test.pitaya.app.actions.saleorder;

import com.hjfruit.test.pitaya.app.apis.base.customer.CustomerApi;
import com.hjfruit.test.pitaya.app.apis.production.outorder.SaleOrderApi;
import com.hjfruit.test.pitaya.app.entities.commodity.CommoditySkuPayload;
import com.hjfruit.test.pitaya.app.entities.production.outorder.CreateSaleOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.CreateSaleOrderItemInput;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
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
    public String  createSaleOrder(){
        CreateSaleOrderInput createSaleOrderInput=new CreateSaleOrderInput();
        createSaleOrderInput.setWarehouseId(storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId());
        createSaleOrderInput.setCustomerId(customerHelper.getCustomer(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER).getBelongId());
        createSaleOrderInput.setCustomerDistributionId(customerHelper.getCustomer(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER).getCustomerDistributionId());
        createSaleOrderInput.setSaleTime(System.currentTimeMillis());
        createSaleOrderInput.setOutOrderDescription("创建成品销售单成功啦~~~~！！！");
        List<CommoditySkuPayload> commoditySkues = commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.PRODUCT, 2);
        createSaleOrderInput.setCommodityList(commoditySkues.stream().map(o->{
            CreateSaleOrderItemInput createSaleOrderItemInput=new CreateSaleOrderItemInput();
            createSaleOrderItemInput.setCommoditySkuId(o.getCommoditySkuId());
            createSaleOrderItemInput.setPlanQuantity(9);
            createSaleOrderItemInput.setSalePrice(new BigDecimal(1.88));
            return createSaleOrderItemInput;
        }).collect(Collectors.toList()));
        return saleOrderApi.createSaleOrder(createSaleOrderInput);
    }













}
