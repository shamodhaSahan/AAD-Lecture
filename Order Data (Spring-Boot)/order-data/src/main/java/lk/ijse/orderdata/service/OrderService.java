package lk.ijse.orderdata.service;

import lk.ijse.orderdata.dto.CustomerOrder;
import lk.ijse.orderdata.dto.OrderDTO;

import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 2:22 PM
 */
public interface OrderService {
    OrderDTO saveOrder(OrderDTO customerDTO);
    void updateOrder(String id,OrderDTO customerDTO);
    void deleteOrder(String id);
    List<OrderDTO> getAllOrder();
    OrderDTO getOrderById(String id);
    CustomerOrder getFullProfileData();
}
