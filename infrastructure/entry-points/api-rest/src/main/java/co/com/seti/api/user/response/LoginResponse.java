package co.com.seti.api.user.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class LoginResponse {
    String token;
}
