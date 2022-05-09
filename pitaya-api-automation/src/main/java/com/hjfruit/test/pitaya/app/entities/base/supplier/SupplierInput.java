package com.hjfruit.test.pitaya.app.entities.base.supplier;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SupplierInput {
    /**
     *
     */
    private Integer supplierId;
    /**
     *
     */
    private String supplierName;
    /**
     *
     */
    private String supplierShortName;
    /**
     *
     */
    private String phoneNum;
    /**
     *
     */
    private String supplierAddress;
    /**
     *
     */
    private String houseNum;
    /**
     *
     */
    private String remark;
    /**
     *
     */
    private String tfn;
    /**
     *
     */
    private Integer supplierTypeId;
    /**
     *
     */
    private SupplierAttribute attribute;
    /**
     *
     */
    private Integer belongOrgId;
}