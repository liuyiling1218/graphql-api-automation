package com.hjfruit.test.operation.web.entities.customer;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class UpdatePinyinInput {
    /**
     * 客户id集
     */
    private List<Integer> ids;
}