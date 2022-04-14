package com.hjfruit.test.pitaya.app.actions.production.inorder;

import com.hjfruit.test.pitaya.app.apis.production.inorder.AcquireOrderApi;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import fc.test.api.graphql.annotation.Needed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 采购业务
 */
@Component
public class AcquireOrderAction {
    @Autowired
    AcquireOrderApi acquireOrderApi;

    /**
     * 查询采购订单
     *
     * @param listAcquireFilter
     * @param page
     * @return
     */
    public AcquirePageResultPayload listAcquire(ListAcquireFilter listAcquireFilter, Page page) {
        return acquireOrderApi.listAcquire(listAcquireFilter, page);
    }

    /**
     * 查询采购订单详情
     *
     * @param getAcquireInput
     * @return
     */
    public AcquirePayload getAcquire(@Needed GetAcquireInput getAcquireInput) {
        return acquireOrderApi.getAcquire(getAcquireInput);

    }

    /**
     * 查询采购订单不同状态记录条数
     *
     * @param countAcquireFilter
     * @return
     */
    public CountAcquirePayload countAcquire(CountAcquireFilter countAcquireFilter) {
        return acquireOrderApi.countAcquire(countAcquireFilter);
    }

    /**
     * 新增采购
     *
     * @param createAcquireInput
     * @return
     */
    public String createAcquire(CreateAcquireInput createAcquireInput) {
        String acquireOrderId = acquireOrderApi.createAcquire(createAcquireInput);

        /*
         * 断言：
         */
        return acquireOrderId;
    }

    /**
     * 修改采购订单
     *
     * @param updateAcquireInput
     * @return
     */
    public Boolean updateAcquire(UpdateAcquireInput updateAcquireInput) {
        Boolean aBoolean = acquireOrderApi.updateAcquire(updateAcquireInput);
        /*
         * 断言：
         */
        return aBoolean;
    }

    /**
     * 提交库管
     *
     * @param submitAcquireInput
     * @return
     */
    public String submitAcquire(SubmitAcquireInput submitAcquireInput) {
        String s = acquireOrderApi.submitAcquire(submitAcquireInput);

        /*
         * 断言：
         */
        return s;
    }

    /**
     * 取消采购订单
     *
     * @param cancelAcquireInput
     * @return
     */
    public Boolean cancelAcquire(CancelAcquireInput cancelAcquireInput) {
        Boolean cancelAcquire = acquireOrderApi.cancelAcquire(cancelAcquireInput);
        /*
         * 断言：
         */

        return cancelAcquire;
    }
}
