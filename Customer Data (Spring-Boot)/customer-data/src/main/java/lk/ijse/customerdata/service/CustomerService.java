package lk.ijse.customerdata.service;

import lk.ijse.customerdata.dto.CustomerDTO;

import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 2:22 PM
 */
public interface CustomerService {
    CustomerDTO saveCustomer(CustomerDTO customerDTO);
    void updateCustomer(String id,CustomerDTO customerDTO);
    void deleteCustomer(String id);
    List<CustomerDTO> getAllCustomer();
    CustomerDTO getCustomerById(String id);
}
