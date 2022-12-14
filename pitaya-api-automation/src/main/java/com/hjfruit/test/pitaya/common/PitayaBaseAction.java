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

//        log.info("===================????????????????????????======================");
//        //todo ??????????????????
//        //??????operation???????????????
//        //???????????????
//        log.info("====================??????????????????=======================");
//        SendCodeMsgInput sendCodeMsgInput = new SendCodeMsgInput();
//        sendCodeMsgInput.setPhone("18800000000");
//        userApi.sendCodeMsg(sendCodeMsgInput);
//        //??????
//        LoginInput loginInput = new LoginInput();
//        loginInput.setPhone("18800000000");
//        loginInput.setCode("666666");
//        Autheration.token = userApi.login(loginInput);
//
//
//        log.info("====================????????????????????????=======================");
//        //?????????????????????
//        String orgGroupName = "[??????]????????????";
//
//        //????????????????????????[??????]????????????
//        CreateOrgGroupInput createOrgGroupInput = new CreateOrgGroupInput();
//        createOrgGroupInput.setName("[??????]????????????");
//        orgApi.createOrgGroup(createOrgGroupInput);
//        Integer orgGroupId = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + createOrgGroupInput.getName() + "\';", Integer.class);
//        orgIds.add(orgGroupId);
//
//        //???????????????:[??????]??????????????????????????????
//        OrgInput orgInput = new OrgInput();
//        orgInput.setOrgName("[??????]??????????????????????????????");
//        orgInput.setParentId(orgGroupId);
//        orgInput.setOrgGroupId(orgGroupId);
//        orgInput.setNameLocale("{\"zh-CN\":\"" + orgInput.getOrgName() + "\",\"en-US\":\"\",\"th-TH\":\"\",\"vi-VN\":\"\"}");
//        orgInput.setCountry(1);
//        orgInput.setAppId(3);
//        orgApi.createOrg(orgInput);
//        Integer orgId = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + orgInput.getOrgName() + "\';", Integer.class);
//        orgIds.add(orgId);
//
//        //???????????????:[??????]???????????????
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
//        //???????????????:[??????]???????????????
//        OrgInput orgInput2 = new OrgInput();
//        orgInput2.setOrgName("[??????]???????????????");
//        orgInput2.setParentId(orgId);
//        orgInput2.setOrgGroupId(orgGroupId);
//        orgInput2.setNameLocale("{\"zh-CN\":\"" + orgInput2.getOrgName() + "\",\"en-US\":\"\",\"th-TH\":\"\",\"vi-VN\":\"\"}");
//        orgInput2.setCountry(1);
//        orgApi.createOrg(orgInput2);
//        Integer orgId2 = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + orgInput2.getOrgName() + "\';", Integer.class);
//        orgIds.add(orgId2);
//
//        //???????????????:[??????]???????????????
//        OrgInput orgInput3 = new OrgInput();
//        orgInput3.setOrgName("[??????]???????????????");
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
//        //???????????????:[??????]????????????
//        OrgInput orgInput4 = new OrgInput();
//        orgInput4.setOrgName("[??????]????????????");
//        orgInput4.setParentId(orgId1);
//        orgInput4.setOrgGroupId(orgGroupId);
//        orgInput4.setNameLocale("{\"zh-CN\":\"" + orgInput4.getOrgName() + "\",\"en-US\":\"\",\"th-TH\":\"\",\"vi-VN\":\"\"}");
//        orgInput4.setCountry(1);
//        orgInput4.setAppId(4);
//        orgApi.createOrg(orgInput4);
//        Integer orgId4 = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + orgInput4.getOrgName() + "\';", Integer.class);
//        orgIds.add(orgId4);
//
//        //???????????????:[??????]???????????????
//        OrgInput orgInput5 = new OrgInput();
//        orgInput5.setOrgName("[??????]???????????????");
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
//        //???????????????:[??????]????????????
//        OrgInput orgInput6 = new OrgInput();
//        orgInput6.setOrgName("[??????]????????????");
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
//            userMangerInput.setName("????????????" + userMangerInput.getPhone());
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
//        sortingWarehouseInput.setSortingWarehouseName("[??????]???????????????");
//        sortingWarehouseInput.setWarehouseName("[??????]???????????????");
//        sortingWarehouseInput.setWarehouseAddress("[??????]????????????????????????????????????");
//        sortingWarehouseInput.setUserId(userId);
//        pitayaSortingWarehouseApi.createPitayaSortingWarehouse(sortingWarehouseInput);
//        log.info("====================????????????????????????=======================");
//
//        log.info("====================???????????????????????????=======================");
//        //?????????????????????
//        List<String> firstPlaces = Arrays.asList("[??????]??????", "[??????]??????");
//        List<String> sencondPlaces = Arrays.asList("[??????]??????", "[??????]??????", "[??????]??????", "[??????]??????");
//        List<String> thirdPlaces = Arrays.asList("[??????]??????", "[??????]??????", "[??????]??????");
//
//        PlaceInput placeInput = new PlaceInput();
//        for (int i = 0; i < firstPlaces.size(); i++) {
//            placeInput.setPlacePid(0);
//            placeInput.setPlaceName(firstPlaces.get(i));
//            Integer firstPlaceId = varietyAndPlaceApi.modifyPlace(placeInput);
//            if (firstPlaces.get(i).equals("[??????]??????")) {
//                for (int j = 0; j < sencondPlaces.size(); j++) {
//                    placeInput.setPlacePid(firstPlaceId);
//                    placeInput.setPlaceName(sencondPlaces.get(j));
//                    Integer sencondPlaceId = varietyAndPlaceApi.modifyPlace(placeInput);
//                    if (sencondPlaces.get(j).equals("[??????]??????")) {
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
//        //????????????????????????????????????????????????????????????
//
//        List<Option> options = commodityApi.typeOption();
//        Map<String, List<String>> map = new HashMap<>();
//        map.put("??????", Arrays.asList("[??????]?????????", "[??????]?????????"));
//        map.put("??????", Arrays.asList("[??????]??????", "[??????]?????????","[??????]??????","[??????]??????"));
//        map.put("??????", Arrays.asList("[??????]?????????", "[??????]?????????"));
//        map.put("?????????", Arrays.asList("[??????]???????????????", "[??????]???????????????"));
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
//        //todo ??????????????????????????? ???????????????
//
//        //todo ????????????
//        //???????????????????????????
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
//        log.info("====================???????????????????????????=======================");
//
//
//        log.info("===================????????????????????????======================");
    }

    @Override
    public void clear() {

    }

    /**
     * ????????? ???????????? ??????
     */
    private Integer initOrgGroup(String orgGroupName) {
        CreateOrgGroupInput createOrgGroupInput = new CreateOrgGroupInput();
        createOrgGroupInput.setName(orgGroupName);
        orgApi.createOrgGroup(createOrgGroupInput);
        Integer orgGroupId = userJdbc.queryForObject("select id from fc_user_center.mdm_org where org_name = \'" + createOrgGroupInput.getName() + "\';", Integer.class);
        return orgGroupId;
    }

    /**
     * ????????? ?????? ??????
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
     * ???????????????
     */
    @Getter
    @AllArgsConstructor
    public enum ParamsType {
        COMMODITY("??????"),
        KEY_VALUE("?????????"),
        WAREHOUSE("??????");

        private String description;
    }


}
