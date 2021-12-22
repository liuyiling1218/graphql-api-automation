package com.hjfruit.test.pitaya.entities.base.user;

import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class UserPageResult {
    /**
     *
     */
    private List<UserListPayload> records;
    /**
     *
     */
    private Integer pageCurrent;
    /**
     *
     */
    private Integer pageSize;
    /**
     *
     */
    private Long totalRecords;
}