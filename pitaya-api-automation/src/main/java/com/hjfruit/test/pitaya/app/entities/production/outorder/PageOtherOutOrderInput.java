package com.hjfruit.test.pitaya.app.entities.production.outorder;
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
public class PageOtherOutOrderInput{
    /**
     * 订单起始时间
     */
    private Long startTime;
    /**
     * 订单结束时间
     */
    private Long endTime;
    /**
     * 商品类型
     */
    private Integer commodityTypeId;
    /**
     * 出库订单状态(全部：null, 待提交：10， 待出库：20， 已完成：40， 已取消：50)
     */
    private Integer outOrderStatus;
    /**
     * 关键字搜索
     */
    private String keyword;
    /**
     * 创建时间
     */
    private Long createTime;
    /**
     * 出库类型
     */
    private Integer outOrderTypeId;
}