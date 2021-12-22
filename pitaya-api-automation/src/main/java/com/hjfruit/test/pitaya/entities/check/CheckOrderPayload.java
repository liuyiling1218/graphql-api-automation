package com.hjfruit.test.pitaya.entities.check;

import lombok.Data;

/**
 *
 */
@Data
public class CheckOrderPayload {
    /**
     * 订单id
     */
    private Integer checkOrderId;
    /**
     * 订单号
     */
    private String stockOrderNumber;
    /**
     *
     */
    private String stockOrderId;
    /**
     * 盘点类型
     */
    private Integer checkType;
    /**
     * 归属名称
     */
    private Integer belongId;
    /**
     * 归属类型
     */
    private Integer belongType;
    /**
     * 归属name
     */
    private String belongName;
    /**
     * 盘点仓库名称
     */
    private String warehouseName;
    /**
     * 商品分类
     */
    private Integer commodityTypeId;
    /**
     * 商品分类名称
     */
    private String commodityTypeName;
    /**
     * 入库人员
     */
    private String username;
    /**
     * 操作时间
     */
    private Long operateDate;
}