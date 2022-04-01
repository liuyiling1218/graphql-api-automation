package com.hjfruit.test.pitaya.app.actions.base.config;

import com.hjfruit.test.pitaya.app.apis.base.config.ProductionConfigApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductionConfigAction {
    @Autowired
    ProductionConfigApi productionConfigApi;


}
