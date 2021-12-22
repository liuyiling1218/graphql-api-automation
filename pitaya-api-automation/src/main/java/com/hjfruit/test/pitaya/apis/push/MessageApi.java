package com.hjfruit.test.pitaya.apis.push;

import com.hjfruit.test.pitaya.entities.push.UserDeviceInput;
import com.hjfruit.test.pitaya.entities.push.UserDevicePayload;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface MessageApi {
    @GraphqlMutation("")
    UserDevicePayload syncUserDevicePlatform(UserDeviceInput userDeviceInput);

    @GraphqlMutation("")
    String sendMessage(Integer id);
}