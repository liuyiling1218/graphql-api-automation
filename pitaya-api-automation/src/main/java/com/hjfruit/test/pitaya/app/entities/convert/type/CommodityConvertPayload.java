package com.hjfruit.test.pitaya.app.entities.convert.type;

import com.hjfruit.test.pitaya.app.entities.common.Org;
import com.hjfruit.test.pitaya.app.entities.common.User;
import com.hjfruit.test.pitaya.app.entities.common.Warehouse;
import com.hjfruit.test.pitaya.app.entities.convert.api.ConvertType;
import com.hjfruit.test.pitaya.app.entities.convert.api.OrderStatus;
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
public class CommodityConvertPayload {
    /**
     *
     */
    private String convertOrderId;
    /**
     *
     */
    private String convertOrderCode;
    /**
     *
     */
    private ConvertType convertType;
    /**
     *
     */
    private String convertTypeName;
    /**
     *
     */
    private OrderStatus status;
    /**
     *
     */
    private String statusName;
    /**
     *
     */
    private Integer belongType;
    /**
     *
     */
    private Integer belongId;
    /**
     *
     */
    private String belongName;
    /**
     *
     */
    private Org org;
    /**
     *
     */
    private Warehouse warehouse;
    /**
     *
     */
    private String remark;
    /**
     *
     */
    private String statusRemark;
    /**
     *
     */
    private User createBy;
    /**
     *
     */
    private Long createTime;
    /**
     *
     */
    private List<CommodityConvertItemPayload> commodities;
    /**
     *
     */
    private List<ConvertOrderLogPadload> convertLogs;
}