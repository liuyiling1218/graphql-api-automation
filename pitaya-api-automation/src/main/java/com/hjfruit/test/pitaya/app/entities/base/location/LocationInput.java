package com.hjfruit.test.pitaya.app.entities.base.location;

import fc.test.api.graphql.annotation.Needed;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LocationInput {
    /**
     *
     */
    private String id;
    /**
     *
     */
    @Needed
    private LocationType locationType;
}