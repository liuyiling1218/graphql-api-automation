-- org_id 346
-- customer 表
INSERT INTO "fc_customer"."customer" ("id", "name", "phone", "type", "create_time", "create_by", "update_time",
                                      "update_by", "deleted", "id_number", "taxpayer_identification_number",
                                      "pinyin_of_name")
VALUES (10001, '美团集团', '', 2, '2021-12-23 16:19:39.444236', 100014, '1970-01-01 08:00:00', 100014, 0, '', '',
        'meituan');
-- customer_address 表
INSERT INTO "fc_customer"."customer_address" ("id", "customer_id", "address_name", "delivery_name", "contacts",
                                              "contacts_phone", "deleted", "create_time", "create_by", "update_time",
                                              "update_by", "organization_id", "app_id")
VALUES (100001, 10001, '美团大仓', '美团大仓江津配送地址', '张三', '15600001234', 0, '2021-12-23 16:19:39.449104', 100014,
        '1970-01-01 08:00:00', 100014, 346, 2);
-- customer_detail 表
INSERT INTO "fc_customer"."customer_detail" ("id", "customer_id", "app_id", "alias", "channel_id", "remark",
                                             "create_time", "create_by", "update_time", "update_by", "deleted",
                                             "purchase_name", "purchase_alias", "organization_id", "purchase_phone",
                                             "purchase_id_number", "financial_system_code")
VALUES (110001, 10001, 2, '美团', 21, '', '2021-12-23 16:19:39.446747', 100014, '1970-01-01 08:00:00', 100014, 0, '',
        '', 346, '', '', '100001');

