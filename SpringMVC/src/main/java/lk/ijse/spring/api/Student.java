package lk.ijse.spring.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 7/29/2023
 * Time : 12:58 PM
 */

@RestController
@RequestMapping("/student")
public class Student {
    @GetMapping("/student/{id}*")
    private String getAllStudent(@PathVariable String id){
        System.out.println("get all student id :"+id);
        return "get all student id :"+id;
    }
    @GetMapping("/student/{id:S\\d{3}}")
    private String getStudentWithParams(@PathVariable String id){
        System.out.println("get student id :"+id);
        return "get student id :"+id;
    }
    @GetMapping(headers = "X-id")
    private String getStudentWithHeaders(@RequestHeader("X-id") String token){
        System.out.println("get student id :"+token);
        return "get student id :"+token;
    }
    @GetMapping(value = "/code", headers = "X-id")
    private String getStudentWithHeadersAndValue(@RequestHeader("X-id") String id, @RequestParam String code){
        System.out.println("get student id :"+id+code);
        return "get student id :"+id+code;
    }
    @GetMapping
    private String getStudentWithHeaders(){
        System.out.println("get student id :");
        return "get student empty";
    }
}
