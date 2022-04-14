package com.hjfruit.test.pitaya.app.actions.production.outorder;

import com.hjfruit.test.pitaya.app.apis.production.outorder.OutOrderApi;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OutOrderAction {
    @Autowired
    OutOrderApi outOrderApi;

    /**
     * 查询订单详情
     *
     * @param outOrderInput
     * @return
     */
    public OutOrderPayload outOrder(OutOrderInput outOrderInput) {
        return outOrderApi.outOrder(outOrderInput);
    }

    /**
     * 查询订单商品项
     *
     * @param outOrderItemsInput
     * @return
     */
    public List<OutOrderItemPayload> outOrderItems(OutOrderItemsInput outOrderItemsInput) {
        return outOrderApi.outOrderItems(outOrderItemsInput);
    }

    /**
     * 查询订单操作日志
     *
     * @param outOrderLogsInput
     * @return
     */
    public List<OutOrderLogPayLoad> outOrderLogs(OutOrderLogsInput outOrderLogsInput) {
        return outOrderApi.outOrderLogs(outOrderLogsInput);
    }

    /**
     * 出库申请单分页接口
     *
     * @param pageOutOrderInput
     * @param page
     * @return
     */
    public OutOrderPagePayload pageOutOrder(PageOutOrderInput pageOutOrderInput, Page page) {
        return outOrderApi.pageOutOrder(pageOutOrderInput, page);
    }

    /**
     * 状态数量查询接口
     *
     * @param countOutOrderStatusInput
     * @return
     */
    public OutOrderStatusCountPayload countOutOrderStatus(CountOutOrderStatusInput countOutOrderStatusInput) {
        return outOrderApi.countOutOrderStatus(countOutOrderStatusInput);
    }

    /**
     * 根据出库类型查询待办数量
     *
     * @param countOutOrderTypeInput
     * @return
     */
    public OutOrderTypeCountPayload countOutOrderType(CountOutOrderTypeInput countOutOrderTypeInput) {
        return outOrderApi.countOutOrderType(countOutOrderTypeInput);
    }

    /**
     * 完成出库确认框
     *
     * @param outOrderId
     * @return
     */
    public ConfirmOutOrderStatisticsPayload confirmOutOrderStatistics(String outOrderId) {
        return outOrderApi.confirmOutOrderStatistics(outOrderId);
    }
}