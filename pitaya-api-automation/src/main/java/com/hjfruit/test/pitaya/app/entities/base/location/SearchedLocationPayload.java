package com.hjfruit.test.pitaya.app.entities.base.location;

import fc.test.api.graphql.annotation.Needed;
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
public class SearchedLocationPayload {
    /**
     *
     */
    @Needed
    private String id;
    /**
     *
     */
    @Needed
    private String name;
    /**
     *
     */
    @Needed
    private String detailName;
    /**
     *
     */
    private List<Float> location;
}