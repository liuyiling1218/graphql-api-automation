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
public class CheckDetailPayload {
    /**
     *
     */
    private Integer checkId;
    /**
     * 盘点仓库名称
     */
    private String warehouseName;
    /**
     * 盘点日期
     */
    private Long checkDate;
    /**
     *
     */
    private Integer commodityTypeId;
    /**
     *
     */
    private List<Integer> commodityTypeIdList;
    /**
     * 商品分类名称
     */
    private String commodityTypeName;
    /**
     *
     */
    private List<String> commodityTypeNameList;
    /**
     * 归属名称
     */
    private Integer belongId;
    /**
     *
     */
    private List<Integer> belongIdList;
    /**
     * 归属类型
     */
    private Integer belongType;
    /**
     *
     */
    private List<Integer> belongTypeList;
    /**
     * 归属name
     */
    private String belongName;
    /**
     *
     */
    private List<String> belongNameList;
    /**
     * 提交人员
     */
    private String username;
    /**
     *
     */
    private Integer checkStatus;
    /**
     * 操作时间
     */
    private Long operateDate;
    /**
     * 备注
     */
    private String remark;
    /**
     * 盘点数量
     */
    private Integer checkNum;
    /**
     * 异常数量
     */
    private Integer checkErrorNum;
    /**
     *
     */
    private String checkCode;
    /**
     *
     */
    private Integer abnormalQuantity;
}