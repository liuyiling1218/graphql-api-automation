package com.hjfruit.test.operation.web.entities.commodity;

import com.hjfruit.test.operation.web.entities.NamePayload;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class SpecsPayload {
    /**
     * 规格id
     */
    private Integer specId;
    /**
     * 规格名称
     */
    private String specName;
    /**
     * 规格排序
     */
    private Integer specSort;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 多语言
     */
    private List<NamePayload> nameLocale;
    /**
     * sku选项列表
     */
    private List<SpecOption> specOption;
}