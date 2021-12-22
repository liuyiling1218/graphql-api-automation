package com.hjfruit.test.pitaya.apis.base.app;

import com.hjfruit.test.pitaya.entities.base.app.AppExceptionInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface AppExceptionApi {
    @GraphqlMutation("")
    Boolean insertAppException(AppExceptionInput appExceptionDTO);
}