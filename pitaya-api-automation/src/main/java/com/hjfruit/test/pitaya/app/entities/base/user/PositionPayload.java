package com.hjfruit.test.pitaya.app.entities.base.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PositionPayload {
    /**
     *
     */
    private Integer positionId;
    /**
     *
     */
    private String positionName;
}