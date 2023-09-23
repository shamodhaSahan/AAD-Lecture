package lk.ijse.orderdata.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 1:30 PM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
//@Entity
//@Table(schema = "orders")
public class OrderEntity {
//    @Id
//    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    private String id;
    private LocalDate date;
    private BigDecimal value;
    private String customerId;
}
