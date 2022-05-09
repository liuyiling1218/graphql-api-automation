package com.hjfruit.test.pitaya.app.entities.check;

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
public class CheckRecordPayload {
    /**
     *
     */
    private String checkId;
    /**
     * 盘点日期
     */
    private Long checkDate;
    /**
     *
     */
    private String warehouseName;
    /**
     * 库存状态
     */
    private Integer checkStatus;
    /**
     * 盘点商品类型
     */
    private List<Integer> commodityTypeIdList;
    /**
     * 盘点商品类型
     */
    private List<String> commodityTypeNameList;
    /**
     * 盘点数量
     */
    private Integer checkNum;
    /**
     * 归属名称
     */
    private List<Integer> belongIdList;
    /**
     * 归属类型
     */
    private List<Integer> belongTypeList;
    /**
     * 归属name
     */
    private List<String> belongNameList;
    /**
     * 盘点人员
     */
    private String username;
    /**
     * 操作时间
     */
    private Long operateDate;
    /**
     *
     */
    private String checkCode;
    /**
     *
     */
    private Integer abnormalQuantity;
    /**
     * 2.3 新增最近盘点时间
     */
    private Long checkTime;
}