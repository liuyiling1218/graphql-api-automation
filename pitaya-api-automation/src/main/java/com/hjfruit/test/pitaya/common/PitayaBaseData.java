package com.hjfruit.test.pitaya.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/**
 * 生产项目基础数据
 */
@Component
public class PitayaBaseData {

    /**
     * 分拣仓数据
     */
    public static Map<SortingWarehouseName, SortingWarehouseEntity> SORTING_WAREHOUSE_DATA;


    private static OrgGroupDataEntity ORG_GROUP;


    private static OrgGroupDataEntity initOrgGroup() {
        return null;
    }

    @Getter
    @AllArgsConstructor
    public enum SortingWarehouseName {
        CHONGQING("重庆分拣仓"),
        CHENGDU("成都分拣仓");

        private String description;
    }

    /**
     * 用户数据类型
     */
    @Getter
    @AllArgsConstructor
    public enum UserDataType {
        ADMIN("超级管理员"),
        PURCHASER("采购员");

        private String description;
    }

    /**
     * 商品数据类型
     */
    @Getter
    @AllArgsConstructor
    public enum CommodityDataType {
        ADMIN("超级管理员"),
        PURCHASER("采购员");

        private String description;
    }

    /**
     * 供应商数据类型
     */
    @Getter
    @AllArgsConstructor
    public enum SupplierDataType {
        ADMIN("超级管理员"),
        PURCHASER("采购员");

        private String description;
    }

    /**
     * 客户数据类型
     */
    @Getter
    @AllArgsConstructor
    public enum CustomerDataType {
        ADMIN("超级管理员"),
        PURCHASER("采购员");

        private String description;
    }


    /**
     * 分拣仓数据实体
     */
    public class SortingWarehouseEntity {
        /**
         * 用户数据
         */
        public Map<UserDataType, List<UserDataEntity>> UserData;
        /**
         * 商品数据
         */
        public Map<CommodityDataType, List<CommodityDataEntity>> CommodityData;

        /**
         * 供应商数据
         */
        public Map<SupplierDataType, List<SupplierDataEntity>> SupplierData;

        /**
         * 客户数据
         */
        public Map<CustomerDataType, List<CustomerDataEntity>> CustomerData;
    }


    /**
     * 用户数据实体
     */
    @Data
    public class UserDataEntity {
        private String username;
    }

    /**
     * 商品数据
     */
    @Data
    public class CommodityDataEntity {
        private String commodityName;

    }

    /**
     * 供应商数据
     */
    public class SupplierDataEntity {
        private String supplierName;
    }

    /**
     * 客户数据
     */
    public class CustomerDataEntity {
        private String custoemrName;

    }

    /**
     * 组织架构数据实体
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class OrgGroupDataEntity {
        private Integer id;
        private String name;
    }

    /**
     * 组织数据实体
     */
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class OrgDataEntity {
        private Integer id;
        private String name;
        private Integer pid;
        private Integer orgGroupId;
    }


}
