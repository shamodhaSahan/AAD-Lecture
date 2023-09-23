package lk.ijse.customerdata.util;

import lk.ijse.customerdata.dto.CustomerDTO;
import lk.ijse.customerdata.entity.CustomerEntity;
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
    public CustomerEntity getCustomerEntity(CustomerDTO customerDTO) {
        return modelMapper.map(customerDTO,CustomerEntity.class);
//        return new CustomerEntity(customerDTO.getId(), customerDTO.getName(), customerDTO.getCity(), customerDTO.getEmail());
    }
    public CustomerDTO getCustomerDTO(CustomerEntity customer){
        return modelMapper.map(customer, CustomerDTO.class);
//        return new CustomerDTO(customer.getId(), customer.getName(), customer.getCity(),customer.getEmail());
    }
}
