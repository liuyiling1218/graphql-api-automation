package com.hjfruit.test.pitaya.app.helper.transfer;

import com.hjfruit.test.pitaya.app.actions.production.inorder.InOrderAuditAction;
import com.hjfruit.test.pitaya.app.actions.production.outorder.OutOrderAction;
import com.hjfruit.test.pitaya.app.actions.production.outorder.TransferOutOrderAction;
import com.hjfruit.test.pitaya.app.entities.production.inorder.AuditInOrderPayload;
import com.hjfruit.test.pitaya.app.entities.production.inorder.ConfirmInput;
import com.hjfruit.test.pitaya.app.entities.production.inorder.ConfirmItemInput;
import com.hjfruit.test.pitaya.app.entities.production.inorder.InOrderDetailInput;
import com.hjfruit.test.pitaya.app.entities.production.order.FlowTransferCommodityInput;
import com.hjfruit.test.pitaya.app.entities.production.order.FlowTransferOtherBillInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.app.helper.base.SupplierHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import com.hjfruit.test.pitaya.config.TransferOrgConfig;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TransferOrderHelper {

    @Autowired
    TransferOutOrderAction transferOutOrderAction;
    @Autowired
    StoreHouseHelper storeHouseHelper;
    @Autowired
    TransferOrgConfig transferOrgConfig;
    @Autowired
    CommodityHelper commodityHelper;
    @Autowired
    SupplierHelper supplierHelper;
    @Autowired
    OutOrderMutationAction outOrderMutationAction;
    @Autowired
    OutOrderAction outOrderAction;
    @Autowired
    InOrderAuditAction inOrderAuditAction;
    @Autowired
    @Qualifier("flow")
    JdbcTemplate flowJdbcTemplate;


    public String create(PitayaConstants.CommodityType commodityType, PitayaConstants.OrgType orgType, String remark) {
        CreateTransferOrderInput createTransferOrderInput = new CreateTransferOrderInput();
//        createTransferOrderInput.setTransferType();
        createTransferOrderInput.setCommodityType(commodityType.getTypeId());
        createTransferOrderInput.setTargetAppId(2);
        createTransferOrderInput.setSourceWarehouseId(storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId());
//        createTransferOrderInput.setSourceBelongId();
//        createTransferOrderInput.setTargetWarehouseId();
        createTransferOrderInput.setTargetBelongId(transferOrgConfig.getOrgId());
        createTransferOrderInput.setRemark(remark);
        List<CommodityStockBatchPayload> commodityStockBatches = commodityHelper.getCommodityStockBatches(commodityType, PitayaConstants.CommoditySkuType.DOUBLE_UNIT).subList(0, 2);
        createTransferOrderInput.setFlowTransferCommodityInput(commodityStockBatches.stream().map(o -> {
            FlowTransferCommodityInput flowTransferCommodityInput = new FlowTransferCommodityInput();
            flowTransferCommodityInput.setSkuId(o.getCommoditySkuId());
            flowTransferCommodityInput.setBatchId(o.getBatchId());
            flowTransferCommodityInput.setTotalQuantity(o.getStockTotalQuantity());
            flowTransferCommodityInput.setTotalType(o.getStockTotalType());
            flowTransferCommodityInput.setUnitQuantity(o.getStockUnitQuantity());
            flowTransferCommodityInput.setUnitType(o.getStockUnitType());
            flowTransferCommodityInput.setUnitPrice(new BigDecimal(0.11));
            flowTransferCommodityInput.setPriceType(o.getStockUnitPriceType());
//            flowTransferCommodityInput.setAmount(new BigDecimal(200.11));
            return flowTransferCommodityInput;
        }).collect(Collectors.toList()));
        ArrayList<FlowTransferOtherBillInput> flowTransferOtherBillInputs = new ArrayList<>();
        FlowTransferOtherBillInput flowTransferOtherBillInput = new FlowTransferOtherBillInput();
        flowTransferOtherBillInput.setBillType(10);
        flowTransferOtherBillInput.setPayMode(10);
        flowTransferOtherBillInput.setSupplierId(supplierHelper.supplierPages_getFirstTransportSupplier().getSupplierId());
        flowTransferOtherBillInput.setAmount(new BigDecimal(20.11));
//        flowTransferOtherBillInput.setBrand();
//        flowTransferOtherBillInput.setPhone();
//        flowTransferOtherBillInput.setRemark();
        flowTransferOtherBillInputs.add(flowTransferOtherBillInput);

        createTransferOrderInput.setFlowTransferOtherBillInput(flowTransferOtherBillInputs);

        return transferOutOrderAction.createTransferOutOrder(createTransferOrderInput);
    }

    /**
     * 确认提交
     *
     * @param orderId
     * @return
     */
    public Boolean submit(String orderId) {
        return outOrderMutationAction.submitOutOrder(orderId);
    }

    /**
     * 取消订单
     *
     * @param orderId
     * @return
     */
    public Boolean cancel(String orderId) {
        CancelOutOrderInput cancelOutOrderInput = new CancelOutOrderInput();
        cancelOutOrderInput.setOutOrderId(orderId);
        cancelOutOrderInput.setOutOrderDescription(RandomStringUtils.random(30));
        return outOrderMutationAction.cancelOutOrder(cancelOutOrderInput);
    }

    /**
     * 驳回订单
     *
     * @param orderId
     * @return
     */
    public Boolean reject(String orderId) {
        RejectOutOrderInput rejectOutOrderInput = new RejectOutOrderInput();
        rejectOutOrderInput.setOutOrderId(orderId);
        rejectOutOrderInput.setRejectDescription(RandomStringUtils.random(30));
        return outOrderMutationAction.rejectOutOrderAudit(rejectOutOrderInput);
    }

    public Boolean confirmOutOrder(String orderId) {
        OutOrderInput outOrderInput = new OutOrderInput();
        outOrderInput.setOutOrderId(orderId);
        OutOrderPayload outOrderPayload = outOrderAction.outOrder(outOrderInput);
        ConfirmOutOrderInput confirmOutOrderInput = new ConfirmOutOrderInput();
        confirmOutOrderInput.setOutOrderId(orderId);
        confirmOutOrderInput.setItems(outOrderPayload.getCommodityList().stream().map(o -> {
            ConfirmOutOrderItem confirmOutOrderItem = new ConfirmOutOrderItem();
            confirmOutOrderItem.setOutOrderItemId(o.getOutOrderItemId());
            confirmOutOrderItem.setSkuId(o.getCommoditySkuId());
//            confirmOutOrderItem.setBasketQuantity();
//            confirmOutOrderItem.setBasketCustomerId();
            BatchStockItem batchStockItem = new BatchStockItem();
            batchStockItem.setBatchStockId(o.getBatchId());
            batchStockItem.setUnitQuantity(o.getUnitQuantity());
            batchStockItem.setTotalQuantity(o.getTotalQuantity());
            confirmOutOrderItem.setBatchStockItems(Arrays.asList(batchStockItem));
            return confirmOutOrderItem;
        }).collect(Collectors.toList()));
        confirmOutOrderInput.setRemark(RandomStringUtils.random(200));
//        confirmOutOrderInput.setDeliveryFee();
        return outOrderMutationAction.confirmOutOrder(confirmOutOrderInput);
    }

    public Long confirmInOrder(String orderId) {

        String inOrderId = flowJdbcTemplate.queryForObject("select order_id from flow_in_stock_order  as fiso left JOIN flow_transfer as ft on fiso.business_id=ft.flow_id WHERE ft.source_id=" + orderId, String.class);
        InOrderDetailInput inOrderDetailInput = new InOrderDetailInput();
        inOrderDetailInput.setInOrderId(inOrderId);
        inOrderDetailInput.setDataType(10);
        AuditInOrderPayload auditDetail = inOrderAuditAction.getAuditDetail(inOrderDetailInput);

        ConfirmInput confirmInput = new ConfirmInput();
        confirmInput.setInOrderId(inOrderId);
//        confirmInput.setRemark(RandomStringUtils.random(200));
        confirmInput.setItems(auditDetail.getCommodities().stream().map(o ->
        {
            ConfirmItemInput confirmItemInput = new ConfirmItemInput();
            confirmItemInput.setBatchId(o.getBatchId());
            confirmItemInput.setInOrderItemId(o.getInOrderItemId());
            confirmItemInput.setCommodityId(o.getCommodityId());
            confirmItemInput.setCommoditySkuId(o.getCommoditySkuId());
            confirmItemInput.setUnitQuantity(o.getUnitQuantity());
            confirmItemInput.setTotalQuantity(o.getTotalQuantity());
            confirmItemInput.setTotalPrice(o.getTotalQuantity().multiply(o.getUnitQuantity()).setScale(2, BigDecimal.ROUND_HALF_UP));
            return confirmItemInput;
        }).collect(Collectors.toList()));
        confirmInput.setBelongType(10);
        confirmInput.setBelongId(347);
//        confirmInput.setDeliveryFee(new BigDecimal(0));
        return inOrderAuditAction.confirmInbound(confirmInput);
    }
}