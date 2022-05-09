package com.hjfruit.test.pitaya.app.entities.base.location;

import fc.test.api.graphql.annotation.NotEmpty;
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
public class ListLocationPayload {
    /**
     *
     */
    @NotEmpty
    private List<LocationPayload> records;
}