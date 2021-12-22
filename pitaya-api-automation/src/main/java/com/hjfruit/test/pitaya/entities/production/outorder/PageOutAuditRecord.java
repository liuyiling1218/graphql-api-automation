package com.hjfruit.test.pitaya.entities.production.outorder;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class PageOutAuditRecord {
    /**
     *
     */
    private List<AuditOutOrder> auditOutOrders;
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