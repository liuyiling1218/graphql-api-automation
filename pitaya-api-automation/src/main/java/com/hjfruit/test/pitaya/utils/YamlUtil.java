package com.hjfruit.test.pitaya.utils;

import org.yaml.snakeyaml.Yaml;

import java.io.InputStream;

/**
 * @description {}
 * @Author 吴随伟
 * @date 2021/12/22
 */
public class YamlUtil {

    public static void main(String[] args) {

        Yaml yaml = new Yaml();
        InputStream inputStream = YamlUtil.class.getClassLoader().getResourceAsStream("templates/inorder/purchaseOrderInsertInput.yml");
        Object load = yaml.load(inputStream);
        System.out.println(load);
    }
}
