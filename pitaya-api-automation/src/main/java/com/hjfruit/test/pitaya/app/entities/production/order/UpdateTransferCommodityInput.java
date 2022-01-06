package com.hjfruit.test.pitaya.app.entities.production.order;

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
public class UpdateTransferCommodityInput {
    /**
     * 调拨id
     */
    private String flowId;
    /**
     * 调拨类型
     */
    private Integer transferType;
    /**
     * 商品类型
     */
    private Integer commodityType;
    /**
     * 调出仓库id
     */
    private Integer sourceWarehouseId;
    /**
     * 调出归属类型
     */
    private Integer sourceBelongType;
    /**
     * 调出归属id
     */
    private Integer sourceBelongId;
    /**
     * 调入仓库id
     */
    private Integer targetWarehouseId;
    /**
     * 调入归属id
     */
    private Integer targetBelongId;
    /**
     * 备注信息
     */
    private String remark;
    /**
     * 调拨商品
     */
    private List<FlowTransferCommodityInput> flowTransferCommodityInput;
    /**
     * 运杂费用
     */
    private List<FlowTransferOtherBillInput> flowTransferOtherBillInput;
}