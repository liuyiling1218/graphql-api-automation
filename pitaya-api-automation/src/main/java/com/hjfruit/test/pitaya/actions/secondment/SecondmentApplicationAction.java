package com.hjfruit.test.pitaya.actions.secondment;

import com.hjfruit.test.pitaya.apis.secondment.SecondmentApi;
import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.secondment.SecondmentInput;
import com.hjfruit.test.pitaya.entities.secondment.SecondmentPageInput;
import com.hjfruit.test.pitaya.entities.secondment.SecondmentQueryPayload;
import com.hjfruit.test.pitaya.entities.secondment.SecondmentStatusInput;
import fc.test.api.graphql.annotation.GraphqlMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 借调业务
 */
@Component
public class SecondmentApplicationAction {
    @Autowired
    SecondmentApi secondmentApi;

    @GraphqlMutation("新增借调申请")
    public String insertSecondment(SecondmentInput secondmentInput) {
        String id = secondmentApi.insertSecondment(secondmentInput);
        assertThat(id).isNotNull();
        //借调申请列表断言
        SecondmentPageInput secondmentPageInput = new SecondmentPageInput();
        secondmentPageInput.setDate(System.currentTimeMillis());
        SecondmentQueryPayload pageUserSecondment = secondmentApi.pageUserSecondment(new Page(), secondmentPageInput);
        assertThat(pageUserSecondment.getRecords().get(0).getSecondmentId()).isEqualTo(id);
        return id;
    }

    @GraphqlMutation("提交审核")
    public String changeSecondmentStatus(SecondmentStatusInput secondmentStatusInput) {
        String id = secondmentApi.changeSecondmentStatus(secondmentStatusInput);
        assertThat(id).isNotNull();
        return id;
    }


}
