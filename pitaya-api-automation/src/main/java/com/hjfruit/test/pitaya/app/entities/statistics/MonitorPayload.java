package com.hjfruit.test.pitaya.app.entities.statistics;
import lombok.Data;
import lombok.Builder;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.List;
import java.math.BigDecimal;
import fc.test.api.graphql.annotation.Needed;
import fc.test.api.graphql.annotation.ID;
import fc.test.api.graphql.annotation.NotEmpty;
import com.hjfruit.test.pitaya.app.entities.stock.*;
import com.hjfruit.test.pitaya.app.entities.production.inorder.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.api.*;
import com.hjfruit.test.pitaya.app.entities.cost.apply.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.type.*;
import com.hjfruit.test.pitaya.app.entities.user.*;
import com.hjfruit.test.pitaya.app.entities.base.user.*;
import com.hjfruit.test.pitaya.app.entities.convert.type.*;
import com.hjfruit.test.pitaya.app.entities.base.store.*;
import com.hjfruit.test.pitaya.app.entities.label.*;
import com.hjfruit.test.pitaya.app.entities.convert.api.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.*;
import com.hjfruit.test.pitaya.app.entities.v2.api.transfer.*;
import com.hjfruit.test.pitaya.app.entities.production.common.*;
import com.hjfruit.test.pitaya.app.entities.common.*;
import com.hjfruit.test.pitaya.app.entities.push.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.api.*;
import com.hjfruit.test.pitaya.app.entities.statistics.type.*;
import com.hjfruit.test.pitaya.app.entities.base.supplier.*;
import com.hjfruit.test.pitaya.app.entities.statistics.api.*;
import com.hjfruit.test.pitaya.app.entities.saleincome.type.*;
import com.hjfruit.test.pitaya.app.entities.secondment.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.transfer.*;
import com.hjfruit.test.pitaya.app.entities.plan.*;
import com.hjfruit.test.pitaya.app.entities.production.order.*;
import com.hjfruit.test.pitaya.app.entities.base.customer.*;
import com.hjfruit.test.pitaya.app.entities.commodity.*;
import com.hjfruit.test.pitaya.app.entities.cost.returns.type.*;
import com.hjfruit.test.pitaya.app.entities.base.app.*;
import com.hjfruit.test.pitaya.app.entities.base.config.*;
import com.hjfruit.test.pitaya.app.entities.*;
import com.hjfruit.test.pitaya.app.entities.check.*;
import com.hjfruit.test.pitaya.app.entities.production.outorder.*;
import com.hjfruit.test.pitaya.app.entities.statistics.*;
import com.hjfruit.test.pitaya.app.entities.v2.common.*;
import com.hjfruit.test.pitaya.app.entities.v2.types.*;
import com.hjfruit.test.pitaya.app.entities.cost.common.*;
import com.hjfruit.test.pitaya.app.entities.production.task.*;
import com.hjfruit.test.pitaya.app.entities.base.location.*;
import com.hjfruit.test.pitaya.app.entities.org.*;
/**
 * 
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MonitorPayload{
    /**
     * 配送地址名称
     */
    private String customerName;
    /**
     * 仓库
     */
    private String customerDistributionName;
    /**
     * 状态
     */
    private Integer taskStatus;
    /**
     * 状态名称
     */
    private String taskStatusName;
    /**
     * 生产类型
     */
    private Integer createType;
    /**
     * 生产类型名称
     */
    private String createTypeName;
    /**
     * 
     */
    private String productionCommodity;
    /**
     * 已生产数控
     */
    private BigDecimal completedNum;
    /**
     * 计划生产数量
     */
    private BigDecimal expectNum;
    /**
     * 组长
     */
    private String leaderName;
    /**
     * 生产线
     */
    private Integer line;
    /**
     * 用时
     */
    private Long workTime;
    /**
     * 任务id
     */
    private String taskId;
    /**
     * 正式工人数
     */
    private Integer numberActual;
    /**
     * 临时工人数
     */
    private Integer tempWorkerQuantity;
    /**
     * 商品数量
     */
    private Integer commodityNum;
    /**
     * 商品名称
     */
    private String commodityName;
    /**
     * 负责人
     */
    private String createUserName;
    /**
     * 
     */
    private List<ProductionCommodityPayload> productionCommodityPayload;
    /**
     * 
     */
    private List<ProductionProcessPayload> pickDetail;
    /**
     * 
     */
    private List<ProductionProcessPayload> inStockDetail;
    /**
     * 
     */
    private List<ProductionProcessPayload> returnDetail;
    /**
     * 
     */
    private List<ProductionProcessPayload> damageDetail;
}