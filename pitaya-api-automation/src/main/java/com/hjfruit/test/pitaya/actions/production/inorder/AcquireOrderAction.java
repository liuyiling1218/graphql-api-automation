package com.hjfruit.test.pitaya.actions.production.inorder;

import com.hjfruit.test.pitaya.apis.production.inorder.AcquireOrderApi;
import com.hjfruit.test.pitaya.entities.Page;
import com.hjfruit.test.pitaya.entities.production.inorder.AcquirePageResultPayload;
import com.hjfruit.test.pitaya.entities.production.inorder.CreateAcquireInput;
import com.hjfruit.test.pitaya.entities.production.inorder.ListAcquireFilter;
import com.hjfruit.test.pitaya.entities.production.inorder.SubmitAcquireInput;
import fc.test.api.graphql.annotation.GraphqlMutation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * 采购业务
 */
@Component
public class AcquireOrderAction {
    @Autowired
    AcquireOrderApi acquireOrderApi;

    @GraphqlMutation("新增采购 返回inOrderId")
    public String createAcquire(CreateAcquireInput createAcquireInput) {
        String acquireOrderId = null;
        try {
            acquireOrderId = acquireOrderApi.createAcquire(createAcquireInput);
        } catch (Exception e) {
            assertThat(e.getMessage()).isEqualTo("创建失败");
        }

        /*
         * 断言:
         * 1. 采购列表接口 增加一条数据
         *
         * */
        ListAcquireFilter listAcquireFilter = new ListAcquireFilter();
        listAcquireFilter.setStartTime(1639670400000L);
        listAcquireFilter.setEndTime(1640275140000L);
        listAcquireFilter.setCommodityType(createAcquireInput.getCommodityType());
        listAcquireFilter.setApplyStatus(10);
        AcquirePageResultPayload acquirePageResultPayload = acquireOrderApi.listAcquire(listAcquireFilter, new Page());
        assertThat(acquirePageResultPayload.getRecords().get(0).getApplyId()).isEqualTo(acquireOrderId);
        return acquireOrderId;
    }


    @GraphqlMutation("提交库管")
    public String submitAcquire(SubmitAcquireInput submitAcquireInput) {
        String s = acquireOrderApi.submitAcquire(submitAcquireInput);


        /*
         * 断言：
         * 1. 采购订单状态变更为待审核
         * */
        return s;
    }


}
