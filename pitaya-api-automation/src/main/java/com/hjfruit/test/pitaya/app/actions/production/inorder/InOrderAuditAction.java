package com.hjfruit.test.pitaya.app.actions.production.inorder;


import com.hjfruit.test.pitaya.app.apis.production.inorder.InOrderAuditApi;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Component
public class InOrderAuditAction {
    @Autowired
    InOrderAuditApi inOrderAuditApi;

    /**
     * 查询入库订单记录条数(入库审核)
     *
     * @return
     */
    CountInOrderPayload countInOrderAudit() {
        return inOrderAuditApi.countInOrderAudit();
    }

    /**
     * 查询待审核入库订单列表(入库审核)
     *
     * @param commodityType
     * @param page
     * @return
     */
    PageInAuditRecordPayload pageAuditInOrder(Integer commodityType, Page page) {
        return inOrderAuditApi.pageAuditInOrder(commodityType, page);
    }

    /**
     * 查询订单详情(入库审核)
     *
     * @param inOrderDetailInput
     * @return
     */
    public AuditInOrderPayload getAuditDetail(InOrderDetailInput inOrderDetailInput) {
        return inOrderAuditApi.getAuditDetail(inOrderDetailInput);
    }

    /**
     * 查询订单已入库记录条数
     *
     * @param inOrderDetailInput
     * @return
     */
    Long countInbounded(InOrderDetailInput inOrderDetailInput) {
        return inOrderAuditApi.countInbounded(inOrderDetailInput);
    }

    /**
     * 入库记录
     *
     * @param inOrderDetailInput
     * @return
     */
    InboundListPayload inboundRecord(InOrderDetailInput inOrderDetailInput) {
        return inOrderAuditApi.inboundRecord(inOrderDetailInput);
    }

    /**
     * 入库记录列表（入库记录）
     *
     * @param inOrderRecordCondition
     * @param page
     * @return
     */
    PageInOrderRecordPayload pageInOrderRecord(InOrderRecordFilter inOrderRecordCondition, Page page) {
        return pageInOrderRecord(inOrderRecordCondition, page);
    }

    /**
     * 获取入库记录详情（入库记录）
     *
     * @param inOrderDetailInput
     * @return
     */
    InOrderRecordDetailPayload getInOrderRecordDetail(InOrderDetailInput inOrderDetailInput) {
        return inOrderAuditApi.getInOrderRecordDetail(inOrderDetailInput);
    }

    /**
     * 采购入库记录
     *
     * @param inOrderId
     * @return
     */
    ProductionInOrderLogListPayload purchaseInOrderLog(String inOrderId) {
        return inOrderAuditApi.purchaseInOrderLog(inOrderId);
    }

    /**
     * 驳回订单
     *
     * @param rejectedInput
     * @return
     */
    public Boolean rejectedInOrderAudit(RejectedInput rejectedInput) {
        Boolean aBoolean = inOrderAuditApi.rejectedInOrderAudit(rejectedInput);

        /*
         * 断言：
         */
        assertThat(aBoolean).isTrue();
        return aBoolean;
    }

    /**
     * 完成入库
     *
     * @param inOrderId
     * @return
     */
    public Boolean finishInbound(String inOrderId) {
        Boolean aBoolean = inOrderAuditApi.finishInbound(inOrderId);
        /*
         * 断言：
         */
        return aBoolean;
    }

    /**
     * 确认入库 返回订单状态
     *
     * @param confirmInput
     * @return
     */
    public Long confirmInbound(ConfirmInput confirmInput) {
        Long aLong = inOrderAuditApi.confirmInbound(confirmInput);

        /*
         * 断言：
         */
        return aLong;
    }

    /**
     * 采购确定入库
     *
     * @param purchaseConfirmInput
     * @return
     */
    public Long confirmPurchaseInBound(PurchaseConfirmInput purchaseConfirmInput) {
        Long aLong = inOrderAuditApi.confirmPurchaseInBound(purchaseConfirmInput);
        /*
         * 断言：
         */
        return aLong;
    }


    /**
     * 采购入库驳回订单
     *
     * @param rejectedInput
     * @return
     */
    public Boolean rejectPurchaseOrderAudit(RejectedInput rejectedInput) {
        Boolean aBoolean = inOrderAuditApi.rejectPurchaseOrderAudit(rejectedInput);
        /*
         * 断言：
         */
        return aBoolean;
    }

    /**
     * 采购完成入库
     *
     * @param inOrderId
     * @return
     */
    Boolean finishPurchaseOrderInBound(String inOrderId) {
        Boolean aBoolean = inOrderAuditApi.finishPurchaseOrderInBound(inOrderId);
        /*
         * 断言：
         */
        return aBoolean;

    }
}
