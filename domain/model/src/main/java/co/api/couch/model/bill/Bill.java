package co.api.couch.model.bill;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;


@Getter
@Setter
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
