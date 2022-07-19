package com.hjfruit.test.pitaya.common;

import lombok.Getter;

/**
 * 生产项目数据
 *
 * @author SUIWEI WU
 * @date 2021/10/21 9:42
 */
public class PitayaConstants {
    /**
     * 分拣仓
     */
    @Getter
    public enum Org {
        /**
         * 成都分建仓
         */
        CHENGDU(341);

        private final Integer id;

        Org(Integer id) {
            this.id = id;
        }
    }


    /**
     * 测试用的用户账号
     */
    @Getter
    public enum User {
        /**
         * 生产组长
         */
        Purchaser("18580860001", "HJgyl-@123456", "666666");


        private final String username;
        private final String password;
        private final String checkcode;

        User(String username, String password, String checkcode) {
            this.username = username;
            this.password = password;
            this.checkcode = checkcode;
        }
    }

    /**
     * 商品类型
     */
    @Getter
    public enum CommodityType {
        FRUIT(1, "水果"),
        FOOD(2, "食品"),
        ASSIST(3, "辅料"),
        BOX(4, "周转筐"),
        RAW_MATERIAL(5, "原料"),
        PRODUCT(6, "成品"),
        HALF_PRODUCT(7, "半成品"),
        DEFECTIVE(8, "次品"),
        REBACK(9, "退货品");
        /**
         * 商品类型ID
         */
        private final Integer typeId;
        /**
         * 商品类型名称
         */
        private final String typeName;

        CommodityType(Integer typeId, String typeName) {
            this.typeId = typeId;
            this.typeName = typeName;
        }
    }

    /**
     * 商品SKU类型
     */
    @Getter
    public enum CommoditySkuType {
        SINGLE_UNIT("单单位"),
        DOUBLE_UNIT("双单位");

        /**
         * 商品SKU类型名称
         */
        private final String typeName;

        CommoditySkuType(String typeName) {
            this.typeName = typeName;
        }

    }

    /**
     * 供应商类型
     */
    @Getter
    public enum SupplierType {
        FRUIT(1, "水果"),
        FOOD(2, "食品"),
        ASSIST(3, "辅料"),
        BOX(4, "周转筐"),
        TRANSPORT(5, "物流运输");
        /**
         * 供应商类型ID
         */
        private final Integer typeId;
        /**
         * 供应商类型名称
         */
        private final String typeName;

        SupplierType(Integer typeId, String typeName) {
            this.typeId = typeId;
            this.typeName = typeName;
        }
    }

    /**
     * 成品销售订单状态
     */
    @Getter
    public enum SaleOrderStatus {
        All(10, "全部"),
        TO_SUBMIT(20, "待提交"),
        TO_AUDIT(30, "待审核"),
        TO_OUT_STOCK(40, "待出库"),
        FINISHED(50, "已完成");

        private final int code;
        private final String statusName;

        SaleOrderStatus(int statusCode, String statusName) {
            this.code = statusCode;
            this.statusName = statusName;
        }
    }

    /**
     * 采购订单状态
     */

    @Getter

    public enum InOrderStatus {
        All(10, "全部"),
        TO_SUBMIT(20, "待提交"),
        TO_in_STOCK(30, "待入库"),
        FINISHED(40, "已完成"),
        CANCELED(50, "已取消");
        private final int statusCode;
        private final String statusName;

        InOrderStatus(int statusCode, String statusName) {
            this.statusCode = statusCode;
            this.statusName = statusName;

        }
    }

    /**
     * 生产配置类型
     */
    @Getter
    public enum ProductionConfig {
        FORMALE_WORKER(1001, "正式工"),
        PART_TIME_WORKER(1000, "零时工"),
        PRODUCTION_SWITCH(1100, "提前领料开关");

        private final int configCode;
        private final String configTypeName;

        ProductionConfig(int configCode, String configTypeName) {
            this.configCode = configCode;
            this.configTypeName = configTypeName;
        }
    }

    /**
     * 入库订单类型
     */
    @Getter
    public enum InOrderType {
        PRODUCTION_IN_APPLY(10, "成品入库"),
        RAW_PURCHASE(20, "原料采购"),
        RAW_RETURN(30, "原料退料"),
        SEMI_FINISHED_IN_APPLY(40, "半成品入库"),
        DEFECTIVE_IN_APPLY(50, "次品入库"),
        ASSIST_PURCHASE(60, "辅料采购"),
        SUB_RETURN(70, "辅料退料"),
        CHECK_IN_APPLY(90, "盘点入库"),
        OTHER_IN_APPLY(100, "其他入库"),
        TURNOVER_BASKET_RETURN(110, "销售归还"),
        SALES_RETURN(120, "销售退货"),
        RETURNED_GOODS_RETURN(130, "退货品退料"),
        SEMI_FINISHED_PRODUCTS_RETURN(140, "半成品退料"),
        TRANSFER_IN_APPLY(150, "调拨入库");


        private final int typeCode;
        private final String typeText;

        InOrderType(int typeCode, String typeText) {
            this.typeCode = typeCode;
            this.typeText = typeText;
        }
    }

    @Getter
    public enum OutOrderType {

        RAW_MATERIAL_ACQUISITION(10, "原料领料"),
        SUPPLEMENTARY_MATERIAL_ACQUISITION(20, "辅料领料"),
        RETURNED_GOODS_OUT(25, "退货品领料"),
        FINISHED_PRODUCT_ACQUISITION(30, "成品销售"),
        SEMI_FINISHED_PRODUCT_ACQUISITION(50, "半成品领料"),
        OTHER_ACQUISITION(60, "其他出库"),
        DAMAGED_ACQUISITION(70, "报损出库"),
        CHECK_ACQUISITION(80, "盘点出库"),
        DEFECTIVE_SALE(90, "次品销售"),
        PURCHASE_RETURN(100, "采购退货"),
        TRANSFER_OUT_APPLY(110, "调拨出库"),
        DAMAGED_RAW_MATERIAL(150, "原料报损"),
        DAMAGED_SEMI_FINISHED_PRODUCT(160, "半成品报损"),
        DAMAGED_RETURNED_GOODS(170, "退货品报损"),
        DAMAGED_PRODUCTION(180, "生产报损");

        private final int typeCode;
        private final String typeText;

        OutOrderType(int typeCode, String typeText) {
            this.typeCode = typeCode;
            this.typeText = typeText;
        }
    }

    /**
     * 客户类型
     */
    @Getter
    public enum CustomerType {

        NO_CUSTOMER(10, "通用货品"),
        DESIGNATED_CUSTOMER(20, "指定客户"),
        CUSTOMER_GROUP(30, "客户分组");


        private final int customerTypeId;
        private final String customerName;

        CustomerType(int customerTypeId, String customerName) {
            this.customerTypeId = customerTypeId;
            this.customerName = customerName;

        }
    }

    /**
     * 生产任务分配类型
     */
    @Getter
    public enum AssignmentType {

        ASSIGNMENT(10, "分配"),
        UN_ASSIGNMENT(20, "未分配");

        private final int assignmentTypeId;
        private final String assignmentName;

        AssignmentType(int assignmentTypeId, String assignmentName) {

            this.assignmentTypeId = assignmentTypeId;
            this.assignmentName = assignmentName;

        }
    }

    /**
     * 生产计划状态
     */
    @Getter
    public enum PlanStatus {

        DEFAULT_STATUS(10, "待审核"),
        TO_BE_PRODUCED(20, "待生产"),
        IN_PRODUCTION(30, "生产中"),
        COMPLETED(40, "已完成"),
        CANCELLED(50, "已取消"),
        TO_SUBMIT(15, "待提交");

        private final int planStatusId;
        private final String planStatusName;

        PlanStatus(int planStatusId, String planStatusName) {

            this.planStatusId = planStatusId;
            this.planStatusName = planStatusName;
        }
    }

    /**
     * 生产任务状态
     */
    @Getter
    public enum TaskStatus {

        NO_STATUS(10, ""),

        TO_BE_PRODUCED(20, "待生产"),

        IN_PRODUCTION(30, "生产中"),

        TERMINATION(35, "暂停中"),

        COMPLETED(40, "已完成"),

        CANCELLED(50, "已取消");

        private final int code;
        private final String taskStatusName;

        TaskStatus(int code, String taskStatusName) {
            this.code = code;
            this.taskStatusName=taskStatusName;

        }
    }



    /**
     * 借调状态
     */
    @Getter
    public enum SecondmentStatus {
        TO_BE_SUBMIT(10, "待提交"),
        SUBMIT(20, "已提交"),
        REJECT(30, "已驳回"),
        FINISHED(40, "已完成"),
        CANCELED(50, "已取消"),
        TO_BE_AUDIT(60, "待审核");
        private final int secondmentStatusId;
        private final String secondmentStatusName;

        SecondmentStatus(int secondmentStatusId, String secondmentStatusName) {

            this.secondmentStatusId = secondmentStatusId;
            this.secondmentStatusName = secondmentStatusName;

        }
    }
    /**
     * 计价方式
     */
    @Getter
    public enum PricePositionType {

        GROSS_WEIGHT(10, "毛重计价"),
        NET_WEIGHT(20, "净重计价");

        private int typeId;
        private String typeName;

        PricePositionType(int typeId, String typeName) {
            this.typeId = typeId;
            this.typeName = typeName;
        }
    }
    /**
     * 费用单状态
     */
    @Getter
    public enum CostOrderStatus {

        WAIT_CONFIRM(10, "待确认"),
        WAIT_SUBMIT(20, "待提交"),
        WAIT_BUSINESS_AUDIT(30, "待业务审核"),
        WAIT_FINANCE_AUDIT(40, "待财务审核"),
        COMPLETED(50, "已完成");

        private int statusId;
        private String statusName;

        CostOrderStatus(int statusId, String statusName) {
            this.statusId = statusId;
            this.statusName = statusName;
        }
    }
    /**
     * 组织类型
     */
    @Getter
    public enum OrgType {

        ORG_WAIT_IMPLEMENTED("本系统-待实施组织"),
        SYSTEM_WAIT_IMPLEMENTED("其他系统-待实施组织"),
        ORG_IMPLEMENTED("本系统-已实施区域"),
        SYSTEM_IMPLEMENTED("其他系统-已实施区域"),
        COMPLETED("已完成");

        private String typeName;

        OrgType(String typeName) {
            this.typeName = typeName;
        }
    }
}