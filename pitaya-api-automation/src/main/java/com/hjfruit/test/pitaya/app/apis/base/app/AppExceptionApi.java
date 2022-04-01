package com.hjfruit.test.pitaya.app.apis.base.app;

import com.hjfruit.test.pitaya.app.entities.base.app.AppExceptionInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface AppExceptionApi {
    @GraphqlMutation("")
    Boolean insertAppException(AppExceptionInput appExceptionDTO);
}