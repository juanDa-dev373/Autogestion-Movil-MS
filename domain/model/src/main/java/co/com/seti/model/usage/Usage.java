package co.com.seti.model.usage;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Usage {
    private Long id;
    private Long userId;
    private Double dataGb;
    private Integer minutes;
    private Integer sms;
    private LocalDate lastUpdated;
}
