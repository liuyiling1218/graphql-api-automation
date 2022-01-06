package com.hjfruit.test.operation.web.entities.label;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class BatchDeleteLabelsInput {
    /**
     * 标签id
     */
    private List<Integer> labelId;
    /**
     * 要求补充类型 10:规格要求 20：品质要求
     */
    private Integer requestType;
}