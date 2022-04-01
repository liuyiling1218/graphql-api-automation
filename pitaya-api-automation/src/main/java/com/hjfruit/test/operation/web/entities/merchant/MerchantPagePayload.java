package com.hjfruit.test.operation.web.entities.merchant;

import lombok.Data;

import java.util.List;

/**
 * 商户分页信息
 */
@Data
public class MerchantPagePayload {
    /**
     *
     */
    private List<MerchantPayload> records;
    /**
     *
     */
    private Integer pageCurrent;
    /**
     *
     */
    private Integer pageSize;
    /**
     *
     */
    private Integer totalRecords;
}