-- orgId=10567

-- 客户分组
DELETE
FROM "fc_customer"."customer_channel"
where id between 1075 and 1077;

-- 客户
DELETE
FROM "fc_customer"."customer"
where id in (101112, 101113);

-- 客户地址
DELETE
FROM "fc_customer"."customer_address"
where customer_id in (101112, 101113);

-- 客户详情
DELETE
FROM "fc_customer"."customer_detail"
where customer_id in (101112, 101113);