package com.hjfruit.test.pitaya.app.entities.org;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrgTreePayload {
    /**
     *
     */
    private Integer key;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private Integer parentId;
    /**
     *
     */
    private Boolean disabled;
    /**
     *
     */
    private List<OrgTreePayload> children;
}