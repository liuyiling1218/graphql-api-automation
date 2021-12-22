package com.hjfruit.test.pitaya.entities.base.supplier;

import lombok.Data;

/**
 *
 */
@Data
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
    private String commodityType;
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
}