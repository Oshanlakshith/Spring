package lk.ijse.spring.service;

import lk.ijse.spring.dto.OrderDTO;

import java.util.List;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public interface PurchaseOrderService {
    void purchaseOrder(OrderDTO dto);
    void deleteOrder(String oid);
    void updateOrder(OrderDTO dto);
    OrderDTO searchOrder(String oid);
    List<OrderDTO> getAllOrders();
}
