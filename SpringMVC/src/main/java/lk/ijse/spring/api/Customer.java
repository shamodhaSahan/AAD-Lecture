package lk.ijse.spring.api;

import org.springframework.web.bind.annotation.*;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 7/29/2023
 * Time : 12:58 PM
 */

@RestController
@RequestMapping("/customer/**")
//@CrossOrigin // this will handle all the cross policy errors
public class Customer {
//    http://localhost:8080/store/customer
    @GetMapping // get method
    private String getCustomer(){
        return "all customers ";
    }
    @PostMapping// post method
    private String saveCustomer(){
        System.out.println("customer saved..!");
        return "save customer";
    }

//++++++++++++++++++ mapping with ambiguous ++++++++++++++++++++++++++++++++++++
//    get path segment value (like get path info)
//    path - "url/customer"
//    path segment - "C001"
//    http://localhost:8080/store/customer/C001 (C001 - path variable value)
//    @PostMapping(path = "/{id}")
//    private String saveCustomer(@PathVariable("id") String id){
//        System.out.println(id+" : customer saved..!");
//        return id+" : save customer";
//    }


//++++++++++++++++++ mapping with query parameter ++++++++++++++++++++++++++++++++++++
//    get query string value (like req.getParameter("id"))
//    http://localhost:8080/store/customer?id=C001&name=shamodha
//    @PostMapping(params = {"id","name"})
//    private String saveCustomer(@RequestParam("id") String idValue, String name){
//    (@RequestParam - optional, use for params name and variable name are not same)
//        System.out.println(idValue +" - "+name+" : customer saved..!");
//        return idValue +" - "+name+" : save customer";
//    }

//    req have two types
//      01. headers - metadata
//      02. body - content (formats, JSON, Query String, x-www-form-url-encode(form data))

//++++++++++++++++++ mapping with consume types (request type for request) ++++++++++++++++++++++++++++++++++++
//    using req metadata
//    if req have Content-Type header (with value of application/json )
//    it send with request
//    @PostMapping(consumes = "application/json")
//    or
//    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE})
//    private String saveCustomer(){
//        System.out.println(" : customer saved..!");
//        return " : save customer";
//    }

//++++++++++++++++++ mapping with produce types (response type for request) ++++++++++++++++++++++++++++++++++++
//    using res metadata
//    if req have Accepted header (with value of application/json )
//    it send with request
//    @PostMapping(produces = "application/json")
//    or
//    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
//    private String saveCustomer(){
//        System.out.println(" : customer saved..!");
//        return " : save customer";
//    }

//==========================================================
// Content-Type header with value of application/json
// and
// Accept header with value of application/json

//    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE},produces = {MediaType.APPLICATION_JSON_VALUE})
//    private String saveCustomer(){
//        System.out.println(" : customer saved..!");
//        return " : save customer";
//    }
//    or
//    @PostMapping(headers = {"Content-Type=application/json","Accept=application/json"})
//    private String saveCustomer(){
//        System.out.println(" : customer saved..!");
//        return " : save customer";
//    }
//==========================================================


//================== Get data from request ========================================

//++++++++++++++++++ query string or x-www(form data) req ++++++++++++++++++++++++++++++++++++

//    this is not spring don't use
//    @PostMapping
//    private String saveCustomer(HttpServletRequest request){
//        System.out.println(request.getParameter("id"));
//        return " : save customer";
//    }

//    this is spring
//    @PostMapping
//    private String saveCustomer(String id, String name, String age){
//        System.out.println(id+" "+name+" "+age);
//        return " : save customer";
//    }

//    map to class
//    @PostMapping
//    private CustomerDTO saveCustomer(@ModelAttribute CustomerDTO customerDTO){
////        @ModelAttribute - (optional-It works fine whether it is or not) use for help to map
//        System.out.println(customerDTO.toString());
//        return customerDTO;
//    }

//    @GetMapping
//      query params - work
//      form data - not work

//    @PostMapping
//      query params - work
//      form data - work

//    @PutMapping
//      query params work
//      form data - not work

//    @DeleteMapping
//      query params work
//      form data - not work

//    query params can send to all mapping method
//    JSON data (or complex data) can send to all mapping method

//++++++++++++++++++ JSON req ++++++++++++++++++++++++++++++++++++
//    need library for this
//      01. Jackson - this time using lib (jackson-databind mvn repository)
//      02. GSON
//      03. JSON Processing JavaEE
//    @PostMapping
//    private CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
//        System.out.println(customerDTO.toString());
//        return customerDTO;
//    }
//    send res as JSON
//==========================================================

//++++++++++++++++++ Send JSON Array res ++++++++++++++++++++++++++++++++++++
//    using Jackson lib
//    @GetMapping
//    private List<CustomerDTO> getAllCustomer(){
//        List<CustomerDTO> customerDTOS = new ArrayList<>();
//        customerDTOS.add(new CustomerDTO("C001", "Shamodha", "23"));
//        customerDTOS.add(new CustomerDTO("C002", "kamal", "40"));
//        customerDTOS.add(new CustomerDTO("C003", "amal", "25"));
//        customerDTOS.add(new CustomerDTO("C004", "nimal", "64"));
//        customerDTOS.add(new CustomerDTO("C005", "sunimal", "24"));
//        return customerDTOS;
//    }
}
