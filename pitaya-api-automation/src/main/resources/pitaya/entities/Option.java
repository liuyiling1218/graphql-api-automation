package com.hjfruit.test.pitaya.entities;

import lombok.Data;

/**
 *
 */
@Data
public class Option {
    public Option() {
        this.pageCurrent = 1;
        this.pageSize = 10;
    }

    public Option(Integer pageCurrent, Integer pageSize) {
        this.pageCurrent = pageCurrent;
        this.pageSize = pageSize;
    }

    /**
     *
     */
    private Integer pageCurrent;
    /**
     *
     */
    private Integer pageSize;
}