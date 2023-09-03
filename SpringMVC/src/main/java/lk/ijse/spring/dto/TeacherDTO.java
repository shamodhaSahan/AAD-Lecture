package lk.ijse.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 8/19/2023
 * Time : 12:38 PM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class TeacherDTO implements Serializable {
    private String id;
    private String name;
    private String city;
    private byte[] profile;
}
