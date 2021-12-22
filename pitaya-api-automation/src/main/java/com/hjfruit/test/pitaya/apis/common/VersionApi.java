package com.hjfruit.test.pitaya.apis.common;

import com.hjfruit.test.pitaya.entities.common.AppVersionPayload;
import com.hjfruit.test.pitaya.entities.common.DevicePlatformInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlQuery;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup()
public interface VersionApi {
    @GraphqlQuery("获取版本地址")
    AppVersionPayload getVersion(DevicePlatformInput devicePlatformInput);
}