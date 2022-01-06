package com.hjfruit.test.pitaya.app.apis.common;

import com.hjfruit.test.pitaya.app.entities.common.AppVersionPayload;
import com.hjfruit.test.pitaya.app.entities.common.DevicePlatformInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;
/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface VersionApi {
    @GraphqlQuery("获取版本地址")
    AppVersionPayload getVersion(DevicePlatformInput devicePlatformInput);
}