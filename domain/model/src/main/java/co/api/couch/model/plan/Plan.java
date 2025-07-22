package co.api.couch.model.plan;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class Plan {
    private Integer id;
    private String name;
    private BigDecimal price;
    private Integer dataGb;
    private Integer minutes;
    private Integer sms;
    private String description;
}
