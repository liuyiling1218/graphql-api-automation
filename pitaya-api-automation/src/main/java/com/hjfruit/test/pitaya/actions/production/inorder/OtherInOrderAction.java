package com.hjfruit.test.pitaya.actions.production.inorder;

import com.hjfruit.test.pitaya.apis.production.inorder.OtherInOrderApi;
import com.hjfruit.test.pitaya.constants.PitayaConstants;
import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.inorder.CreateOtherInOrderInput;
import com.hjfruit.test.pitaya.entities.production.inorder.PageOtherInOrderInput;
import com.hjfruit.test.pitaya.entities.production.inorder.PageOtherInOrderPayload;
import com.hjfruit.test.pitaya.utils.TimeUtil;
import fc.test.api.graphql.annotation.GraphqlMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Component
public class OtherInOrderAction {

    @Autowired
    OtherInOrderApi otherInOrderApi;

    @GraphqlMutation("其他入库")
    public String createOtherInOrder(CreateOtherInOrderInput createOtherInOrderInput) {
        String id = otherInOrderApi.createOtherInOrder(createOtherInOrderInput);
        assertThat(id).isNotNull();
        return id;
    }
    @GraphqlMutation("提交库管")
    public String submitOtherInOrder(String inOrderId){
        PageOtherInOrderInput pageOtherInOrderInput = new PageOtherInOrderInput();
        pageOtherInOrderInput.setStartTime(TimeUtil.getDailyStartTime(System.currentTimeMillis()));
        pageOtherInOrderInput.setEndTime(TimeUtil.getDailyEndTime(System.currentTimeMillis()));
        pageOtherInOrderInput.setInOrderTypeId(PitayaConstants.InOrderType.OTHER_IN_APPLY.getTypeCode());
        PageOtherInOrderPayload pageOtherInOrder = otherInOrderApi.pageOtherInOrder(pageOtherInOrderInput, new Page());
        assertThat(pageOtherInOrder.getRecords().get(0).getInOrderId()).isEqualTo(inOrderId);
        String s = otherInOrderApi.submitOtherInOrder(inOrderId);
        assertThat(s).isNotNull();
        return s;
    }

}
