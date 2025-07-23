package co.com.seti.model.bill;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Bill {
    private Integer id;
    private Integer userId;
    private Integer planId;
    private String period;
    private BigDecimal amount;
    private LocalDate dueDate;
    private LocalDate issueDate;
    private LocalDate createdAt;
}
