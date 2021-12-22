package com.hjfruit.test.pitaya.entities.plan;

import lombok.Data;

/**
 *
 */
@Data
public class PauseOrContinueTaskInput {
    /**
     *
     */
    private String taskId;
    /**
     *
     */
    private Integer taskStatusCode;
}