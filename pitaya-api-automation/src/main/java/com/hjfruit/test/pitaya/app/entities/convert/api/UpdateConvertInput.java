package com.hjfruit.test.pitaya.app.entities.convert.api;

import fc.test.api.graphql.annotation.Needed;
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
public class UpdateConvertInput {
    /**
     *
     */
    @Needed
    private String convertOrderId;
    /**
     *
     */
    @Needed
    private String warehouseId;
    /**
     *
     */
    @Needed
    private Integer belongType;
    /**
     *
     */
    @Needed
    private Integer belongId;
    /**
     *
     */
    private String remark;
    /**
     *
     */
    private List<CommondConvertItemInput> convertItems;
}