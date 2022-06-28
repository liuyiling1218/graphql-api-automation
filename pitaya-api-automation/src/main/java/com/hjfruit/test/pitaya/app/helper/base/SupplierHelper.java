package com.hjfruit.test.pitaya.app.helper.base;

import com.hjfruit.test.pitaya.app.apis.base.supplier.SupplierApi;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.base.supplier.SupplierConditionInput;
import com.hjfruit.test.pitaya.app.entities.base.supplier.SupplierPagePayload;
import com.hjfruit.test.pitaya.app.entities.base.supplier.SupplierPayload;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * 供应商 数据
 */
@Component
public class SupplierHelper {
    @Autowired
    SupplierApi supplierApi;

    /**
     * 随机获取一个供应商
     *
     * @return
     */
    public SupplierPayload getRadomSupplierPagePayload() {
        SupplierConditionInput supplierConditionInput = new SupplierConditionInput();
        supplierConditionInput.setSupplierTypeId(Arrays.asList(PitayaConstants.CommodityType.FRUIT.getTypeId(), PitayaConstants.CommodityType.FRUIT.getTypeId()));
        return supplierApi.supplierPages(new Page(), supplierConditionInput).getRecords().get(0);
    }

    /**
     * 获取供应商列表
     *
     * @param page
     * @param supplierCondition
     * @return
     */
    public SupplierPagePayload supplierPages(Page page, SupplierConditionInput supplierCondition) {
        return supplierApi.supplierPages(page, supplierCondition);
    }

    /**
     * 获取 食品和水果 类别下的第一个供应商
     *
     * @return
     */
    public SupplierPayload supplierPages_getFirstFoodAndFruitSupplier() {
        return supplierPages_getFirstSupplierBySupplierTypeIds(Arrays.asList(PitayaConstants.CommodityType.FRUIT.getTypeId(), PitayaConstants.CommodityType.FOOD.getTypeId()));
    }

    /**
     * 获取 辅料 类别下的第一个供应商
     *
     * @return
     */
    public SupplierPayload supplierPages_getFirstAssitSupplier() {
        return supplierPages_getFirstSupplierBySupplierTypeIds(Arrays.asList(PitayaConstants.CommodityType.ASSIST.getTypeId()));
    }

    /**
     * 获取 yunza 类别下的第一个供应商
     *
     * @return
     */
    public SupplierPayload supplierPages_getFirstTransportSupplier() {
        return supplierPages_getFirstSupplierBySupplierTypeIds(Arrays.asList(PitayaConstants.SupplierType.TRANSPORT.getTypeId()));
    }

    /**
     * 获取具体供应商类型下的第一个供应商
     *
     * @param supplierTypeIds
     * @return
     */
    public SupplierPayload supplierPages_getFirstSupplierBySupplierTypeIds(List<Integer> supplierTypeIds) {
        SupplierConditionInput supplierConditionInput = new SupplierConditionInput();
        supplierConditionInput.setSupplierTypeId(supplierTypeIds);
        SupplierPagePayload supplierPagePayload = supplierPages(new Page(1, 10), supplierConditionInput);
        return supplierPagePayload.getRecords().get(0);
    }

}
