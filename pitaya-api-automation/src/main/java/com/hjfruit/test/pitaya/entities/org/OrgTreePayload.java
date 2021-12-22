package com.hjfruit.test.pitaya.entities.org;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class OrgTreePayload {
    /**
     * 组织id
     */
    private Integer key;
    /**
     * 组织名称
     */
    private String name;
    /**
     * 系统id
     */
    private Integer appId;
    /**
     * 是否禁用
     */
    private Boolean disable;
    /**
     * 子节点
     */
    private List<OrgTreePayload> children;
}