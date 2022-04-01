package com.hjfruit.test.pitaya.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;

public class BeanUtil {
    @Autowired
    Environment environment;

    public String getProperty(String key) {
        return environment.getProperty(key);
    }
}
