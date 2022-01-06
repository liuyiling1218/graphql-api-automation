package com.hjfruit.test.pitaya.app.secondment;

import com.hjfruit.test.pitaya.actions.secondment.SecondmentApplicationAction;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTest;
import com.hjfruit.test.pitaya.constants.PitayaConstants;
import com.hjfruit.test.pitaya.entities.secondment.SecondmentInput;
import com.hjfruit.test.pitaya.entities.secondment.SecondmentStatusInput;
import com.hjfruit.test.pitaya.utils.YamlUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class InsertSecondmentTest extends PitayaAppBaseTest {
    @Autowired
    SecondmentApplicationAction secondmentApplicationAction;

    @DisplayName("借调流程")
    @Test
    void InsertSecondment(){

        String Id = secondmentApplicationAction.insertSecondment(YamlUtil.loadAs(SecondmentInput.class));
        //提交审核借调订单审核
        SecondmentStatusInput secondmentStatusInput =new SecondmentStatusInput();
        secondmentStatusInput.setSecondmentId(Id);
        secondmentStatusInput.setSecondmentStatus(PitayaConstants.SecondmentStatus.TO_BE_AUDIT.getSecondmentStatusId());
        secondmentApplicationAction.changeSecondmentStatus(secondmentStatusInput);
        //审核通过
        secondmentStatusInput.setSecondmentStatus(PitayaConstants.SecondmentStatus.FINISHED.getSecondmentStatusId());
        secondmentApplicationAction.changeSecondmentStatus(secondmentStatusInput);

    }
















}
