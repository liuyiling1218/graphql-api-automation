package com.hjfruit.test.pitaya.app.actions.v2.api;

import com.hjfruit.test.pitaya.app.apis.v2.api.BaseApi;
import com.hjfruit.test.pitaya.app.entities.v2.types.FreightType;
import com.hjfruit.test.pitaya.app.entities.v2.types.PayMode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BaseAction {
    @Autowired
    BaseApi baseApi;

    /**
     * 付款类型
     *
     * @return
     */
    public List<PayMode> payModes() {
        return baseApi.payModes();
    }

    /**
     * 费用类型
     *
     * @return
     */
    public List<FreightType> freightTypes() {
        return baseApi.freightTypes();
    }


}