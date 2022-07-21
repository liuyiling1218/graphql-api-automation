package com.hjfruit.test.pitaya.app.apis.production.task;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.annotation.NotEmpty;
import java.util.List;
import java.math.BigDecimal;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.app.entities.delivery.bill.api.*;
import com.hjfruit.test.pitaya.app.entities.user.*;
import com.hjfruit.test.pitaya.app.entities.label.*;
import com.hjfruit.test.pitaya.app.entities.convert.api.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.transfer.*;
import com.hjfruit.test.pitaya.app.entities.delivery.bill.type.*;
import com.hjfruit.test.pitaya.app.entities.production.common.*;
import com.hjfruit.test.pitaya.app.entities.common.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.api.*;
import com.hjfruit.test.pitaya.app.entities.statistics.type.*;
import com.hjfruit.test.pitaya.app.entities.production.inorder.api.*;
import com.hjfruit.test.pitaya.app.entities.statistics.api.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.type.*;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.type.*;
import com.hjfruit.test.pitaya.app.entities.base.config.*;
import com.hjfruit.test.pitaya.app.entities.delivery.order.type.*;
import com.hjfruit.test.pitaya.app.entities.*;
import com.hjfruit.test.pitaya.app.entities.statistics.*;
import com.hjfruit.test.pitaya.app.entities.production.task.*;
import com.hjfruit.test.pitaya.app.entities.stock.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.apply.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.type.*;
import com.hjfruit.test.pitaya.app.entities.base.user.*;
import com.hjfruit.test.pitaya.app.entities.convert.type.*;
import com.hjfruit.test.pitaya.app.entities.base.store.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.*;
import com.hjfruit.test.pitaya.app.entities.push.*;
import com.hjfruit.test.pitaya.app.entities.base.supplier.*;
import com.hjfruit.test.pitaya.app.entities.secondment.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.transfer.*;
import com.hjfruit.test.pitaya.app.entities.plan.*;
import com.hjfruit.test.pitaya.app.entities.production.order.*;
import com.hjfruit.test.pitaya.app.entities.delivery.order.api.*;
import com.hjfruit.test.pitaya.app.entities.base.customer.*;
import com.hjfruit.test.pitaya.app.entities.production.inorder.type.*;
import com.hjfruit.test.pitaya.app.entities.base.app.*;
import com.hjfruit.test.pitaya.app.entities.check.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import com.hjfruit.test.pitaya.app.entities.v2.common.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.*;
import com.hjfruit.test.pitaya.app.entities.cost.common.*;
import com.hjfruit.test.pitaya.app.entities.base.location.*;
import com.hjfruit.test.pitaya.app.entities.org.*;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface ProductionTaskApi {
    @GraphqlQuery("")
    TaskPageResult tasks(TaskCondition taskCondition,Page page);
    @GraphqlQuery("查询生产任务列表")
    TaskPageResult keywordTasks(String keyword,Page page);
    @GraphqlQuery("")
    TaskStatistics taskStatistics(Long date);
    @GraphqlQuery("")
    Task task(@Needed @ID String taskId);
    @GraphqlQuery("    库存列表（生产领料）")
    List<Stock> stocks(StockCondition stockCondition);
    @GraphqlQuery("    任务明细列表")
    List<TaskItem> taskItems(@Needed @ID String taskId);
    @GraphqlQuery("    生产任务操作记录")
    List<TaskLog> taskLogs(@Needed @ID String taskId);
    @GraphqlQuery("   任务详情记录统计")
    FabricationStatistics getFabricationStatistics(@ID String taskId);
    @GraphqlQuery("任务按钮选项")
    List<Option> fabricationOption(Integer code);
    @GraphqlQuery("完成任务确认列表弹框")
    ConfirmTaskFinishPayload confirmTaskFinish(@Needed @ID String taskId);
    @GraphqlQuery("报损出库（区别于其他操作的报损出库）")
    DamagedOrderPagePayload pageDamagedOrder(PageDamagedOrderInput pageDamagedOrderInput,Page page);
    @GraphqlQuery("报损出库数量统计")
    DamagedOrderStatisticsPayload damagedOrderStatistics(DamagedOrderStatisticsInput damagedOrderStatisticsInput);
    @GraphqlQuery("")
    Integer taskNoticeStatistic();
    @GraphqlMutation("开始任务")
    Boolean beginTask(BeginTask beginTask);
    @GraphqlMutation("    完成任务")
    Boolean completeTask(@Needed @ID String taskId);
    @GraphqlMutation("    领料申请保存，返回新增id")
    String addOutOrder(OutOrder outOrder);
    @GraphqlMutation("    生产入库保存，返回新增id")
    String addInOrder(InOrder inOrder);
    @GraphqlMutation("   报损出库新增（区别于其他操作的报损出库）")
    String createDamagedOrder(CreateDamagedOrderInput createDamagedOrderInput);
    @GraphqlMutation("   报损出库修改")
    Boolean updateDamagedOrder(UpdateDamagedOrderInput updateDamagedOrderInput);
}