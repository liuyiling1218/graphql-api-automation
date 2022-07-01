package com.hjfruit.test.pitaya.app.entities.cost.apply;
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
public class CostOrderPayload{
    /**
     * 费用id
     */
    private String billId;
    /**
     * 申请编号（采购单号）
     */
    private String applyCode;
    /**
     * 仓库id
     */
    private String warehouseId;
    /**
     * 仓库名称
     */
    private String warehouseName;
    /**
     * 供应商id
     */
    private Integer supplierId;
    /**
     * 费用单状态
     */
    private Integer status;
    /**
     * 状态名称
     */
    private String statusName;
    /**
     * 供应商名称
     */
    private String supplierName;
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
     * 采购人id
     */
    private Integer createBy;
    /**
     * 采购人名称
     */
    private String createName;
    /**
     * 采购人电话号码
     */
    private String phoneNum;
    /**
     * 采购时间
     */
    private Long createTime;
    /**
     * 入库时间
     */
    private Long auditTime;
    /**
     * 入库审核人id
     */
    private Integer auditUser;
    /**
     * 入库审核人姓名
     */
    private String auditUserName;
    /**
     * 入库类型
     */
    private Integer commodityType;
    /**
     * 驳回原因
     */
    private String cancelDescription;
    /**
     * 审核人id
     */
    private Integer submitBy;
    /**
     * 审核人姓名
     */
    private String submitName;
    /**
     * 入库类型中文名称
     */
    private String inOrderTypeName;
    /**
     * 货款单号
     */
    private String paymentCode;
    /**
     * 货款总金额
     */
    private BigDecimal paymentActualAmount;
    /**
     * 运杂款总金额
     */
    private BigDecimal freightTotalAmount;
    /**
     * 运杂款单号
     */
    private String freightCode;
    /**
     * 商品明细
     */
    private List<CostCommodityPayload> commodityItems;
    /**
     * 货款备注
     */
    private String commodityRemark;
    /**
     * 运杂款明细
     */
    private List<FreightCostPayload> freightCostItem;
}