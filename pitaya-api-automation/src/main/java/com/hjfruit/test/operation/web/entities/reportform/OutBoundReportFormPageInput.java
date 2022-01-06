package com.hjfruit.test.operation.web.entities.reportform;

import com.hjfruit.test.operation.web.entities.Page;
import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

/**
 * 列表分页入参
 */
@Data
public class OutBoundReportFormPageInput {
    /**
     *
     */
    private OutBoundReportFormQueryInput outBoundReportFormQueryInput;
    /**
     * 分页入参
     */
    @Needed
    private Page pageInput;
}