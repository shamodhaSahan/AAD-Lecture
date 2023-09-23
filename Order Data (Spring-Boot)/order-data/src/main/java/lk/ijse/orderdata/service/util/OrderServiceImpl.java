package lk.ijse.orderdata.service.util;

import lk.ijse.orderdata.dao.OrderDao;
import lk.ijse.orderdata.dto.CustomerOrder;
import lk.ijse.orderdata.dto.OrderDTO;
import lk.ijse.orderdata.entity.OrderEntity;
import lk.ijse.orderdata.service.OrderService;
import lk.ijse.orderdata.util.EntityDTOConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 2:22 PM
 */

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderDao orderDao;

    @Autowired
    EntityDTOConvertor convertor;

    @Override
    public OrderDTO saveOrder(OrderDTO orderDTO) {
        OrderEntity customer = orderDao.save(convertor.getOrderEntity(orderDTO));
        return convertor.getOrderDTO(customer);
    }

    @Override
    public void updateOrder(String id, OrderDTO customerDTO) {

    }

    @Override
    public void deleteOrder(String id) {
        Optional<OrderEntity> optionalOrder = orderDao.findById(id);
        if (!optionalOrder.isPresent()) throw new RuntimeException("Invalid order id..!");
        orderDao.deleteById(id);
    }

    @Override
    public List<OrderDTO> getAllOrder() {
        return StreamSupport.stream(orderDao.findAll().spliterator(), false).map(convertor::getOrderDTO).collect(Collectors.toList());
    }

    @Override
    public OrderDTO getOrderById(String id) {
        Optional<OrderEntity> optionalOrder = orderDao.findById(id);
        if (!optionalOrder.isPresent()) throw new RuntimeException("Invalid order id..!");
        return convertor.getOrderDTO(optionalOrder.get());
    }

    @Override
    public CustomerOrder getFullProfileData() {
        return null;
    }
}
