package com.hjfruit.test.pitaya.app.entities.plan;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePlanTaskInput {
    /**
     *
     */
    private Integer leaderId;
    /**
     *
     */
    private String leaderName;
    /**
     *
     */
    private Integer line;
    /**
     * 10：分配 20：暂不分配
     */
    private Integer assignmentType;
    /**
     *
     */
    @Needed
    private List<UpdateTaskItemInput> updateTaskItemInput;
}