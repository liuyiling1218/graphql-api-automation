package com.hjfruit.test.operation.web.entities.org;

import lombok.Data;

/**
 *
 */
@Data
public class OrgTreePayload {
    /**
     * json数据 格式{key:1,parentId:2,name:"中国",children:[]}
     */
    private String treeJson;
}