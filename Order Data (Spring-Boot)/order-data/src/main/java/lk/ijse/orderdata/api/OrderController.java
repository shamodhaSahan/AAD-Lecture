package lk.ijse.orderdata.api;

import lk.ijse.orderdata.dto.CustomerOrder;
import lk.ijse.orderdata.dto.OrderDTO;
import lk.ijse.orderdata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 2:23 PM
 */

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping
    ResponseEntity<OrderDTO> saveOrder(
            @RequestParam LocalDate date,
            @RequestParam BigDecimal value,
            @RequestParam String customerId
    ) {
        if (date == null)
            throw new RuntimeException("Invalid date..!");

        return new ResponseEntity<>(orderService.saveOrder(OrderDTO.builder()
                .date(date)
                .value(value)
                .build()
        ), HttpStatus.OK);
    }

    @PutMapping("{id}")
    ResponseEntity<String> updateOrder(@PathVariable String id, @RequestBody OrderDTO orderDTO) {
        orderService.updateOrder(id, orderDTO);
        return new ResponseEntity<>("Order updated..!", HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    ResponseEntity<String> deleteOrder(@PathVariable String id) {
        orderService.deleteOrder(id);
        return new ResponseEntity<>("Order deleted..!", HttpStatus.OK);
    }

    @GetMapping("{id}")
    ResponseEntity<OrderDTO> getOrderById(@PathVariable String id) {
        return new ResponseEntity<>(orderService.getOrderById(id), HttpStatus.OK);
    }

    @GetMapping
    ResponseEntity<List<OrderDTO>> getAllOrder() {
        return new ResponseEntity<>(orderService.getAllOrder(), HttpStatus.OK);
    }

    @GetMapping
    private void get(@RequestParam String id){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getForObject("http://localhost:8082/pos/api/v1/customer?id="+id, CustomerOrder.class);
    }
}
