package com.hjfruit.test.pitaya.app.stock.other;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTest;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.stock.other.OtherInOrderAction;
import com.hjfruit.test.pitaya.app.entities.production.outorder.CommodityStockBatchPayload;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@DisplayName("其他入库流程测试")
public class DefectiveOtherOutOrderFlowTest extends PitayaAppBaseTestV2 {
    @Autowired
    OtherInOrderAction otherInOrderAction;
    @Autowired
    CommodityHelper commodityHelper;
    @Test
    @DisplayName("FLOW:新增-提交库管-全部入库")
    public void test_flow_create_submit_allIn() {

        List<CommodityStockBatchPayload> commodityStockBatches = commodityHelper.getCommodityStockBatches(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.CommoditySkuType.DOUBLE_UNIT);
        System.out.println(commodityStockBatches);

    }

    @Test
    @DisplayName("FLOW:新增-提交库管-部分入库-全部入库")
    public void test_flow_create_submit_partIn_allIn() {

    }

    @Test
    @DisplayName("FLOW:新增-取消")
    public void test_flow_create_cancel() {

    }

    @Test
    @DisplayName("FLOW:新增-修改-提交库管_partIn_allIn")
    public void test_flow_create_update_submit() {

    }

    @Test
    @DisplayName("FLOW:新增-修改-提交库管_全部入库")
    public void test_flow_create_update_submit_allIn() {

    }
}
