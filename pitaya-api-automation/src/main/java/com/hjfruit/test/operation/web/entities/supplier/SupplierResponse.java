package com.hjfruit.test.operation.web.entities.supplier;

import lombok.Data;

/**
 *
 */
@Data
public class SupplierResponse {
    /**
     * 供应商id
     */
    private Integer supplierId;
    /**
     * 供应商名称
     */
    private String supplierName;
    /**
     * 商品分类id
     */
    private Integer commodityTypeId;
    /**
     * 供应商手机号
     */
    private String phoneNum;
    /**
     * 供应商座机号
     */
    private String landlineNum;
    /**
     * 供应商地址
     */
    private String supplierAddress;
    /**
     * 供应商门牌号
     */
    private String houseNum;
    /**
     * 税号
     */
    private String tfn;
    /**
     * 创建时间
     */
    private Long createTime;
}