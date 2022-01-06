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
public class SupplierPayload {
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
    private Integer commodityTypeId;
    /**
     *
     */
    private String commodityTypeName;
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
    private Long createTime;
    /**
     *
     */
    private String tfn;
    /**
     *
     */
    private String landlineNum;
    /**
     *
     */
    private String financialSystemCode;
    /**
     *
     */
    private Integer supplierDetailId;
    /**
     *
     */
    private Integer supplierTypeId;
    /**
     *
     */
    private String typeName;
}