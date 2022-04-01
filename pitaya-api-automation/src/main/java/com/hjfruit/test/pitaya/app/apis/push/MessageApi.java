package com.hjfruit.test.pitaya.app.apis.push;

import com.hjfruit.test.pitaya.app.entities.push.UserDeviceInput;
import com.hjfruit.test.pitaya.app.entities.push.UserDevicePayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.entity.GraphqlConifg;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface MessageApi {
    @GraphqlMutation("")
    UserDevicePayload syncUserDevicePlatform(UserDeviceInput userDeviceInput);

    @GraphqlMutation("")
    String sendMessage(Integer id);
}