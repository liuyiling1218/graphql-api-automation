package com.hjfruit.test.pitaya.app.actions.stock.other;

import com.hjfruit.test.pitaya.app.apis.production.outorder.OtherOutOrderApi;
import com.hjfruit.test.pitaya.app.apis.production.outorder.OutOrderApi;
import com.hjfruit.test.pitaya.app.apis.production.outorder.OutOrderMutationApi;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Component
public class OtherOutOrderAction {
    @Autowired
    OtherOutOrderApi otherOutOrderApi;
    @Autowired
    CustomerHelper customerHelper;
    @Autowired
    CommodityHelper commodityHelper;
    @Autowired
    StoreHouseHelper storeHouseHelper;
    @Autowired
    OutOrderApi outOrderApi;
    @Autowired
    OutOrderMutationApi outOrderMutationApi;
    /**
     * 创建其它出库订单
     *
     * @param commodityType
     * @return
     */
    public String createOtherOutOrder(PitayaConstants.CommodityType commodityType) {
        CreateOtherOutOrderInput createOtherOutOrderInput = new CreateOtherOutOrderInput();
        createOtherOutOrderInput.setCommodityTypeId(commodityType.getTypeId());
        createOtherOutOrderInput.setOutOrderDescription("创建其它出库订单");
        createOtherOutOrderInput.setWarehouseId(storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId());
        createOtherOutOrderInput.setCustomerId(customerHelper.getCustomer(PitayaConstants.CustomerType.NO_CUSTOMER).getBelongId());
        createOtherOutOrderInput.setCustomerType(PitayaConstants.CustomerType.NO_CUSTOMER.getCustomerTypeId());
        if (!Arrays.asList(PitayaConstants.CommodityType.DEFECTIVE,PitayaConstants.CommodityType.BOX,PitayaConstants.CommodityType.ASSIST).contains(commodityType)) {
            List<CommodityStockBatchPayload> commodityStockBatches = commodityHelper.getCommodityStockBatches(commodityType, PitayaConstants.CommoditySkuType.DOUBLE_UNIT).subList(0, 2);
            createOtherOutOrderInput.setCommodityList(commodityStockBatches.stream().map(o -> {
                        CreateOtherOutOrderItemInput createOtherOutOrderItemInput = new CreateOtherOutOrderItemInput();
                        createOtherOutOrderItemInput.setBatchId(o.getBatchId());
                        createOtherOutOrderItemInput.setCommoditySkuId(o.getCommoditySkuId());
                        createOtherOutOrderItemInput.setTotalQuantity(new BigDecimal(1.88));
                        createOtherOutOrderItemInput.setUnitQuantity(new BigDecimal(1.88));
                        return createOtherOutOrderItemInput;
                    }).collect(Collectors.toList())
            );
        }else {
            List<CommodityStockBatchPayload> commodityStockBatches = commodityHelper.getCommodityStockBatches(commodityType, PitayaConstants.CommoditySkuType.SINGLE_UNIT).subList(0, 2);
            createOtherOutOrderInput.setCommodityList(commodityStockBatches.stream().map(o -> {
                        CreateOtherOutOrderItemInput createOtherOutOrderItemInput = new CreateOtherOutOrderItemInput();
                        createOtherOutOrderItemInput.setBatchId(o.getBatchId());
                        createOtherOutOrderItemInput.setCommoditySkuId(o.getCommoditySkuId());
                        createOtherOutOrderItemInput.setTotalQuantity(new BigDecimal(1.88));
                        createOtherOutOrderItemInput.setUnitQuantity(new BigDecimal(1.88));
                        return createOtherOutOrderItemInput;
                    }).collect(Collectors.toList())
            );

        }
        return otherOutOrderApi.createOtherOutOrder(createOtherOutOrderInput);
    }
    /**
     * 修改其它出库订单
     *
     * @param orderId
     * @return
     */
    public Boolean updateOtherOutOrder(String orderId) {
        OutOrderPayload outOrderPayload = outOrderApi.outOrder(new OutOrderInput(orderId, null));
        UpdateOtherOutOrderInput updateOtherOutOrderInput = new UpdateOtherOutOrderInput();
        updateOtherOutOrderInput.setOutOrderId(outOrderPayload.getOutOrderId());
        updateOtherOutOrderInput.setWarehouseId(outOrderPayload.getWarehouseId());
        updateOtherOutOrderInput.setCustomerId(outOrderPayload.getCustomerId());
        updateOtherOutOrderInput.setCustomerType(outOrderPayload.getCustomerType());
        updateOtherOutOrderInput.setOutOrderDescription("修改其它出库订单");
        updateOtherOutOrderInput.setCommodityList(outOrderPayload.getCommodityList().stream().map(o -> {
            CreateOtherOutOrderItemInput createOtherOutOrderItemInput =new CreateOtherOutOrderItemInput();
            createOtherOutOrderItemInput.setBatchId(o.getBatchId());
            createOtherOutOrderItemInput.setCommoditySkuId(o.getCommoditySkuId());
            if (!Arrays.asList(PitayaConstants.CommodityType.DEFECTIVE.getTypeId(),PitayaConstants.CommodityType.BOX.getTypeId(),PitayaConstants.CommodityType.ASSIST.getTypeId()).contains(outOrderPayload.getCommodityTypeId())){
                createOtherOutOrderItemInput.setUnitQuantity(new BigDecimal("2.88"));
                createOtherOutOrderItemInput.setTotalQuantity(new BigDecimal("2.88"));
            }else{
                createOtherOutOrderItemInput.setUnitQuantity(new BigDecimal("2.88"));
            }

            return createOtherOutOrderItemInput;
        }).collect(Collectors.toList()));
        Boolean aBoolean = otherOutOrderApi.updateOtherOutOrder(updateOtherOutOrderInput);
        assertThat(aBoolean).isTrue();
        return aBoolean;
    }
    /**
     *  提交库管
     */
        public Boolean submitOutOrder(String orderId) {
            Boolean aBoolean = outOrderMutationApi.submitOutOrder(orderId);
            assertThat(aBoolean).isTrue();
            return aBoolean;
        }









}
