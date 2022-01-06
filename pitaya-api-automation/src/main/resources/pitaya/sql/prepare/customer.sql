-- orgId=1010567

-- 客户分组
INSERT INTO "fc_customer"."customer_channel" ("id", "app_id", "channel_name", "create_time", "create_by", "update_time", "update_by", "deleted", "organization_id") VALUES (1077, 2, '新零售', '2021-12-27 16:40:44.676872', 1, '2021-12-27 16:40:44.676874', 1, 0, 10567);
INSERT INTO "fc_customer"."customer_channel" ("id", "app_id", "channel_name", "create_time", "create_by", "update_time", "update_by", "deleted", "organization_id") VALUES (1076, 2, '社群', '2021-12-27 16:40:44.671953', 1, '2021-12-27 16:40:44.671956', 1, 0, 10567);
INSERT INTO "fc_customer"."customer_channel" ("id", "app_id", "channel_name", "create_time", "create_by", "update_time", "update_by", "deleted", "organization_id") VALUES (1075, 2, '电商', '2021-12-27 16:40:44.667142', 1, '2021-12-27 16:40:44.667146', 1, 0, 10567);

-- 客户
INSERT INTO "fc_customer"."customer" ("id", "name", "phone", "type", "create_time", "create_by", "update_time", "update_by", "deleted", "id_number", "taxpayer_identification_number", "pinyin_of_name") VALUES (101113, '[测试]多多优选', '', 2, '2021-12-28 15:06:09.127968', 1001015, '1970-01-01 08:00:00', 1001015, 0, '', '', '[ceshi]duoduoyouxuan');
INSERT INTO "fc_customer"."customer" ("id", "name", "phone", "type", "create_time", "create_by", "update_time", "update_by", "deleted", "id_number", "taxpayer_identification_number", "pinyin_of_name") VALUES (101112, '[测试]美团集团', '', 2, '2021-12-28 15:03:52.911878', 1001015, '1970-01-01 08:00:00', 1001015, 0, '', '', '[ceshi]meituanjituan');

-- 客户地址
INSERT INTO "fc_customer"."customer_address" ("id", "customer_id", "address_name", "delivery_name", "contacts", "contacts_phone", "deleted", "create_time", "create_by", "update_time", "update_by", "organization_id", "app_id") VALUES (10192, 101113, '', '多多优选巴南仓', '多多2', '13300003004', 0, '2021-12-28 15:06:09.130728', 1001015, '1970-01-01 08:00:00', 1001015, 10567, 2);
INSERT INTO "fc_customer"."customer_address" ("id", "customer_id", "address_name", "delivery_name", "contacts", "contacts_phone", "deleted", "create_time", "create_by", "update_time", "update_by", "organization_id", "app_id") VALUES (10191, 101113, '', '多多优选江津仓', '多多', '13300003003', 0, '2021-12-28 15:06:09.130726', 1001015, '1970-01-01 08:00:00', 1001015, 10567, 2);
INSERT INTO "fc_customer"."customer_address" ("id", "customer_id", "address_name", "delivery_name", "contacts", "contacts_phone", "deleted", "create_time", "create_by", "update_time", "update_by", "organization_id", "app_id") VALUES (10190, 101112, '', '美团渝中仓', '李四', '13300003001', 0, '2021-12-28 15:03:52.916301', 1001015, '1970-01-01 08:00:00', 1001015, 10567, 2);
INSERT INTO "fc_customer"."customer_address" ("id", "customer_id", "address_name", "delivery_name", "contacts", "contacts_phone", "deleted", "create_time", "create_by", "update_time", "update_by", "organization_id", "app_id") VALUES (10189, 101112, '', '美团万州仓', '张三', '13300003000', 0, '2021-12-28 15:03:52.916299', 1001015, '1970-01-01 08:00:00', 1001015, 10567, 2);

-- 客户详情
INSERT INTO "fc_customer"."customer_detail" ("id", "customer_id", "app_id", "alias", "channel_id", "remark", "create_time", "create_by", "update_time", "update_by", "deleted", "purchase_name", "purchase_alias", "organization_id", "purchase_phone", "purchase_id_number", "financial_system_code") VALUES (101146, 101113, 2, '[测试]多多', 1075, '', '2021-12-28 15:06:09.129115', 1001015, '1970-01-01 08:00:00', 1001015, 0, '', '', 10567, '', '', '101146');
INSERT INTO "fc_customer"."customer_detail" ("id", "customer_id", "app_id", "alias", "channel_id", "remark", "create_time", "create_by", "update_time", "update_by", "deleted", "purchase_name", "purchase_alias", "organization_id", "purchase_phone", "purchase_id_number", "financial_system_code") VALUES (101145, 101112, 2, '[测试]美团', 1075, '', '2021-12-28 15:03:52.914139', 1001015, '1970-01-01 08:00:00', 1001015, 0, '', '', 10567, '', '', '101145');

