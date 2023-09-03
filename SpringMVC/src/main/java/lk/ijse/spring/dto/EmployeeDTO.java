package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/19/2023
 * Time : 11:40 AM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EmployeeDTO {
    List<String> id;
    List<String> name;
}
