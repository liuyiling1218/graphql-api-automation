package com.hjfruit.test.pitaya.app.entities.convert.type;

import com.hjfruit.test.pitaya.app.entities.common.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConvertOrderLogPadload {
    /**
     *
     */
    private String convertLogId;
    /**
     *
     */
    private String convertOrderId;
    /**
     *
     */
    private String typeText;
    /**
     *
     */
    private String description;
    /**
     *
     */
    private User createBy;
    /**
     *
     */
    private Long createTime;
}