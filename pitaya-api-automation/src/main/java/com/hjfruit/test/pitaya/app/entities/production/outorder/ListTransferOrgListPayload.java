package com.hjfruit.test.pitaya.app.entities.production.outorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListTransferOrgListPayload {
    /**
     * 主键ID
     */
    private Integer id;
    /**
     * 组织名称（必填）
     */
    private String orgName;
    /**
     * 租户id（必填）
     */
    private Long tenantId;
    /**
     * 负责人
     */
    private Integer leadingId;
    /**
     * 备注
     */
    private String remark;
    /**
     * 父级ID（必填）
     */
    private Integer parentId;
    /**
     * 父级名称（必填）
     */
    private String parentName;
    /**
     * 操作人（必填）
     */
    private Integer operatorId;
    /**
     * 国家 1 中国 3 泰国 2 越南
     */
    private Integer country;
}