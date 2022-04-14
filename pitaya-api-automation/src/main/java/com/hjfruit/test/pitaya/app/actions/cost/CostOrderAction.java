package com.hjfruit.test.pitaya.app.actions.cost;

import com.hjfruit.test.pitaya.app.apis.cost.CostOrderApi;
import com.hjfruit.test.pitaya.app.entities.Option;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.cost.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CostOrderAction {
    @Autowired
    CostOrderApi costOrderApi;

    /**
     * 分页查询费用单信息
     *
     * @param pageCostOrderInput
     * @param page
     * @return
     */
    public PageCostOrderPayload pageCostOrder(PageCostOrderInput pageCostOrderInput, Page page) {
        return costOrderApi.pageCostOrder(pageCostOrderInput, page);
    }

    /**
     * 获取费用单详情
     *
     * @param billId
     * @return
     */
    public CostOrderPayload getCostOrderDetail(String billId) {
        return costOrderApi.getCostOrderDetail(billId);
    }

    /**
     * 查询未提交费用单条数
     *
     * @return
     */
    public CountCostOrderPayload countNotSubmitCostOrder() {
        return costOrderApi.countNotSubmitCostOrder();
    }

    /**
     * 查询费用类型下拉框选项
     *
     * @return
     */
    public List<Option> freightCostOption() {
        return costOrderApi.freightCostOption();
    }

    /**
     * 修改费用单
     *
     * @param updateCostOrderInput
     * @return
     */
    public String updateCostOrder(UpdateCostOrderInput updateCostOrderInput) {
        String costOrderId = costOrderApi.updateCostOrder(updateCostOrderInput);
        /*
         * 断言：
         */
        return costOrderId;
    }

    /**
     * 变更费用单状态
     *
     * @param updateCostStatusInput
     * @return
     */
    public Boolean updateCostStatus(UpdateCostStatusInput updateCostStatusInput) {
        Boolean aBoolean = costOrderApi.updateCostStatus(updateCostStatusInput);
        /*
         * 断言：
         */
        return aBoolean;
    }
}
