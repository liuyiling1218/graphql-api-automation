package com.hjfruit.test.pitaya.app.actions.base.supplier;

import com.hjfruit.test.pitaya.app.apis.base.supplier.SupplierApi;
import com.hjfruit.test.pitaya.app.entities.Page;
import com.hjfruit.test.pitaya.app.entities.base.supplier.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 供应商相关操作
 */
@Component
public class SupplierAction {
    @Autowired
    SupplierApi supplierApi;

    /**
     * 【分页】获取供应商列表
     *
     * @param page
     * @param supplierCondition
     * @return
     */
    public SupplierPagePayload supplierPages(Page page, SupplierConditionInput supplierCondition) {
        return supplierApi.supplierPages(page, supplierCondition);
    }

    /**
     * 获取供应商详情
     *
     * @param supplierId
     * @return
     */
    public SupplierPayload supplier(GetSupplierInput getSupplierInput) {
        return supplierApi.supplier(getSupplierInput);
    }

    /**
     * 获取供应商列表
     *
     * @param supplierCondition
     * @return
     */
    public List<SupplierPayload> suppliers(SupplierConditionInput supplierCondition) {
        return supplierApi.suppliers(supplierCondition);
    }

    /**
     * 创建供应商
     *
     * @param supplierInput
     * @return
     */
    public Integer createSupplier(SupplierInput supplierInput) {
        Integer supplierId = supplierApi.createSupplier(supplierInput);

        return supplierId;
    }

    /**
     * 更新供应商
     *
     * @param supplierInput
     * @return
     */
    public Integer updateSupplier(SupplierInput supplierInput) {
        Integer updateSupplier = supplierApi.updateSupplier(supplierInput);
        return updateSupplier;
    }

    /**
     * 删除供应商
     *
     * @param supplierId
     * @return
     */
    public Integer deleteSupplier(Integer supplierId) {
        Integer isDeleted = supplierApi.deleteSupplier(supplierId);
        return isDeleted;
    }

}
