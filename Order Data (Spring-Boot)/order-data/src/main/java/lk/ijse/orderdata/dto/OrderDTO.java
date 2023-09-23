package lk.ijse.orderdata.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * Created By shamodha_s_rathnamalala
 * Date : 9/16/2023
 * Time : 1:04 PM
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class OrderDTO {
    private String id;
    private LocalDate date;
    private BigDecimal value;
    private String customerId;
}
