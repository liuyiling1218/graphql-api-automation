package com.hjfruit.test.operation.web.entities.supplier;

import lombok.Data;

/**
 *
 */
@Data
public class SupplierExistInput {
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 税号
     */
    private String tfn;
    /**
     * 联系电话
     */
    private String phoneNum;
}