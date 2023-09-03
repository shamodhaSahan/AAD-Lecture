package lk.ijse.spring.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/item")
public class Item {
    @GetMapping(value = "/code", headers = "X-id")
    private String getItemWithHeadersAndValue(@RequestHeader("X-id") String id, String code){
        System.out.println("get item id : "+id+" code : "+code);
        return "get item id : "+id+" code : "+code;
    }
}
