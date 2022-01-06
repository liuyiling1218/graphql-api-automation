package com.hjfruit.test.pitaya.app.entities;

import lombok.Data;

/**
 *
 */
@Data
public class Page {
    /**
     *
     */
    private Integer pageCurrent;
    /**
     *
     */
    private Integer pageSize;

    public Page() {
        this.pageCurrent = 0;
        this.pageSize = 10;
    }
    public Page(Integer pageCurrent, Integer pageSize) {
        this.pageCurrent = pageCurrent;
        this.pageSize = pageSize;
    }
}