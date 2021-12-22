package com.hjfruit.test.pitaya.apis.plan;

import com.hjfruit.test.pitaya.entities.plan.AddOrDeleteRecords;
import com.hjfruit.test.pitaya.entities.plan.AddOrDeleteRecordsInput;
import com.hjfruit.test.pitaya.entities.plan.PauseOrContinueTaskInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.ID;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface PlanTaskApi {
    @GraphqlQuery(" 增减记录列表")
    List<AddOrDeleteRecords> addOrDeleteRecords(AddOrDeleteRecordsInput addOrDeleteRecordsInput);

    @GraphqlMutation(" 暂停/继续生产任务")
    Boolean pauseOrContinueTask(PauseOrContinueTaskInput pauseOrContinueTaskInput);

    @GraphqlMutation("任务退回")
    Boolean taskReturned(@ID String taskId);
}