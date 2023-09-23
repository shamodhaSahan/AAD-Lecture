package lk.ijse.customerdata.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 1:30 PM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(schema = "customer")
public class CustomerEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private String city;
    private String email;
}
