package com.hjfruit.test.operation.web.entities.commodity;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class VarietyGroup {
    /**
     * 品种组id
     */
    private Integer groupId;
    /**
     * 品种组名称
     */
    private String groupName;
    /**
     * 组织id
     */
    private List<Integer> orgIds;
    /**
     * 组织名称
     */
    private List<String> orgName;
}