package lk.ijse.spring.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class Order {
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    private String saveOrderWithJSON(){
        return "json order saved..!";
    }
    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    private String saveOrderWIthXML(){
        return "xml order saved..!";
    }
}
