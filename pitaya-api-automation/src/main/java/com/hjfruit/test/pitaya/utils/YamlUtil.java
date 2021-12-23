package com.hjfruit.test.pitaya.utils;

import com.hjfruit.test.pitaya.config.ApiAutomationConfig;
import com.hjfruit.test.pitaya.entities.production.inorder.CreateAcquireInput;
import com.hjfruit.test.pitaya.entities.production.inorder.PurchaseOrderInsertInput;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

/**
 * @description {}
 * @Author 吴随伟
 * @date 2021/12/22
 */
public class YamlUtil {
    @Autowired
    ApiAutomationConfig config;

    public static void main(String[] args) {

//        String filePath = "templates/inorder/purchaseOrderInsertInput.yml";
        CreateAcquireInput purchaseOrderInsertInput = YamlUtil.loadAs(CreateAcquireInput.class);
        System.out.println(purchaseOrderInsertInput);
//        CreateAcquireInput purchaseOrderInsertInput1 = YamlUtil.loadAs("createAcquireInput-accessories.yml", CreateAcquireInput.class);
//        System.out.println(purchaseOrderInsertInput1);
    }

    public static <T> T loadAs(Class<T> tClass) {
        return loadAs(null, tClass);
    }

    public static <T> T loadAs(String filePath, Class<T> tClass) {
        Yaml yaml = new Yaml();
        if (StringUtils.isBlank(filePath)) {
            String packageName = tClass.getPackageName();
            String relativePackageName = packageName.replace("com.hjfruit.test.pitaya.entities.", "");
            filePath = "templates/" + relativePackageName.replace(".", "/") + "/" + toLowserCaseFirstOne(tClass.getSimpleName()) + ".yml";
            System.out.println(filePath);
        }
        InputStream inputStream = YamlUtil.class.getClassLoader().getResourceAsStream(filePath);
        return yaml.loadAs(inputStream, tClass);
    }

    private static String toLowserCaseFirstOne(String s) {
        if (Character.isLowerCase(s.charAt(0))) {
            return s;
        } else {
            return Character.toLowerCase(s.charAt(0)) + s.substring(1);
        }
    }
}
