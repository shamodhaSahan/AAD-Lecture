package lk.ijse.spring.api;

import lk.ijse.spring.dto.JsonData;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("jsonhandle")
public class JSONHandler {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<JsonData> getJsonData(){
        return new ResponseEntity<>(new JsonData("J001", "Shamodha", "kurunegela"), HttpStatus.CREATED);
    }
}
