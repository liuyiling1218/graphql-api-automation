package com.hjfruit.test.pitaya.app.helper.transfer;

import com.hjfruit.test.pitaya.app.apis.production.outorder.OutOrderMutationApi;
import com.hjfruit.test.pitaya.app.entities.production.outorder.CancelOutOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.ConfirmOutOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.FinishOutOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.outorder.RejectOutOrderInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OutOrderMutationAction {
    @Autowired
    OutOrderMutationApi outOrderMutationApi;

    /**
     * 提交库管
     *
     * @param outOrderId
     * @return
     */
    public Boolean submitOutOrder(String outOrderId) {
        Boolean aBoolean = outOrderMutationApi.submitOutOrder(outOrderId);
        return aBoolean;
    }

    /**
     * 取消报损订单
     *
     * @param cancelOutOrderInput
     * @return
     */
    public Boolean cancelOutOrder(CancelOutOrderInput cancelOutOrderInput) {
        Boolean aBoolean = outOrderMutationApi.cancelOutOrder(cancelOutOrderInput);
        return aBoolean;
    }

    /**
     * 驳回订单
     *
     * @param rejectOutOrderInput
     * @return
     */
    public Boolean rejectOutOrderAudit(RejectOutOrderInput rejectOutOrderInput) {
        Boolean aBoolean = outOrderMutationApi.rejectOutOrderAudit(rejectOutOrderInput);
        return aBoolean;
    }

    /**
     * 完成出库
     *
     * @param finishOutOrderInput
     * @return
     */
    public Boolean finishOutOrder(FinishOutOrderInput finishOutOrderInput) {
        Boolean aBoolean = outOrderMutationApi.finishOutOrder(finishOutOrderInput);
        return aBoolean;
    }

    /**
     * 确认出库
     *
     * @param confirmOutOrderInput
     * @return
     */
    public Boolean confirmOutOrder(ConfirmOutOrderInput confirmOutOrderInput) {
        Boolean aBoolean = outOrderMutationApi.confirmOutOrder(confirmOutOrderInput);
        return aBoolean;
    }

}
