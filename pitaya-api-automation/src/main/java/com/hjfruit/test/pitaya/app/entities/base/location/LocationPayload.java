package com.hjfruit.test.pitaya.app.entities.base.location;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationPayload {
    /**
     *
     */
    private String id;
    /**
     *
     */
    private LocationType locationType;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private Boolean hasChildren;
    /**
     *
     */
    private String firstChar;
}