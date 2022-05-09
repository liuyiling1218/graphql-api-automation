package com.hjfruit.test.pitaya.app.entities.base.user;

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
public class PageUserInput {
    /**
     *
     */
    @Needed
    private Integer orgId;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private UserStatus status;
}