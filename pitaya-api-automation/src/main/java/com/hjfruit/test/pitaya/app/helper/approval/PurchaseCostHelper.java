package com.hjfruit.test.pitaya.app.helper.approval;

import com.hjfruit.test.pitaya.app.actions.cost.CostOrderAction;
import com.hjfruit.test.pitaya.app.entities.cost.UpdateCostStatusInput;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PurchaseCostHelper {
    @Autowired
    CostOrderAction costOrderAction;

    /**
     * 驳回订单
     */
    public Boolean reject(String billId) {
        UpdateCostStatusInput updateCostStatusInput = new UpdateCostStatusInput();
        updateCostStatusInput.setBillId(billId);
        updateCostStatusInput.setStatus(PitayaConstants.CostOrderStatus.WAIT_BUSINESS_AUDIT.getStatusId());
        updateCostStatusInput.setRemark(RandomStringUtils.random(30));
        return costOrderAction.updateCostStatus(updateCostStatusInput);
    }

    /**
     * 审核通过
     */
    public Boolean complete(String billId) {
        UpdateCostStatusInput updateCostStatusInput = new UpdateCostStatusInput();
        updateCostStatusInput.setBillId(billId);
        updateCostStatusInput.setStatus(PitayaConstants.CostOrderStatus.COMPLETED.getStatusId());
        return costOrderAction.updateCostStatus(updateCostStatusInput);
    }

}
