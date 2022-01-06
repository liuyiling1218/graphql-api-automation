package com.hjfruit.test.operation.web.entities.production;

import lombok.Data;

import java.util.List;

/**
 * sku详情sku列表表头
 */
@Data
public class PitayaTableHeadPayload {
    /**
     *
     */
    private List<PitayaHeadSpec> spec;
    /**
     *
     */
    private List<PitayaHeadOther> other;
}