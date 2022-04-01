-- 初始化分拣仓（[测试]重庆分拣仓）
DELETE
FROM "fc_warehouse"."warehouse"
where id in (10158);
DELETE
FROM "fc_warehouse"."warehouse_detail"
where id in (10158);