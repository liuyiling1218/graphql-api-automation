package com.hjfruit.test.pitaya.app.helper.purchase;

import com.hjfruit.test.pitaya.app.actions.production.inorder.AcquireOrderAction;
import com.hjfruit.test.pitaya.app.actions.production.inorder.InOrderAuditAction;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.stream.Collectors;

@Component
public class RayMeterialPurchaseInOrderHelper {
    @Autowired
    InOrderAuditAction inOrderAuditAction;
    @Autowired
    AcquireOrderAction acquireOrderAction;
    @Autowired
    @Qualifier("flow")
    JdbcTemplate flowJdbcTemplate;


    public Boolean reject(String applyId) {
        String orderId = getInorderId(applyId);
        RejectedInput rejectedInput = new RejectedInput();
        rejectedInput.setInOrderId(orderId);
        rejectedInput.setRejectedDescription(RandomStringUtils.random(30));
        return inOrderAuditAction.rejectPurchaseOrderAudit(rejectedInput);
    }


    public Long partIn(String applyId) {

        String inorderId = getInorderId(applyId);

        InOrderDetailInput inOrderDetailInput = new InOrderDetailInput();
        inOrderDetailInput.setInOrderId(inorderId);
        inOrderDetailInput.setDataType(PitayaConstants.InOrderType.RAW_PURCHASE.getTypeCode());
        AuditInOrderPayload auditDetail = inOrderAuditAction.getAuditDetail(inOrderDetailInput);

        PurchaseConfirmInput purchaseConfirmInput = new PurchaseConfirmInput();
        purchaseConfirmInput.setInOrderId(inorderId);
        purchaseConfirmInput.setRemark("部分入库");
        purchaseConfirmInput.setItems(auditDetail.getCommodities().stream().map(o -> {
            PurchaseConfirmItemInput purchaseConfirmItemInput = new PurchaseConfirmItemInput();
            purchaseConfirmItemInput.setInOrderItemId(o.getInOrderItemId());
            purchaseConfirmItemInput.setCommodityId(o.getCommodityId());
            purchaseConfirmItemInput.setCommoditySkuId(o.getCommoditySkuId());
            purchaseConfirmItemInput.setUnitQuantity(o.getUnitQuantity().divide(new BigDecimal(4)));
            purchaseConfirmItemInput.setTotalQuantity(o.getTotalQuantity().divide(new BigDecimal(4)));
            purchaseConfirmItemInput.setGrossUnitQuantity(o.getGrossUnitQuantity().divide(new BigDecimal(4)));
            return purchaseConfirmItemInput;
        }).collect(Collectors.toList()));
        purchaseConfirmInput.setBelongType(auditDetail.getCustomerTypeId());
        purchaseConfirmInput.setBelongId(auditDetail.getCustomerId());
        purchaseConfirmInput.setInOrderType(auditDetail.getInOrderTypeId());
        return inOrderAuditAction.confirmPurchaseInBound(purchaseConfirmInput);
    }

    public Boolean complete(String applyId) {
        String inorderId = getInorderId(applyId);
        return inOrderAuditAction.finishInbound(inorderId);
    }

    private String getInorderId(String applyId) {
        String sql = "select order_id from flow_in_stock_order where business_id=" + applyId;
        String orderId = flowJdbcTemplate.queryForObject(sql, String.class);
        return orderId;
    }

    public String getBillId(String applyId) {
        String sql = "select bill_id from flow_apply where apply_id=" + applyId;
        String billId = flowJdbcTemplate.queryForObject(sql, String.class);
        return billId;
    }


    public Long allIn(String applyId) {
        String inorderId = getInorderId(applyId);

        InOrderDetailInput inOrderDetailInput = new InOrderDetailInput();
        inOrderDetailInput.setInOrderId(inorderId);
        inOrderDetailInput.setDataType(PitayaConstants.InOrderType.RAW_PURCHASE.getTypeCode());
        AuditInOrderPayload auditDetail = inOrderAuditAction.getAuditDetail(inOrderDetailInput);

        PurchaseConfirmInput purchaseConfirmInput = new PurchaseConfirmInput();
        purchaseConfirmInput.setInOrderId(inorderId);
        purchaseConfirmInput.setRemark("全部入库");
        purchaseConfirmInput.setItems(auditDetail.getCommodities().stream().map(o -> {
            PurchaseConfirmItemInput purchaseConfirmItemInput = new PurchaseConfirmItemInput();
            purchaseConfirmItemInput.setInOrderItemId(o.getInOrderItemId());
            purchaseConfirmItemInput.setCommodityId(o.getCommodityId());
            purchaseConfirmItemInput.setCommoditySkuId(o.getCommoditySkuId());
            purchaseConfirmItemInput.setUnitQuantity(o.getUnitQuantity());
            purchaseConfirmItemInput.setTotalQuantity(o.getTotalQuantity());
            purchaseConfirmItemInput.setGrossUnitQuantity(o.getGrossUnitQuantity());
            return purchaseConfirmItemInput;
        }).collect(Collectors.toList()));
        purchaseConfirmInput.setBelongType(auditDetail.getCustomerTypeId());
        purchaseConfirmInput.setBelongId(auditDetail.getCustomerId());
        purchaseConfirmInput.setInOrderType(auditDetail.getInOrderTypeId());
        return inOrderAuditAction.confirmPurchaseInBound(purchaseConfirmInput);
    }
}