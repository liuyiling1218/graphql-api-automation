package com.hjfruit.test.pitaya.app.stock.other;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTest;
import com.hjfruit.test.pitaya.app.actions.stock.other.OtherInOrderAction;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@DisplayName("其他入库流程测试")
public class DefectiveOtherInOrderFlowTest extends PitayaAppBaseTest {
    @Autowired
    OtherInOrderAction otherInOrderAction;

    @Test
    @DisplayName("FLOW:新增-提交库管-全部入库")
    public void test_flow_create_submit_allIn() {

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
