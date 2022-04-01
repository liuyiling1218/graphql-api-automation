package com.hjfruit.test.operation.web.apis.org;

import com.hjfruit.test.operation.web.entities.Option;
import com.hjfruit.test.operation.web.entities.org.*;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface OrgApi {
    @GraphqlMutation(" 创建组织架构")
    Boolean createOrgGroup(CreateOrgGroupInput input);

    @GraphqlMutation(" 创建组织")
    Boolean createOrg(OrgInput input);

    @GraphqlMutation(" 修改组织")
    Boolean updateOrg(OrgInput input);

    @GraphqlQuery("分页获取组织架构")
    PageOrgGroupPayload pageOrgGroup(PageOrgGroupInput input);

    @GraphqlQuery("组织架构下拉")
    List<Option> listOrgGroupOption();

    @GraphqlQuery("获取组织信息")
    OrgPayload org(Integer id);

    @GraphqlQuery("获取组织树")
    OrgTreePayload orgTree(Integer id);

    @GraphqlQuery("获取全部组织树")
    OrgTreePayload orgAllTree();
}