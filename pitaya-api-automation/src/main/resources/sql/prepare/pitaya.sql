-- 关联商品数据


-- 关联团队数据
INSERT INTO "public"."team_user" ("user_id", "store_ids", "org_id", "user_tag", "team_id", "role_ids", "deleted") VALUES (11000701, '{10158}', 3360, 1, 10109, '{10401}', 99);

-- 分拣仓
INSERT INTO "public"."production_sorting_warehouse" ("id", "user_id", "org_id", "org_group_id") VALUES (1041, 11000701, 3360, 3356);


-- 关联商品到生产系统
INSERT INTO "public"."commodity" ("commodity_id", "commodity_type_id", "sku_quantity", "bom_quantity", "status", "create_time", "create_by", "update_time", "update_by", "deleted", "category_id") VALUES (10277, 1, 0, 0, 99, '2021-12-28 11:55:11.8905+08', 1, '2021-12-28 11:55:11.8905+08', 1, 99, 1086);
INSERT INTO "public"."commodity" ("commodity_id", "commodity_type_id", "sku_quantity", "bom_quantity", "status", "create_time", "create_by", "update_time", "update_by", "deleted", "category_id") VALUES (10276, 1, 0, 0, 99, '2021-12-28 11:55:11.890575+08', 1, '2021-12-28 11:55:11.890575+08', 1, 99, 1086);
INSERT INTO "public"."commodity" ("commodity_id", "commodity_type_id", "sku_quantity", "bom_quantity", "status", "create_time", "create_by", "update_time", "update_by", "deleted", "category_id") VALUES (10275, 3, 0, 0, 99, '2021-12-28 11:55:11.890579+08', 1, '2021-12-28 11:55:11.890579+08', 1, 99, 1088);
INSERT INTO "public"."commodity" ("commodity_id", "commodity_type_id", "sku_quantity", "bom_quantity", "status", "create_time", "create_by", "update_time", "update_by", "deleted", "category_id") VALUES (10274, 2, 0, 0, 99, '2021-12-28 11:55:11.890582+08', 1, '2021-12-28 11:55:11.890582+08', 1, 99, 1080);
INSERT INTO "public"."commodity" ("commodity_id", "commodity_type_id", "sku_quantity", "bom_quantity", "status", "create_time", "create_by", "update_time", "update_by", "deleted", "category_id") VALUES (10273, 2, 0, 0, 99, '2021-12-28 11:55:11.890584+08', 1, '2021-12-28 11:55:11.890584+08', 1, 99, 1079);
INSERT INTO "public"."commodity" ("commodity_id", "commodity_type_id", "sku_quantity", "bom_quantity", "status", "create_time", "create_by", "update_time", "update_by", "deleted", "category_id") VALUES (10272, 3, 0, 0, 99, '2021-12-28 11:55:11.890586+08', 1, '2021-12-28 11:55:11.890586+08', 1, 99, 1087);
INSERT INTO "public"."commodity" ("commodity_id", "commodity_type_id", "sku_quantity", "bom_quantity", "status", "create_time", "create_by", "update_time", "update_by", "deleted", "category_id") VALUES (10271, 4, 0, 0, 99, '2021-12-28 11:55:11.890588+08', 1, '2021-12-28 11:55:11.890589+08', 1, 99, 1082);
INSERT INTO "public"."commodity" ("commodity_id", "commodity_type_id", "sku_quantity", "bom_quantity", "status", "create_time", "create_by", "update_time", "update_by", "deleted", "category_id") VALUES (10270, 4, 0, 0, 99, '2021-12-28 11:55:11.890591+08', 1, '2021-12-28 11:55:11.890591+08', 1, 99, 1081);
