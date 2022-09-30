package com.hjfruit.test.pitaya;

import com.hjfruit.test.pitaya.app.PitayaAppBaseTestV2;
import com.hjfruit.test.pitaya.app.apis.production.inorder.OtherInOrderApi;
import com.hjfruit.test.pitaya.app.entities.commodity.CommoditySkuPayload;
import com.hjfruit.test.pitaya.app.entities.production.inorder.CreateOtherInOrderInput;
import com.hjfruit.test.pitaya.app.entities.production.inorder.CreateOtherOrderItemInput;
import com.hjfruit.test.pitaya.app.helper.base.CommodityHelper;
import com.hjfruit.test.pitaya.app.helper.base.CustomerHelper;
import com.hjfruit.test.pitaya.app.helper.base.StoreHouseHelper;
import com.hjfruit.test.pitaya.app.helper.base.SupplierHelper;
import com.hjfruit.test.pitaya.common.PitayaConstants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;
@CucumberContextConfiguration
public class MyStepdefs extends PitayaAppBaseTestV2 {
    @Autowired
    StoreHouseHelper storeHouseHelper;
    @Autowired
    SupplierHelper supplierHelper;
    @Autowired
    CommodityHelper commodityHelper;
    @Autowired
    CustomerHelper customerHelper;
    @Autowired
    OtherInOrderApi otherInOrderApi;;
    private Integer typeId;
    private String warehouseId;
    private Integer supplierId;
    private Integer customerId;
    private List<CommoditySkuPayload> commoditySkues;
    @Given("用户成功登录星桥生产APP")
    public void 用户成功登录星桥生产app() {
    }
    @When("新增原料商品类型")
    public void 新增原料商品类型() {
        this.typeId=PitayaConstants.CommodityType.RAW_MATERIAL.getTypeId();
    }
    @When("用户只能够选择当前组织所有所属仓库，仅支持单选")
    public void 用户只能够选择当前组织所有所属仓库仅支持单选() {
    this.warehouseId=storeHouseHelper.userWarehouse_getFirstWarehouse().getWarehouseId();
    }
    @When("用户只能够选择到当前组织下供应商类型为水果和食品的供应商，仅支持单选")
    public void 用户只能够选择到当前组织下供应商类型为水果和食品的供应商仅支持单选() {
        this.supplierId= supplierHelper.supplierPages_getFirstAssitSupplier().getSupplierId();
    }
    @When("用户只能够选择到当前组织下所有层级的客户，仅支持单选")
    public void 用户只能够选择到当前组织下所有层级的客户仅支持单选() {
        this.customerId= customerHelper.getCustomer(PitayaConstants.CustomerType.DESIGNATED_CUSTOMER).getBelongId();
    }
    @When("用户可以对备注输入不大于两百字，必填")
    public void 用户可以对备注输入不大于两百字必填() {
    }
    @When("用户可以选择类型为原料的商品并提交保存")
    public void 用户可以选择类型为原料的商品并提交保存() {
        this.commoditySkues = commodityHelper.getCommoditySkues(PitayaConstants.CommodityType.RAW_MATERIAL, PitayaConstants.CommoditySkuType.DOUBLE_UNIT, 2);
    }
    @Then("提交保存成功")
    public void 提交保存成功() {
        CreateOtherInOrderInput createOtherInOrderInput = new CreateOtherInOrderInput();
        createOtherInOrderInput.setInOrderTypeId(PitayaConstants.InOrderType.OTHER_IN_APPLY.getTypeCode());
        createOtherInOrderInput.setCommodityTypeId(typeId);
        createOtherInOrderInput.setWarehouseId(warehouseId);
        createOtherInOrderInput.setSupplierId(supplierId);
        createOtherInOrderInput.setCustomerTypeId(PitayaConstants.CustomerType.NO_CUSTOMER.getCustomerTypeId());
        createOtherInOrderInput.setCustomerId(customerId);
        createOtherInOrderInput.setInOrderDescription("新增其它入库！");
        createOtherInOrderInput.setCommodities(commoditySkues.stream().map(o -> {
            CreateOtherOrderItemInput createOtherOrderItemInput = new CreateOtherOrderItemInput();
            createOtherOrderItemInput.setCommoditySkuId(o.getCommoditySkuId());
            createOtherOrderItemInput.setUnitQuantity(new BigDecimal(10.01));
            createOtherOrderItemInput.setTotalQuantity(new BigDecimal(100.22));
            createOtherOrderItemInput.setUnitPrice(new BigDecimal(20.1));
           createOtherOrderItemInput.setUnitPriceType(o.getUnitType());
           createOtherOrderItemInput.setTotalPrice(new BigDecimal(200.31));
           return createOtherOrderItemInput;
       }).collect(Collectors.toList()));
otherInOrderApi.createOtherInOrder(createOtherInOrderInput);





    }
}
