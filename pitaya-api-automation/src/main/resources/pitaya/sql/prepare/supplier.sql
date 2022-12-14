-- 组织 orgId=10567下的供应商
-- 供应商数据
INSERT INTO "fc_supplier"."supplier_base" ("id", "name", "supplier_address", "house_num", "tfn", "deleted",
                                           "create_time", "create_by", "updated_time", "updated_by", "phone_num",
                                           "landline_num")
VALUES (10200, '[测试]周转筐供应商', '', '', '', 0, '2021-12-28 14:09:22.634568', 1001015, '2021-12-28 14:09:22.63457', 1001015,
        NULL, NULL);
INSERT INTO "fc_supplier"."supplier_base" ("id", "name", "supplier_address", "house_num", "tfn", "deleted",
                                           "create_time", "create_by", "updated_time", "updated_by", "phone_num",
                                           "landline_num")
VALUES (10199, '[测试]水果供应商', '', '', '', 0, '2021-12-28 14:08:35.890014', 1001015, '2021-12-28 14:08:48.461195', 1001015,
        NULL, NULL);
INSERT INTO "fc_supplier"."supplier_base" ("id", "name", "supplier_address", "house_num", "tfn", "deleted",
                                           "create_time", "create_by", "updated_time", "updated_by", "phone_num",
                                           "landline_num")
VALUES (10198, '[测试]食品供应商', '', '', '', 0, '2021-12-28 14:07:10.526168', 1001015, '2021-12-28 14:07:10.526171', 1001015,
        NULL, NULL);
INSERT INTO "fc_supplier"."supplier_base" ("id", "name", "supplier_address", "house_num", "tfn", "deleted",
                                           "create_time", "create_by", "updated_time", "updated_by", "phone_num",
                                           "landline_num")
VALUES (10197, '[测试]辅料供应商', '', '', '', 0, '2021-12-28 14:06:32.420539', 1001015, '2021-12-28 14:06:43.405426', 1001015,
        NULL, NULL);

-- 供应商与组织关联关系
INSERT INTO "fc_supplier"."supplier_detail" ("id", "supplier_id", "supplier_short_name", "remark", "organization_id",
                                             "app_id", "deleted", "create_time", "create_by", "updated_time",
                                             "updated_by", "commodity_type_id", "phone_num", "landline_num",
                                             "financial_system_code")
VALUES (10289, 10200, '[测试]筐供', '', 10567, 2, 0, '2021-12-28 14:09:22.63726', 1001015, '2021-12-28 14:09:22.637262',
        1001015, 4, '13300002003', '', '10289');
INSERT INTO "fc_supplier"."supplier_detail" ("id", "supplier_id", "supplier_short_name", "remark", "organization_id",
                                             "app_id", "deleted", "create_time", "create_by", "updated_time",
                                             "updated_by", "commodity_type_id", "phone_num", "landline_num",
                                             "financial_system_code")
VALUES (10288, 10199, '[测试]果供', '', 10567, 2, 0, '2021-12-28 14:08:35.892304', 1001015, '2021-12-28 14:08:48.46261',
        1001015, 1, '13300002002', '', '');
INSERT INTO "fc_supplier"."supplier_detail" ("id", "supplier_id", "supplier_short_name", "remark", "organization_id",
                                             "app_id", "deleted", "create_time", "create_by", "updated_time",
                                             "updated_by", "commodity_type_id", "phone_num", "landline_num",
                                             "financial_system_code")
VALUES (10287, 10198, '[测试]食供', '', 10567, 2, 0, '2021-12-28 14:07:10.528086', 1001015, '2021-12-28 14:07:10.528088',
        1001015, 2, '13300002001', '', '10287');
INSERT INTO "fc_supplier"."supplier_detail" ("id", "supplier_id", "supplier_short_name", "remark", "organization_id",
                                             "app_id", "deleted", "create_time", "create_by", "updated_time",
                                             "updated_by", "commodity_type_id", "phone_num", "landline_num",
                                             "financial_system_code")
VALUES (10286, 10197, '[测试]辅供', '', 10567, 2, 0, '2021-12-28 14:06:32.429338', 1001015, '2021-12-28 14:06:43.407847',
        1001015, 3, '13300002000', '', '');

