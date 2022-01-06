package com.hjfruit.test.operation.web.entities.org;

import com.hjfruit.test.operation.web.entities.File;
import fc.test.api.graphql.annotation.Needed;
import lombok.Data;

import java.util.List;

/**
 * 组织信息
 */
@Data
public class OrgPayload {
    /**
     *
     */
    private Integer id;
    /**
     * 组织名称
     */
    @Needed
    private String orgName;
    /**
     * 多语言 例子：{"zh-CN":"南部榴莲7厂","th-TH":"ภาพใต้แผง7"}
     */
    @Needed
    private String nameLocale;
    /**
     * 国家 1 中国 3 泰国 2 越南
     */
    @Needed
    private Integer country;
    /**
     * 负责人
     */
    private String leadingCadre;
    /**
     * 负责人联系电话
     */
    private String phone;
    /**
     * 备注
     */
    private String remark;
    /**
     * 地址
     */
    private String address;
    /**
     * 纬度
     */
    private String lat;
    /**
     * 经度
     */
    private String lng;
    /**
     * 企业名称
     */
    private String businessName;
    /**
     * 法定代表人
     */
    private String legalRep;
    /**
     * 社会信用代码
     */
    private String socialCreditCode;
    /**
     * 企业地址
     */
    private String businessAddress;
    /**
     * 营业执照
     */
    private List<File> bizLicense;
    /**
     * 开户证明
     */
    private List<File> accountCert;
    /**
     * 上级组织名称
     */
    private String parentName;
    /**
     * 上级组织ID
     */
    private Integer parentId;
    /**
     * 系统ID
     */
    private Integer appId;
}