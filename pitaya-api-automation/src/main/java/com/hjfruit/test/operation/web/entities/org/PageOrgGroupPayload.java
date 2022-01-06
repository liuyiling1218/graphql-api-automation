package com.hjfruit.test.operation.web.entities.org;

import lombok.Data;

import java.util.List;

/**
 * 组织架构分页数据
 */
@Data
public class PageOrgGroupPayload {
    /**
     *
     */
    private List<OrgGroupPayload> records;
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
    private Integer totalRecords;
}