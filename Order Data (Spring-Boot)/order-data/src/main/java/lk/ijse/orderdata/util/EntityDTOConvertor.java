package lk.ijse.orderdata.util;

import lk.ijse.orderdata.dto.OrderDTO;
import lk.ijse.orderdata.entity.OrderEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 2:42 PM
 */

@Component
public class EntityDTOConvertor {
    @Autowired
    ModelMapper modelMapper;

    public OrderEntity getOrderEntity(OrderDTO orderDTO) {
        return modelMapper.map(orderDTO, OrderEntity.class);
//        return new OrderEntity(orderDTO.getId(), orderDTO.getDate(), orderDTO.getValue(), orderDTO.getCustomerId());
    }

    public OrderDTO getOrderDTO(OrderEntity order) {
        return modelMapper.map(order, OrderDTO.class);
//        return new OrderDTO(customer.getId(), customer.getDate(), customer.getValue(),customer.getCustomerId());
    }
}
