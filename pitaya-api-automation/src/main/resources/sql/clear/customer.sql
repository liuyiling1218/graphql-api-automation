-- 删除用户数据
delete from "fc_customer"."customer" where id in (10001);
delete from "fc_customer"."customer_address" where id in (100001);
delete from "fc_customer"."customer_detail" where id in (110001);
