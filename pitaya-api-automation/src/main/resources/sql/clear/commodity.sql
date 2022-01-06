
-- 商品产地
DELETE  FROM "public"."commodity_place_origin" where place_origin_id  between 1079 and 1087;

-- 商品分类
DELETE  FROM  "public"."commodity_category" where category_id between 1078 and 1088;

--商品存储条件(外键自动关联起来的数据)
DELETE  FROM  "public"."commodity_storage_manage" where category_id between 1078 and 1088;

-- 商品分类-产地关联关系
DELETE FROM "public"."commodity_category_origin"  where category_id in (1085,1086);

-- 商品分类-品种关联关系
DELETE FROM  "public"."commodity_variety"  where variety_id between 10130 and 10134;

-- 商品
DELETE  FROM "public"."commodity" where commodity_id between 10270 and 10277;

-- 商品规格
DELETE FROM "public"."commodity_spec" where commodity_id between 10270 and 10277;

-- 商品规格选项
DELETE FROM "public"."commodity_spec_option" where commodity_id between 10270 and 10277;

-- 商品sku
DELETE FROM "public"."commodity_sku" where commodity_id between 10270 and 10277;