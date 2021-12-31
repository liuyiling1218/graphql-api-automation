package com.hjfruit.test.pitaya.app.purchase;

import com.hjfruit.test.pitaya.actions.production.inorder.InOrderAuditAction;
import com.hjfruit.test.pitaya.actions.production.inorder.OtherInOrderAction;
import com.hjfruit.test.pitaya.app.PitayaAppBaseTest;
import com.hjfruit.test.pitaya.entities.production.inorder.*;
import com.hjfruit.test.pitaya.utils.YamlUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class OtherInOrderTest extends PitayaAppBaseTest {
@Autowired
InOrderAuditAction inOrderAuditAction;
@Autowired
OtherInOrderAction otherInOrderAction;
@Autowired
@Qualifier("pitaya")
JdbcTemplate jdbcTemplate;


    @DisplayName("其他入库（原料）-提交库管-入库流程")
@Test
void creat_raw_material_OtherInOrder(){
        //新增其他原料订单
    String id= otherInOrderAction.createOtherInOrder(YamlUtil.loadAs(CreateOtherInOrderInput.class));
        //提交库管审核
    String inOrderId =otherInOrderAction.submitOtherInOrder(id);
       //获取itemid
    InOrderDetailInput inOrderDetailInput =new InOrderDetailInput();
    inOrderDetailInput.setInOrderId(inOrderId);
    inOrderDetailInput.setDataType(10);
    AuditInOrderPayload auditDetail = inOrderAuditAction.getAuditDetail(inOrderDetailInput);
    List<AuditInOrderItemPayload> commodities = auditDetail.getCommodities();
    String inOrderItemId = commodities.get(0).getInOrderItemId();
    String inOrderItemId1= commodities.get(1).getInOrderItemId();
    ConfirmInput confirmInput = YamlUtil.loadAs(ConfirmInput.class);
    confirmInput.setInOrderId(inOrderId);
    List<ConfirmItemInput> items = confirmInput.getItems();
    items.get(0).setInOrderItemId(inOrderItemId);
    items.get(1).setInOrderItemId(inOrderItemId1);
    inOrderAuditAction.confirmInbound(confirmInput);
}
@DisplayName("其他入库（辅料）-提交库管-入库流程")
@Test
void creat_Accessories_OtherInOrder(){
    String id= otherInOrderAction.createOtherInOrder(YamlUtil.loadAs(CreateOtherInOrderInput.class));
    String inOrderId =otherInOrderAction.submitOtherInOrder(id);

    String sql="select in_order_item_id from production_in_order_item where in_order_id=?";
    Integer integer = jdbcTemplate.queryForObject(sql, Integer.class, inOrderId);

    InOrderDetailInput inOrderDetailInput =new InOrderDetailInput();
    inOrderDetailInput.setInOrderId(inOrderId);
    inOrderDetailInput.setDataType(10);
    AuditInOrderPayload auditDetail = inOrderAuditAction.getAuditDetail(inOrderDetailInput);
    List<AuditInOrderItemPayload> commodities = auditDetail.getCommodities();
    String inOrderItemId = commodities.get(0).getInOrderItemId();
    String inOrderItemId1= commodities.get(1).getInOrderItemId();
    ConfirmInput confirmInput = YamlUtil.loadAs(ConfirmInput.class);
    confirmInput.setInOrderId(inOrderId);
    List<ConfirmItemInput> items = confirmInput.getItems();
    items.get(0).setInOrderItemId(inOrderItemId);
    items.get(1).setInOrderItemId(inOrderItemId1);
    inOrderAuditAction.confirmInbound(confirmInput);
}






}
