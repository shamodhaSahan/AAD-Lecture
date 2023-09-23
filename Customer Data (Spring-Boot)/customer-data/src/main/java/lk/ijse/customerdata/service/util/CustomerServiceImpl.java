package lk.ijse.customerdata.service.util;

import lk.ijse.customerdata.dao.CustomerDao;
import lk.ijse.customerdata.dto.CustomerDTO;
import lk.ijse.customerdata.entity.CustomerEntity;
import lk.ijse.customerdata.service.CustomerService;
import lk.ijse.customerdata.util.EntityDTOConvertor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 2:22 PM
 */

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerDao customerDao;

    @Autowired
    EntityDTOConvertor convertor;

    @Override
    public CustomerDTO saveCustomer(CustomerDTO customerDTO) {
        CustomerEntity customer = customerDao.save(convertor.getCustomerEntity(customerDTO));
        return convertor.getCustomerDTO(customer);
    }

    @Override
    public void updateCustomer(String id, CustomerDTO customerDTO) {

    }

    @Override
    public void deleteCustomer(String id) {
        Optional<CustomerEntity> optionalCustomer = customerDao.findById(id);
        if (!optionalCustomer.isPresent())
            throw new RuntimeException("Invalid customer id..!");
        customerDao.deleteById(id);
    }

    @Override
    public List<CustomerDTO> getAllCustomer() {
        return customerDao.findAll().stream().map(customer -> convertor.getCustomerDTO(customer)).collect(Collectors.toList());
    }

    @Override
    public CustomerDTO getCustomerById(String id) {
        Optional<CustomerEntity> optionalCustomer = customerDao.findById(id);
        if (!optionalCustomer.isPresent())
            throw new RuntimeException("Invalid customer id..!");
        return convertor.getCustomerDTO(optionalCustomer.get());
    }
}
