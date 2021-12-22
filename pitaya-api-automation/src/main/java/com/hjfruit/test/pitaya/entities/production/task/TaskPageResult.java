package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

import java.util.List;

/**
 * 分页对象
 */
@Data
public class TaskPageResult {
    /**
     *
     */
    private List<Tasks> records;
    /**
     *
     */
    private Integer pageCurrent;
    /**
     *
     */
    private Integer pageSize;
    /**
     *
     */
    private Long totalRecords;
}