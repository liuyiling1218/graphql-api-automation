package com.hjfruit.test.operation.web.apis.commodity;

import com.hjfruit.test.operation.web.entities.commodity.Place;
import com.hjfruit.test.operation.web.entities.commodity.PlaceInput;
import com.hjfruit.test.operation.web.entities.commodity.Variety;
import com.hjfruit.test.operation.web.entities.commodity.VarietyInput;
import fc.test.api.graphql.annotation.GraphqlGroup;
import fc.test.api.graphql.annotation.GraphqlMutation;
import fc.test.api.graphql.annotation.GraphqlQuery;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.entity.GraphqlConifg;

import java.util.List;

/**
 * Generated From Graphql Schema
 */
@GraphqlGroup(client = GraphqlConifg.GraphqlClientType.OPERATION_WEB)
public interface VarietyAndPlaceApi {
    @GraphqlQuery("")
    List<Variety> selectVarietyByCategoryId(Integer categoryId);

    @GraphqlQuery("")
    List<Place> selectPlaceByCategoryId(Integer categoryId);

    @GraphqlQuery(" 获取产地树形列表")
    List<Place> selectPlaceTree();

    @GraphqlMutation(" 新增或修改品种")
    Integer modifyCategoryVariety(VarietyInput varietyInput);

    @GraphqlMutation(" 删除品种")
    Boolean deleteCategoryVariety(@Needed Integer varietyId);

    @GraphqlMutation(" 新增或修改场地关联关系")
    Integer modifyCategoryPlace(PlaceInput placeInput);

    @GraphqlMutation(" 删除场地关联关系")
    Boolean deleteCategoryPlace(PlaceInput placeInput);

    @GraphqlMutation("")
    Integer modifyPlace(PlaceInput placeInput);

    @GraphqlMutation("")
    Boolean deletePlace(@Needed Integer placeId);
}