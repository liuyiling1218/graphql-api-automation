package com.hjfruit.test.operation.web.entities.peach;

import lombok.Data;

import java.util.List;

/**
 * sku列表表头
 */
@Data
public class PeachTableHeadPayload {
    /**
     *
     */
    private List<PeachHeadSpec> spec;
    /**
     *
     */
    private List<PeachHeadOther> other;
}