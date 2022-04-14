package com.hjfruit.test.pitaya.app.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
public class Page {
    public Page(){
        this.pageSize=1;
        this.pageSize=10;
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