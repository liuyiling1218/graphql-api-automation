package com.hjfruit.test.pitaya.app.apis.plan;

import com.hjfruit.test.pitaya.app.entities.plan.AddOrDeleteRecords;
import com.hjfruit.test.pitaya.app.entities.plan.AddOrDeleteRecordsInput;
import com.hjfruit.test.pitaya.app.entities.plan.PauseOrContinueTaskInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface PlanTaskApi {
    @GraphqlQuery(" 增减记录列表")
    List<AddOrDeleteRecords> addOrDeleteRecords(AddOrDeleteRecordsInput addOrDeleteRecordsInput);
    @GraphqlMutation(" 暂停/继续生产任务")
    Boolean pauseOrContinueTask(PauseOrContinueTaskInput pauseOrContinueTaskInput);
    @GraphqlMutation("任务退回")
    Boolean taskReturned(@ID String taskId);
}