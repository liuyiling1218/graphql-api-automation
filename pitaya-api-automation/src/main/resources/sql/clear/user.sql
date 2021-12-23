
-- 组织架构
delete  from  mdm_org where id in (3363,3362,3361,3360,3359,3358,3357,3356);

-- 运营平台超管账号（账号：18500001111)
delete from "fc_user_center"."mdm_user" where  id = 11000726;
delete from "fc_user_center"."user_org_rel" where  id = 111572;
