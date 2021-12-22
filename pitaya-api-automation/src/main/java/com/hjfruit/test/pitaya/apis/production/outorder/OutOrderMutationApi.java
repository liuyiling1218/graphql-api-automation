package com.hjfruit.test.pitaya.apis.production.outorder;

import com.hjfruit.test.pitaya.entities.production.outorder.CancelOutOrderInput;
import com.hjfruit.test.pitaya.entities.production.outorder.ConfirmOutOrderInput;
import com.hjfruit.test.pitaya.entities.production.outorder.FinishOutOrderInput;
import com.hjfruit.test.pitaya.entities.production.outorder.RejectOutOrderInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.annotation.Needed;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface OutOrderMutationApi {
    @GraphqlMutation("提交库管")
    Boolean submitOutOrder(@Needed @ID String outOrderId);

    @GraphqlMutation("取消报损订单")
    Boolean cancelOutOrder(CancelOutOrderInput cancelOutOrderInput);

    @GraphqlMutation("驳回订单")
    Boolean rejectOutOrderAudit(RejectOutOrderInput rejectOutOrderInput);

    @GraphqlMutation("完成出库")
    Boolean finishOutOrder(FinishOutOrderInput finishOutOrderInput);

    @GraphqlMutation("确认出库")
    Boolean confirmOutOrder(ConfirmOutOrderInput confirmOutOrderInput);
}