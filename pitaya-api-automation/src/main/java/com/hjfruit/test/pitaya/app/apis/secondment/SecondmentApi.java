package com.hjfruit.test.pitaya.app.apis.secondment;

import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.secondment.*;
import fc.test.api.graphql.annotation.*;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.PITAYA_APP)
public interface SecondmentApi {
    @GraphqlMutation("")
    String insertSecondment(SecondmentInput secondmentInput);

    @GraphqlMutation("")
    String updateSecondment(SecondmentInput secondmentInput);

    @GraphqlMutation("")
    String changeSecondmentStatus(SecondmentStatusInput secondmentStatusInput);

    @GraphqlQuery("")
    SecondmentQueryPayload pageUserSecondment(Page page, @Needed SecondmentPageInput secondmentPageInput);

    @GraphqlQuery("")
    SecondmentQueryPayload pageOrgSecondment(Page page, SecondmentPageInput secondmentPageInput);

    @GraphqlQuery("")
    SecondmentPayload secondmentDetail(@Needed @ID String secondmentId);

    @GraphqlQuery("")
    Integer auditSecondmentCount();

    @GraphqlQuery("    借调日志")
    List<SecondmentLogPayload> getSecondmentLogs(@Needed @ID String secondmentId);

    @GraphqlQuery("")
    List<SecondmentStockPayload> secondmentStocks(SecondmentConditionInput secondmentCondition);
}