/*
package com.hjfruit.test.pitaya.app.base.supplier;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.actions.base.supplier.SupplierAction;
import com.hjfruit.test.pitaya.app.entities.base.supplier.SupplierInput;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Ignore;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
@DisplayName("供应商相关流程")
public class SupplierManagementTest extends PitayaAppBaseTestV2 {
    @Autowired
    SupplierAction supplierAction;
    @Test
    @Ignore
    @DisplayName("创建-编辑-删除")
    void create_update_delete() {
        SupplierInput supplierInput = new SupplierInput();
        supplierInput.setSupplierName(RandomStringUtils.random(10));
        supplierInput.setSupplierShortName(RandomStringUtils.random(5));
        supplierInput.setPhoneNum("13310285028");
        supplierInput.setSupplierAddress("渝航大道88888号");
        supplierInput.setSupplierTypeId(PitayaConstants.SupplierType.FRUIT.getTypeId());
        Integer supplier = supplierAction.createSupplier(supplierInput);
        supplierInput.setSupplierId(supplier);
        supplierAction.updateSupplier(supplierInput);
        supplierAction.deleteSupplier(supplier);
    }
}
*/
