package co.api.couch.model.usage;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class Usage {
    private Integer id;
    private Integer userId;
    private Integer dataGb;
    private Integer minutes;
    private Integer sms;
    private LocalDate lastUpdated;
}
