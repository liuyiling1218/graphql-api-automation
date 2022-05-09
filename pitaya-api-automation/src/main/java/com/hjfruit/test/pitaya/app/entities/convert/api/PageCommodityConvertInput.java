package com.hjfruit.test.pitaya.app.entities.convert.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageCommodityConvertInput {
    /**
     *
     */
    private String keyword;
    /**
     *
     */
    private Long startDate;
    /**
     *
     */
    private Long endDate;
    /**
     *
     */
    private OrderStatus status;
    /**
     *
     */
    private ConvertType convertType;
}