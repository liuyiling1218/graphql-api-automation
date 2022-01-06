package com.hjfruit.test.operation.web.entities.commodity;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class VarietyGroupInput {
    /**
     * 品种组id
     */
    private Integer groupId;
    /**
     * 品种组名称
     */
    @Needed
    private String groupName;
    /**
     * 组织id
     */
    private List<Integer> orgIds;
}