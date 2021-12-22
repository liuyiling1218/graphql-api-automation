package com.hjfruit.test.pitaya.entities.production.task;

import lombok.Data;

/**
 *
 */
@Data
public class FabricationStatistics {
    /**
     * 生产领料记录
     */
    private Integer pickingRecord;
    /**
     *
     */
    private Boolean pickingRecordFinishUndone;
    /**
     * 生产入库记录
     */
    private Integer warehousingRecord;
    /**
     *
     */
    private Boolean warehousingRecordUndone;
    /**
     * 生产退料记录
     */
    private Integer returnMaterial;
    /**
     *
     */
    private Boolean returnMaterialUndone;
    /**
     * 报损出库记录
     */
    private Integer damagedOutOrder;
    /**
     *
     */
    private Boolean damagedOutOrderUndone;
}