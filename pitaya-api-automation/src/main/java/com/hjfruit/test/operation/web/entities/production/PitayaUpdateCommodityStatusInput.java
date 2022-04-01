package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 * 添加商品商品状态变更
 */
@Data
public class PitayaUpdateCommodityStatusInput {
    /**
     *
     */
    private Integer status;
    /**
     *
     */
    private List<Integer> commodityId;
}