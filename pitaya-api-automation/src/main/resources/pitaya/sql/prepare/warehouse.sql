-- 初始化分拣仓（重庆分拣仓orgId=10567）
INSERT INTO "fc_warehouse"."warehouse" ("id", "type", "deleted", "create_time", "create_by", "update_time", "update_by",
                                        "address", "name", "house_number")
VALUES (10158, 1, 0, '2021-12-23 18:00:11.839', 1000726, '2021-12-23 18:00:11.839', 1000726, '[测试]重庆江津区洪九果品分拣仓',
        '[测试]重庆分拣仓', '[测试]仓库门牌号');
INSERT INTO "fc_warehouse"."warehouse_detail" ("id", "warehouse_id", "organization_id", "app_id", "deleted",
                                               "create_time", "create_by", "update_time", "update_by", "remark",
                                               "organization_name")
VALUES (10158, 10158, 10567, 2, 0, '2021-12-23 18:00:12.054', 1000726, '2021-12-23 18:00:12.054', 1000726,
        '[测试]备注信息~~~', '[测试]重庆分拣仓');
