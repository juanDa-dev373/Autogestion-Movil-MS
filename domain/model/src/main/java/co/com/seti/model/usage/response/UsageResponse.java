package co.com.seti.model.usage.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UsageResponse {
    private Long userId;
    private Double dataUsedGb;
    private Double dataTotalGb;
    private Integer minutesUsed;
    private Integer minutesTotal;
    private Integer smsUsed;
    private Integer smsTotal;
}
