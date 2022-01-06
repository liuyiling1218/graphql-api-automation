package com.hjfruit.test.pitaya.utils;

import com.alibaba.fastjson.JSON;
import com.hjfruit.test.pitaya.config.ApiAutomationConfig;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @description {}
 * @Author 吴随伟
 * @date 2021/12/22
 */
public class YamlUtil {
    @Autowired
    ApiAutomationConfig config;

    public static <T> T loadAs(Class<T> tClass) {
        return loadAs(null, tClass, toLowserCaseFirstOne(tClass.getSimpleName()));
    }

    public static <T> T loadAs(Class<T> tClass, String name) {
        return loadAs(null, tClass, toLowserCaseFirstOne(tClass.getSimpleName()));
    }

    public static <T> T loadAs(String filePath, Class<T> tClass, String name) {
        Yaml yaml = new Yaml();
        if (StringUtils.isBlank(filePath)) {
            String packageName = tClass.getPackageName();

            String relativePackageName = packageName.replace("com.hjfruit.test.pitaya.app.entities.", "");
            filePath = "pitaya/templates/" + relativePackageName.replace(".", "/") + "/" + toLowserCaseFirstOne(tClass.getSimpleName()) + ".yml";
            System.out.println(filePath);
        }
        InputStream inputStream = YamlUtil.class.getClassLoader().getResourceAsStream(filePath);
        Iterable<Object> objects = yaml.loadAll(inputStream);
        for (Object o : objects) {
            if (o instanceof HashMap) {
                Map<String, T> map = (HashMap<String, T>) o;
                if (map.get(name) != null) {
                    return JSON.parseObject(JSON.toJSONString(map.get(name)), tClass);
                }
            }
        }
        throw new IllegalArgumentException("未找到对应的yaml数据");
//
//        return yaml.loadAs(inputStream, tClass);
    }

    private static String toLowserCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0))) {
            return s;
        } else {
            return Character.toLowerCase(s.charAt(0)) + s.substring(1);
        }
    }
}
