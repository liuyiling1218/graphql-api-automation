package com.hjfruit.test.pitaya.app.entities.production.outorder;

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