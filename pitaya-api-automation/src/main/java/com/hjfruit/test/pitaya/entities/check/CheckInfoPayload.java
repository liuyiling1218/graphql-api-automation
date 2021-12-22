package com.hjfruit.test.pitaya.entities.check;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class CheckInfoPayload {
    /**
     *
     */
    private CheckDetailPayload stockCheck;
    /**
     *
     */
    private List<CheckOrderPayload> checkOrderList;
    /**
     *
     */
    private List<CheckItemPayload> stockCheckItemList;
}