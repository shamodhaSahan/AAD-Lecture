package lk.ijse.customerdata.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 1:04 PM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CustomerDTO {
    private String id;
    private String name;
    private String city;
    private String email;
}
