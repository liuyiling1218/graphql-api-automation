package com.hjfruit.test.pitaya.app.entities.entities;

import lombok.Data;

/**
 *
 */
@Data
public class Page {
    public Page() {
        this.pageCurrent = 1;
        this.pageSize = 10;
    }

    public Page(Integer pageCurrent, Integer pageSize) {
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