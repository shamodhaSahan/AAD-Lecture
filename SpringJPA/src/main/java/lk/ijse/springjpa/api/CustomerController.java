package lk.ijse.springjpa.api;

import lk.ijse.springjpa.dto.CustomerDTO;
import lk.ijse.springjpa.entity.Customer;
import lk.ijse.springjpa.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/2/2023
 * Time : 11:35 PM
 */

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerRepo customerRepo;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping(params = "id")
    public ResponseEntity<CustomerDTO> searchCustomerById(String id){
        return new ResponseEntity<>(modelMapper.map(customerRepo.findById(id), CustomerDTO.class), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<CustomerDTO>> getAllCustomers(){
        return new ResponseEntity<>(modelMapper.map(customerRepo.findAll(), new TypeToken<List<CustomerDTO>>(){}.getType()), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDTO> saveCustomer(@RequestBody CustomerDTO customerDTO){
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));
        return new ResponseEntity<>(customerDTO, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<CustomerDTO> updateCustomer(@RequestBody CustomerDTO customerDTO){
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));
        return new ResponseEntity<>(customerDTO, HttpStatus.OK);
    }

    @DeleteMapping(params = "id")
    public ResponseEntity<String> deleteCustomer(String id){
        customerRepo.deleteById(id);
        return new ResponseEntity<>(id+" Customer Deleted..!", HttpStatus.OK);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteCustomer(@RequestBody CustomerDTO customerDTO){
        customerRepo.deleteById(customerDTO.getId());
        return new ResponseEntity<>(customerDTO.getId()+" Customer Deleted..!", HttpStatus.OK);
    }
}
