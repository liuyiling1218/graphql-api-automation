package com.hjfruit.test.operation.web.entities.commodity;

import com.hjfruit.test.operation.web.entities.NamePayload;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class SpecOption {
    /**
     * id
     */
    private Integer optionId;
    /**
     * 名称
     */
    private String optionName;
    /**
     * 规格id
     */
    private Integer specId;
    /**
     * 商品id
     */
    private Integer optionSort;
    /**
     * 商品id
     */
    private Integer commodityId;
    /**
     * 多语言
     */
    private List<NamePayload> nameLocale;
}