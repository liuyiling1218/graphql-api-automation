package com.hjfruit.test.pitaya.app.entities.production.outorder;

import com.hjfruit.test.pitaya.app.entities.production.order.FlowTransferCommodityInput;
import com.hjfruit.test.pitaya.app.entities.production.order.FlowTransferOtherBillInput;
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
public class CreateTransferOrderInput {
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
    private String sourceWarehouseId;
    /**
     * 调出归属id
     */
    private Integer sourceBelongId;
    /**
     * 调入仓库id
     */
    private String targetWarehouseId;
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
    /**
     * 调入系统id
     */
    private Integer targetAppId;
}