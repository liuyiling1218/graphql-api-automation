package com.hjfruit.test.pitaya.actions.production.inorder;

import com.hjfruit.test.pitaya.apis.production.inorder.PurchaseOrderApi;
import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.inorder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @description {}
 * @Author 吴随伟
 * @date 2021/12/22
 */
@Component
public class PurchaseOrderAction {
    @Autowired
    PurchaseOrderApi purchaseOrderApi;

    /**
     * 查询采购订单
     *
     * @param listCondition
     * @param page
     * @return
     */
    public PurchasePageResultPayload purchaseList(PurchaseListFilter listCondition, Page page) {
        return purchaseOrderApi.purchaseList(listCondition, page);
    }

    /**
     * 查询采购订单详情
     *
     * @param inOrderId
     * @return
     */
    public PurchaseOrderPayload purchaseDetail(String inOrderId) {
        return purchaseOrderApi.purchaseDetail(inOrderId);
    }

    /**
     * 查询采购订单不同状态记录条数
     *
     * @param countPurchaseFilter
     * @return
     */
    public CountPurchasePayload countPurchase(CountPurchaseFilter countPurchaseFilter) {
        return purchaseOrderApi.countPurchase(countPurchaseFilter);
    }

    /**
     * 新增采购 返回inOrderId
     *
     * @param purchaseOrderInsert
     * @return
     */
    public String insertPurchase(PurchaseOrderInsertInput purchaseOrderInsert) {
        String purchaseOrderId = purchaseOrderApi.insertPurchase(purchaseOrderInsert);
        /*
         * 断言：
         * 1. 采购订单列表
         * 2. 采购订单详情
         * */
        return purchaseOrderId;
    }

    /**
     * 提交库管
     *
     * @param inOrderId
     * @return
     */
    public String submitPurchase(String inOrderId) {
        String isSubmit = purchaseOrderApi.submitPurchase(inOrderId);
        /*
         * 断言：
         * 1. 采购入库审核列表多一条数据
         * 2. 采购订单状态变更为待审核
         * */
        return isSubmit;
    }

    /**
     * 修改采购订单
     *
     * @param purchaseOrderUpdate
     * @return
     */
    public Boolean modifyPurchase(PurchaseOrderUpdateInput purchaseOrderUpdate) {
        Boolean aBoolean = purchaseOrderApi.modifyPurchase(purchaseOrderUpdate);
        /*
         * 断言：
         * 1. 采购订单详情与修改后数据一致
         */
        return aBoolean;
    }

    /**
     * 取消采购订单
     *
     * @param cancelpurchase
     * @return
     */
    public Boolean cancelPurchase(CancelInOrderInput cancelpurchase) {
        Boolean aBoolean = purchaseOrderApi.cancelPurchase(cancelpurchase);

        /*
         * 断言：
         * 1. 订单状态变更为已取消
         */
        return aBoolean;
    }

}
