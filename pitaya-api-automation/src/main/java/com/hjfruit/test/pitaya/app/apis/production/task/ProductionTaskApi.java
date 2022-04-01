package com.hjfruit.test.pitaya.app.apis.production.task;

import com.hjfruit.test.pitaya.app.entities.Option;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.production.task.*;
import fc.test.api.graphql.annotation.*;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface ProductionTaskApi {
    @GraphqlQuery("生产任务列表")
    TaskPageResult tasks(TaskCondition taskCondition, Page page);

    @GraphqlQuery("查询生产任务列表")
    TaskPageResult keywordTasks(String keyword, Page page);

    @GraphqlQuery("    生产任务统计")
    TaskStatistics taskStatistics(Long date);

    @GraphqlQuery("    生产任务详情")
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
    DamagedOrderPagePayload pageDamagedOrder(PageDamagedOrderInput pageDamagedOrderInput, Page page);

    @GraphqlQuery("报损出库数量统计")
    DamagedOrderStatisticsPayload damagedOrderStatistics(DamagedOrderStatisticsInput damagedOrderStatisticsInput);

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