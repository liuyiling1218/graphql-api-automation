package com.hjfruit.test.pitaya.common;

import com.hjfruit.test.operation.web.apis.commodity.CategoryApi;
import com.hjfruit.test.operation.web.apis.commodity.CommodityApi;
import com.hjfruit.test.operation.web.apis.commodity.VarietyAndPlaceApi;
import com.hjfruit.test.operation.web.apis.org.OrgApi;
import com.hjfruit.test.operation.web.apis.production.PitayaCommodityApi;
import com.hjfruit.test.operation.web.apis.production.PitayaSortingWarehouseApi;
import com.hjfruit.test.operation.web.apis.user.UserApi;
import com.hjfruit.test.operation.web.apis.user.UserManageApi;
import com.hjfruit.test.operation.web.entities.org.CreateOrgGroupInput;
import com.hjfruit.test.operation.web.entities.org.OrgInput;
import fc.test.api.graphql.BaseAction;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SUIWEI WU
 * @date 2021/11/10 9:22
 */
@Slf4j
@Component
public class PitayaBaseAction implements BaseAction {
    @Autowired
    @Qualifier("fcUser")
    JdbcTemplate userJdbc;
    @Autowired
    UserApi userApi;


    @Autowired
    PitayaConfig pitayaConfig;
    @Autowired
    OrgApi orgApi;
    @Autowired
    UserManageApi userManageApi;
    @Autowired
    PitayaSortingWarehouseApi pitayaSortingWarehouseApi;
    @Autowired
    VarietyAndPlaceApi varietyAndPlaceApi;
    @Autowired
    CategoryApi categoryApi;
    @Autowired
    CommodityApi commodityApi;
    @Autowired
    PitayaCommodityApi pitayaCommodityApi;
    private List<Integer> orgIds = new ArrayList<>();
    private List<String> userIds = new ArrayList<String>();

    @Override
    public void config() {
//        pitayaConfig.setDefaultUser("13598279592");
//        pitayaConfig.setDefaultUser("18300000000");
        pitayaConfig.setDefaultUser("15023925077");
        pitayaConfig.setDefaultCheckCode("666666");

//        pitayaConfig.setDefaultOrgId(339);
//        pitayaConfig.setDefaultOrgId(5);
        pitayaConfig.setDefaultOrgId(341);
        pitayaConfig.setDefaultPassword("HJgyl-@123456");
    }

    @Override
    public void prepare() {

//        log.info("===================开始准备基础数据======================");
//        //todo 准备基础数据
//        //登录operation初始化数据
//        //获取验证码
//        log.info("====================登录运营平台=======================");
//        SendCodeMsgInput sendCodeMsgInput = new SendCodeMsgInput();
//        sendCodeMsgInput.setPhone("18800000000");
//        userApi.sendCodeMsg(sendCodeMsgInput);
//        //登录
//        LoginInput loginInput = new LoginInput();
//        loginInput.setPhone("18800000000");
//        loginInput.setCode("666666");
//        Autheration.token = userApi.login(loginInput);
//
//
//        log.info("====================初始化分拣仓开始=======================");
//        //初始化组织架构
//        String orgGroupName = "[测试]组织架构";
//
//        //初始化组织架构：[测试]组织架构
//        CreateOrgGroupInput createOrgGroupInput = new CreateOrgGroupInput();
//        createOrgGroupInput.setName("[测试]组织架构");
//        orgApi.createOrgGroup(createOrgGroupInput);
//        Integer orgGroupId = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + createOrgGroupInput.getName() + "\';", Integer.class);
//        orgIds.add(orgGroupId);
//
//        //初始化组织:[测试]洪九果品股份有限公司
//        OrgInput orgInput = new OrgInput();
//        orgInput.setOrgName("[测试]洪九果品股份有限公司");
//        orgInput.setParentId(orgGroupId);
//        orgInput.setOrgGroupId(orgGroupId);
//        orgInput.setNameLocale("{\"zh-CN\":\"" + orgInput.getOrgName() + "\",\"en-US\":\"\",\"th-TH\":\"\",\"vi-VN\":\"\"}");
//        orgInput.setCountry(1);
//        orgInput.setAppId(3);
//        orgApi.createOrg(orgInput);
//        Integer orgId = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + orgInput.getOrgName() + "\';", Integer.class);
//        orgIds.add(orgId);
//
//        //初始化组织:[测试]重庆分公司
//        OrgInput orgInput1 = new OrgInput();
//        orgInput1.setOrgName("");
//        orgInput1.setParentId(orgId);
//        orgInput1.setOrgGroupId(orgGroupId);
//        orgInput1.setNameLocale("{\"zh-CN\":\"" + orgInput1.getOrgName() + "\",\"en-US\":\"\",\"th-TH\":\"\",\"vi-VN\":\"\"}");
//        orgInput1.setCountry(1);
//        orgApi.createOrg(orgInput1);
//        Integer orgId1 = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + orgInput1.getOrgName() + "\';", Integer.class);
//        orgIds.add(orgId1);
//
//        //初始化组织:[测试]成都分公司
//        OrgInput orgInput2 = new OrgInput();
//        orgInput2.setOrgName("[测试]成都分公司");
//        orgInput2.setParentId(orgId);
//        orgInput2.setOrgGroupId(orgGroupId);
//        orgInput2.setNameLocale("{\"zh-CN\":\"" + orgInput2.getOrgName() + "\",\"en-US\":\"\",\"th-TH\":\"\",\"vi-VN\":\"\"}");
//        orgInput2.setCountry(1);
//        orgApi.createOrg(orgInput2);
//        Integer orgId2 = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + orgInput2.getOrgName() + "\';", Integer.class);
//        orgIds.add(orgId2);
//
//        //初始化组织:[测试]重庆分拣仓
//        OrgInput orgInput3 = new OrgInput();
//        orgInput3.setOrgName("[测试]重庆分拣仓");
//        orgInput3.setParentId(orgId1);
//        orgInput3.setOrgGroupId(orgGroupId);
//        orgInput3.setNameLocale("{\"zh-CN\":\"" + orgInput3.getOrgName() + "\",\"en-US\":\"\",\"th-TH\":\"\",\"vi-VN\":\"\"}");
//        orgInput3.setCountry(1);
//        orgInput3.setAppId(2);
//        orgApi.createOrg(orgInput3);
//        Integer orgId3 = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + orgInput3.getOrgName() + "\';", Integer.class);
//        orgInput3.setId(orgId3);
//        orgIds.add(orgId3);
//
//        //初始化组织:[测试]重庆批发
//        OrgInput orgInput4 = new OrgInput();
//        orgInput4.setOrgName("[测试]重庆批发");
//        orgInput4.setParentId(orgId1);
//        orgInput4.setOrgGroupId(orgGroupId);
//        orgInput4.setNameLocale("{\"zh-CN\":\"" + orgInput4.getOrgName() + "\",\"en-US\":\"\",\"th-TH\":\"\",\"vi-VN\":\"\"}");
//        orgInput4.setCountry(1);
//        orgInput4.setAppId(4);
//        orgApi.createOrg(orgInput4);
//        Integer orgId4 = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + orgInput4.getOrgName() + "\';", Integer.class);
//        orgIds.add(orgId4);
//
//        //初始化组织:[测试]成都分拣仓
//        OrgInput orgInput5 = new OrgInput();
//        orgInput5.setOrgName("[测试]成都分拣仓");
//        orgInput5.setParentId(orgId2);
//        orgInput5.setOrgGroupId(orgGroupId);
//        orgInput5.setNameLocale("{\"zh-CN\":\"" + orgInput5.getOrgName() + "\",\"en-US\":\"\",\"th-TH\":\"\",\"vi-VN\":\"\"}");
//        orgInput5.setCountry(1);
//        orgInput5.setAppId(2);
//        orgApi.createOrg(orgInput5);
//        Integer orgId5 = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + orgInput5.getOrgName() + "\';", Integer.class);
//        orgInput5.setId(orgId5);
//        orgIds.add(orgId5);
//
//        //初始化组织:[测试]成都批发
//        OrgInput orgInput6 = new OrgInput();
//        orgInput6.setOrgName("[测试]成都批发");
//        orgInput6.setParentId(orgId2);
//        orgInput6.setOrgGroupId(orgGroupId);
//        orgInput6.setNameLocale("{\"zh-CN\":\"" + orgInput6.getOrgName() + "\",\"en-US\":\"\",\"th-TH\":\"\",\"vi-VN\":\"\"}");
//        orgInput6.setCountry(1);
//        orgInput6.setAppId(4);
//        orgApi.createOrg(orgInput6);
//        Integer orgId6 = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + orgInput6.getOrgName() + "\';", Integer.class);
//        orgIds.add(orgId6);
//
//        for (int i = 0; i < 20; i++) {
//            UserMangerInput userMangerInput = new UserMangerInput();
//            userMangerInput.setOrgId(orgId3);
//            userMangerInput.setOrgGroupId(orgInput3.getOrgGroupId());
//            userMangerInput.setPhone("133000010" + String.format("%02d", i));
//            userMangerInput.setUserAccount(userMangerInput.getPhone() + "@test.com");
//            userMangerInput.setName("测试账号" + userMangerInput.getPhone());
//            userMangerInput.setRelOrgIds(Arrays.asList(orgId3, orgId5));
//            String userId = userManageApi.createUserMange(userMangerInput);
//            userIds.add(userId);
//        }
//
//        Integer userId = userJdbc.queryForObject("select  id from fc_user_center.mdm_user where phone='13300001000';", Integer.class);
//
//        SortingWarehouseInput sortingWarehouseInput = new SortingWarehouseInput();
//        sortingWarehouseInput.setOrgGroupId(orgInput3.getOrgGroupId());
//        sortingWarehouseInput.setOrgId(orgId3);
//        sortingWarehouseInput.setSortingWarehouseName("[测试]重庆分拣仓");
//        sortingWarehouseInput.setWarehouseName("[测试]重庆分拣仓");
//        sortingWarehouseInput.setWarehouseAddress("[测试]重庆江津区洪九果品分拣仓");
//        sortingWarehouseInput.setUserId(userId);
//        pitayaSortingWarehouseApi.createPitayaSortingWarehouse(sortingWarehouseInput);
//        log.info("====================初始化分拣仓结束=======================");
//
//        log.info("====================初始化商品数据开始=======================");
//        //初始化产地管理
//        List<String> firstPlaces = Arrays.asList("[测试]中国", "[测试]越南");
//        List<String> sencondPlaces = Arrays.asList("[测试]重庆", "[测试]四川", "[测试]江西", "[测试]贵州");
//        List<String> thirdPlaces = Arrays.asList("[测试]万州", "[测试]合川", "[测试]涪陵");
//
//        PlaceInput placeInput = new PlaceInput();
//        for (int i = 0; i < firstPlaces.size(); i++) {
//            placeInput.setPlacePid(0);
//            placeInput.setPlaceName(firstPlaces.get(i));
//            Integer firstPlaceId = varietyAndPlaceApi.modifyPlace(placeInput);
//            if (firstPlaces.get(i).equals("[测试]中国")) {
//                for (int j = 0; j < sencondPlaces.size(); j++) {
//                    placeInput.setPlacePid(firstPlaceId);
//                    placeInput.setPlaceName(sencondPlaces.get(j));
//                    Integer sencondPlaceId = varietyAndPlaceApi.modifyPlace(placeInput);
//                    if (sencondPlaces.get(j).equals("[测试]重庆")) {
//                        for (int k = 0; k < thirdPlaces.size(); k++) {
//                            placeInput.setPlacePid(sencondPlaceId);
//                            placeInput.setPlaceName(thirdPlaces.get(k));
//                            varietyAndPlaceApi.modifyPlace(placeInput);
//                        }
//                    }
//                }
//            }
//        }
//
//        //初始化商品分类：水果、食品、辅料、周转筐
//
//        List<Option> options = commodityApi.typeOption();
//        Map<String, List<String>> map = new HashMap<>();
//        map.put("食品", Arrays.asList("[测试]榴莲饼", "[测试]南瓜饼"));
//        map.put("水果", Arrays.asList("[测试]榴莲", "[测试]西红柿","[测试]柚子","[测试]葡萄"));
//        map.put("辅料", Arrays.asList("[测试]塑料袋", "[测试]包装盒"));
//        map.put("周转筐", Arrays.asList("[测试]自备周转筐", "[测试]客户周转筐"));
//
//        for (String key:map.keySet()) {
//            for (Option option : options) {
//                if (key.equals(option.getLabel())) {
//                    List<String> value = map.get(key);
//                    for (String s : value) {
//                        Long countCategory = categoryApi.countCategory();
//                        CategoryInput categoryInput = new CategoryInput();
//                        ArrayList<NameInput> nameInputs = new ArrayList<>();
//                        NameInput nameInput = new NameInput();
//                        nameInput.setLocale("zh-CN");
//                        nameInput.setName(s);
//                        nameInputs.add(nameInput);
//                        categoryInput.setNameLocale(nameInputs);
//                        categoryInput.setCommodityTypeId(option.getValue());
//                        categoryInput.setCategorySort(countCategory.intValue());
//                        categoryApi.createCategory(categoryInput);
//                    }
//                }
//            }
//        }
//        //todo 设置水果商品分类的 品种和产地
//
//        //todo 添加商品
//        //关联商品到生产系统
//        PitayaListCreateCommodityInput pitayaListCreateCommodityInput = new PitayaListCreateCommodityInput();
//        List<PitayaCreateCommodityInput> pitayaCreateCommodityInputs = new ArrayList<>();
//        PitayaCreateCommodityInput pitayaCreateCommodityInput = new PitayaCreateCommodityInput();
//        pitayaCreateCommodityInput.setCommodityId();
//        pitayaListCreateCommodityInput.setCreateCommodityInput();
//
//
//        pitayaCommodityApi.pitayaCreateCommodity(pitayaListCreateCommodityInput);
//
//
//
//        log.info("====================初始化商品数据结束=======================");
//
//
//        log.info("===================基础数据准备结束======================");
    }

    @Override
    public void clear() {

    }

    /**
     * 初始化 组织架构 数据
     */
    private Integer initOrgGroup(String orgGroupName) {
        CreateOrgGroupInput createOrgGroupInput = new CreateOrgGroupInput();
        createOrgGroupInput.setName(orgGroupName);
        orgApi.createOrgGroup(createOrgGroupInput);
        Integer orgGroupId = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + createOrgGroupInput.getName() + "\';", Integer.class);
        return orgGroupId;
    }

    /**
     * 初始化 组织 数据
     */
    private Integer initOrg(String orgName, Integer orgGroupId, Integer orgPid, Integer appId) {
        OrgInput orgInput = new OrgInput();
        orgInput.setOrgName(orgName);
        orgInput.setParentId(orgPid);
        orgInput.setOrgGroupId(orgGroupId);
        orgInput.setNameLocale("{\"zh-CN\":\"" + orgInput.getOrgName() + "\",\"en-US\":\"\",\"th-TH\":\"\",\"vi-VN\":\"\"}");
        orgInput.setCountry(1);
        orgInput.setAppId(3);
        orgApi.createOrg(orgInput);
        Integer orgId = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + orgInput.getOrgName() + "\';", Integer.class);
        orgIds.add(orgId);
        return orgId;
    }

    /**
     * 参数化类型
     */
    @Getter
    @AllArgsConstructor
    public enum ParamsType {
        COMMODITY("商品"),
        KEY_VALUE("键值对"),
        WAREHOUSE("仓库");

        private String description;
    }


}
