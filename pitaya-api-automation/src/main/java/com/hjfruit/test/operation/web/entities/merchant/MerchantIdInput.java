package com.hjfruit.test.operation.web.entities.merchant;

import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 *
 */
@Data
public class MerchantIdInput {
    /**
     * 商户ID
     */
    @Needed
    private Integer id;
}