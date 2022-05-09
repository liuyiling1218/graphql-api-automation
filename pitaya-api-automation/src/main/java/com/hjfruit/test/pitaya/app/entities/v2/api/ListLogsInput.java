package com.hjfruit.test.pitaya.app.entities.v2.api;

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
public class ListLogsInput {
    /**
     *
     */
    @Needed
    private List<String> flowId;
}