package com.hjfruit.test.pitaya.app.actions.production.outorder;

import com.hjfruit.test.pitaya.app.apis.production.outorder.TransferOutOrderApi;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.order.ListTransferOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.order.ListTransferOrderPayload;
import com.hjfruit.test.pitaya.app.entities.production.order.TransferOrderPayload;
import com.hjfruit.test.pitaya.app.entities.production.order.UpdateTransferCommodityInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.CreateTransferOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.GetTransferOutOrderStatusInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.GetTransferOutOrderStatusPayload;
import fc.test.api.graphql.annotation.GraphqlQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransferOutOrderAction {
    @Autowired
    TransferOutOrderApi transferOutOrderApi;

    /**
     * 新增调拨出库单
     *
     * @param createTransferOrderInput
     * @return
     */
    public String createTransferOutOrder(CreateTransferOrderInput createTransferOrderInput) {
        String transferOutOrderId = transferOutOrderApi.createTransferOutOrder(createTransferOrderInput);

        return transferOutOrderId;
    }

    /**
     * 修改调拨出库单
     *
     * @param updateTransferCommodityInput
     * @return
     */
    public String updateTransferOutOrder(UpdateTransferCommodityInput updateTransferCommodityInput) {
        String transferOutOrderId = transferOutOrderApi.updateTransferOutOrder(updateTransferCommodityInput);
        return transferOutOrderId;
    }

    /**
     * 查询调拨出库订单
     *
     * @param listTransferOrderInput
     * @param page
     * @return
     */
    public ListTransferOrderPayload listTransferOutOrder(ListTransferOrderInput listTransferOrderInput, Page page) {
        return transferOutOrderApi.listTransferOutOrder(listTransferOrderInput, page);
    }

    @GraphqlQuery("查询调拨出库订单")
    public TransferOrderPayload getTransferOutOrder(String flowId) {
        return transferOutOrderApi.getTransferOutOrder(flowId);
    }


    @GraphqlQuery("查询调拨出库订单状态值")
    public GetTransferOutOrderStatusPayload getTransferOutOrderStatus(GetTransferOutOrderStatusInput getTransferOutOrderStatusInput) {
        return transferOutOrderApi.getTransferOutOrderStatus(getTransferOutOrderStatusInput);
    }
}