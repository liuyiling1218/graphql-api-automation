package com.hjfruit.test.pitaya.app.entities.base.user;

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
public class UserPayload {
    /**
     *
     */
    private Integer teamId;
    /**
     *
     */
    private Integer userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 用户电话号码
     */
    private String userPhoneNum;
    /**
     * 座机号码
     */
    private String landlineNum;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 组织名称
     */
    private String organizationName;
    /**
     *
     */
    private Integer organizationId;
    /**
     *
     */
    private List<PositionPayload> positions;
    /**
     *
     */
    private List<UserStorePayload> stores;
}