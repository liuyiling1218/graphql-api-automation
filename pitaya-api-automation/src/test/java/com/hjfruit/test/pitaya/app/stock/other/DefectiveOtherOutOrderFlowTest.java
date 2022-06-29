package com.hjfruit.test.pitaya.app.stock.other;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.production.outorder.TransferOutOrderAction;
import com.hjfruit.test.pitaya.app.actions.stock.other.OtherOutOrderAction;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.transfer.TransferOrderHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;


@DisplayName("其他出库流程测试")
public class DefectiveOtherOutOrderFlowTest extends PitayaAppBaseTestV2 {
    @Autowired
    OtherOutOrderAction otherOutOrderAction;
    @Autowired
    CommodityHelper commodityHelper;
    @Autowired
    TransferOrderHelper transferOrderHelper;

    @Test
    @DisplayName("新增原料-修改订单-提交库管-全部出库")
    public void test_flow_create_submit_allIn() {
        String otherOutOrder = otherOutOrderAction.createOtherOutOrder(PitayaConstants.CommodityType.RAW_MATERIAL);
        otherOutOrderAction.updateOtherOutOrder(otherOutOrder);
        otherOutOrderAction.submitOutOrder(otherOutOrder);
        transferOrderHelper.confirmOutOrder(otherOutOrder);

    }

    @Test
    @DisplayName("新增辅料-修改订单-提交库管-全部出库")
    public void test_flow_create_submit_partIn_allIn() {
        String otherOutOrder = otherOutOrderAction.createOtherOutOrder(PitayaConstants.CommodityType.ASSIST);
        otherOutOrderAction.updateOtherOutOrder(otherOutOrder);
        otherOutOrderAction.submitOutOrder(otherOutOrder);
        transferOrderHelper.confirmOutOrder(otherOutOrder);
    }

    @Test
    @DisplayName("新增成品-修改订单-提交库管-全部出库")
    public void test_flow_create_cancel() {
        String otherOutOrder = otherOutOrderAction.createOtherOutOrder(PitayaConstants.CommodityType.PRODUCT);
        otherOutOrderAction.updateOtherOutOrder(otherOutOrder);
        otherOutOrderAction.submitOutOrder(otherOutOrder);
        transferOrderHelper.confirmOutOrder(otherOutOrder);
    }

    @Test
    @DisplayName("新增半成品-修改订单-提交库管-全部出库")
    public void test_flow_create_update_submit() {
        String otherOutOrder = otherOutOrderAction.createOtherOutOrder(PitayaConstants.CommodityType.HALF_PRODUCT);
        otherOutOrderAction.updateOtherOutOrder(otherOutOrder);
        otherOutOrderAction.submitOutOrder(otherOutOrder);
        transferOrderHelper.confirmOutOrder(otherOutOrder);
    }

    @Test
    @DisplayName("新增次品-修改订单-提交库管-全部出库")
    public void test_flow_create_update_submit_allIn() {
        String otherOutOrder = otherOutOrderAction.createOtherOutOrder(PitayaConstants.CommodityType.DEFECTIVE);
        otherOutOrderAction.updateOtherOutOrder(otherOutOrder);
        otherOutOrderAction.submitOutOrder(otherOutOrder);
        transferOrderHelper.confirmOutOrder(otherOutOrder);

    }

    @Test
    @DisplayName("新增退货品-修改订单-提交库管-全部出库")
    public void test_flow_create_update_submit_Returned() {
        String otherOutOrder = otherOutOrderAction.createOtherOutOrder(PitayaConstants.CommodityType.REBACK);
        otherOutOrderAction.updateOtherOutOrder(otherOutOrder);
        otherOutOrderAction.submitOutOrder(otherOutOrder);
        transferOrderHelper.confirmOutOrder(otherOutOrder);
    }

    @Test
    @DisplayName("新增周转筐-修改订单-提交库管-全部出库")
    public void test_flow_create_update_submit_turnover_basket() {
        String otherOutOrder = otherOutOrderAction.createOtherOutOrder(PitayaConstants.CommodityType.BOX);
        otherOutOrderAction.updateOtherOutOrder(otherOutOrder);
        otherOutOrderAction.submitOutOrder(otherOutOrder);
        transferOrderHelper.confirmOutOrder(otherOutOrder);

    }

    @Test
    @DisplayName("新增采购-提交库管-驳回-再次提交-全部入库")
    public void test_flow_create_update_submit_turn_submit_Warehousing() {
        String otherOutOrder = otherOutOrderAction.createOtherOutOrder(PitayaConstants.CommodityType.RAW_MATERIAL);
        otherOutOrderAction.updateOtherOutOrder(otherOutOrder);
        otherOutOrderAction.submitOutOrder(otherOutOrder);
        transferOrderHelper.reject(otherOutOrder);
        otherOutOrderAction.submitOutOrder(otherOutOrder);
        transferOrderHelper.confirmOutOrder(otherOutOrder);
    }

    @Test
    @DisplayName("新增采购-提交库管-部分入库-完成入库")
    public void test_flow_create_update_submit_Partial_storage_Complete_warehousing() {
        String otherOutOrder = otherOutOrderAction.createOtherOutOrder(PitayaConstants.CommodityType.RAW_MATERIAL);
        otherOutOrderAction.updateOtherOutOrder(otherOutOrder);
        otherOutOrderAction.submitOutOrder(otherOutOrder);
        transferOrderHelper.PartOut(otherOutOrder);
        transferOrderHelper.completeOut(otherOutOrder);
    }
}