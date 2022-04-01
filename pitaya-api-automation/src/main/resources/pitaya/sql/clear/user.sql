/*组织架构*/
-- 删除组织架构及组织
delete
from "fc_user_center"."mdm_org"
where id BETWEEN 10561 AND 10564;
-- 删除运营平台超管账号
delete
from "fc_user_center"."mdm_user"
where id = 11000726;
delete
from "fc_user_center"."user_org_rel"