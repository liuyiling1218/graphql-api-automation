package com.hjfruit.test.pitaya.app.helper.purchase;

import com.hjfruit.test.pitaya.app.actions.cost.CostOrderAction;
import com.hjfruit.test.pitaya.app.entities.cost.apply.UpdateCostStatusInput;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RawMeterialPurchaseBillOrderHelper {

    @Autowired
    CostOrderAction costOrderAction;

    /**
     * 提交财务
     */
    public Boolean submit(String billId) {
        UpdateCostStatusInput updateCostStatusInput = new UpdateCostStatusInput();
        updateCostStatusInput.setBillId(billId);
        updateCostStatusInput.setStatus(PitayaConstants.CostOrderStatus.WAIT_FINANCE_AUDIT.getStatusId());
        return costOrderAction.updateCostStatus(updateCostStatusInput);
    }


}