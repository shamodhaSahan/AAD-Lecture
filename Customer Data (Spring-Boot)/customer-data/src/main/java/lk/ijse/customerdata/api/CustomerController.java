package lk.ijse.customerdata.api;

import lk.ijse.customerdata.dto.CustomerDTO;
import lk.ijse.customerdata.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 2:23 PM
 */

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    ResponseEntity<CustomerDTO> saveCustomer(
            @RequestParam String name,
            @RequestParam String city,
            @RequestParam String email
    ) {
        if (name == null || !name.matches("^[A-z ]{3,30}$"))
            throw new RuntimeException("Invalid name..!");
        if (city == null)
            throw new RuntimeException("Invalid name..!");
        if (email == null || !email.matches("^[\\w!#$%&'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$"))
            throw new RuntimeException("Invalid email..!");
        return new ResponseEntity<>(customerService.saveCustomer(CustomerDTO.builder()
                .name(name)
                .city(city)
                .email(email)
                .build()
        ), HttpStatus.OK);
    }

    @PutMapping("{id}")
    ResponseEntity<String> updateCustomer(@PathVariable String id,@RequestBody CustomerDTO customerDTO){
        customerService.updateCustomer(id,customerDTO);
        return new ResponseEntity<>("Customer updated..!",HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    ResponseEntity<String> deleteCustomer(@PathVariable String id){
        customerService.deleteCustomer(id);
        return new ResponseEntity<>("Customer deleted..!",HttpStatus.OK);
    }

    @GetMapping("{id}")
    ResponseEntity<CustomerDTO> getCustomerById(@PathVariable String id){
        return new ResponseEntity<>(customerService.getCustomerById(id),HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<CustomerDTO>> getAllCustomer(){
        return new ResponseEntity<>(customerService.getAllCustomer(),HttpStatus.OK);
    }
}
