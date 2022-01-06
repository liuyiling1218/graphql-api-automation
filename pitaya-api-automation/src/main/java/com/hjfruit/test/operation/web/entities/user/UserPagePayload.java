package com.hjfruit.test.operation.web.entities.user;

import lombok.Data;

import java.util.List;

/**
 * 分页信息
 */
@Data
public class UserPagePayload {
    /**
     *
     */
    private List<UserManagePayload> records;
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
    private Integer totalRecords;
}