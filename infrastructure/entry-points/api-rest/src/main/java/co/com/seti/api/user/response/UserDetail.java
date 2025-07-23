package co.com.seti.api.user.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserDetail {

    private Long id;
    private String accountNumber;
    private String numberId;
    private String phoneNumber;
    private String name;
    private String email;
}
