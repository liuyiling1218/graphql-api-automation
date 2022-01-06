-- 组织 orgId=567下的供应商
-- 供应商数据
DELETE FROM "fc_supplier"."supplier_base" where id between 10197 and 10200;

-- 供应商与组织关联关系
DELETE FROM "fc_supplier"."supplier_detail" where supplier_id between 10197 and 10200;