package co.com.seti.model.plan;


import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Plan {
    private Integer id;
    private String name;
    private BigDecimal price;
    private Double dataGb;
    private Integer minutes;
    private Integer sms;
    private String description;
}
