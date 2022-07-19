package com.hjfruit.test.pitaya.app.actions.task;

import com.hjfruit.test.pitaya.app.apis.plan.PlanApi;
import com.hjfruit.test.pitaya.app.apis.plan.PlanTaskApi;
import com.hjfruit.test.pitaya.app.apis.production.task.ProductionTaskApi;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.plan.PauseOrContinueTaskInput;
import com.hjfruit.test.pitaya.app.entities.plan.ProductionPlanDetailPayload;
import com.hjfruit.test.pitaya.app.entities.production.task.BeginTask;
import com.hjfruit.test.pitaya.app.entities.production.task.TaskCondition;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import com.hjfruit.test.pitaya.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@Component
public class TaskAciton {
    @Autowired
    ProductionTaskApi productionTaskApi;
    @Autowired
    PlanTaskApi planTaskApi;
    @Autowired
    PlanApi planApi;

    /**
     * 开始任务
     * @param planId
     * @return
     */
  public Boolean beginTask(String planId){
      ProductionPlanDetailPayload productionPlanDetail = planApi.getProductionPlanDetail(planId);
      String taskId = productionPlanDetail.getTask().get(0).getTaskId();
      BeginTask beginTask= BeginTask.builder().taskId(taskId).numberActual(10).tempWorkerQuantity(20).build();
      //详情页断言
      Boolean aBoolean = productionTaskApi.beginTask(beginTask);
      assertThat(productionTaskApi.task(taskId).getTaskStatus()).isEqualTo(PitayaConstants.TaskStatus.IN_PRODUCTION.getCode());
      //单据数量断言
      assertThat(productionTaskApi.getFabricationStatistics(taskId).getPickingRecord()).isEqualTo(0);
      //状态栏数量统计
      assertThat(productionTaskApi.taskStatistics(TimeUtil.getCurrentTimeStamp()).getInProduction()).isNotEqualTo(0);
      //列表断言
      TaskCondition taskCondition=TaskCondition.builder().taskStatus(PitayaConstants.TaskStatus.IN_PRODUCTION.getCode()).date(TimeUtil.getCurrentTimeStamp()).build();
      assertThat(productionTaskApi.tasks(taskCondition,new Page(1,10)).getRecords().stream().anyMatch(o->o.getTaskId().equals(taskId))).isTrue();
      //查询功能
      assertThat(productionTaskApi.keywordTasks("s",new Page(1,10)).getRecords()).isNotNull();
      return aBoolean;

  }
    /**
     * 暂停任务
     */
    public Boolean pauseOrContinueTask(String planId){
        ProductionPlanDetailPayload productionPlanDetail = planApi.getProductionPlanDetail(planId);
        String taskId = productionPlanDetail.getTask().get(0).getTaskId();
        PauseOrContinueTaskInput pauseOrContinueTaskInput=PauseOrContinueTaskInput.builder().taskId(taskId).taskStatusCode(PitayaConstants.TaskStatus.TERMINATION.getCode()).build();
        return planTaskApi.pauseOrContinueTask(pauseOrContinueTaskInput);


    }








}
