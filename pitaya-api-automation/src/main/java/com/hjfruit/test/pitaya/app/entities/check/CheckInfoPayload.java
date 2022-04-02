package com.hjfruit.test.pitaya.app.entities.check;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
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