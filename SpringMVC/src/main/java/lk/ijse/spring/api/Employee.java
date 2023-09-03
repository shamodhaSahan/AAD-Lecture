package lk.ijse.spring.api;

import lk.ijse.spring.dto.EmployeeDTO;
import lk.ijse.spring.dto.EmployeeUpdateDTO;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Map;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/19/2023
 * Time : 10:50 AM
 */

@RestController
@RequestMapping("/api/v1/employee")
public class Employee {
    @GetMapping(params = {"id", "name"})
    public String getEmployee(String id, String name, @RequestParam MultiValueMap<String, String> map, EmployeeDTO employeeDTO) {
        System.out.println(map);
        return String.format("EmpDetails(%s,%s)", id, name);
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public String getMultiTypeData(String id, String country, String city, @RequestParam("towns") String[] towns, @RequestParam Map<String, String> data) {
        printValues(id, city, country, towns);
        System.out.println("map " + data);
        return "Saved";
    }

    private void printValues(String id, String city, String country, String[] towns) {
        System.out.println(id);
        System.out.println(city);
        System.out.println(country);
        System.out.println(Arrays.toString(towns));
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    private String JSONDataExtractOne(@RequestBody EmployeeUpdateDTO employeeUpdateDTO) {
        System.out.println(employeeUpdateDTO.getId());
        System.out.println(employeeUpdateDTO.getName());
        return "updated";
    }
}
