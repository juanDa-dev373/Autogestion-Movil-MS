package co.com.seti.model.user;

import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class User {
    private Long id;
    private String accountNumber;
    private String numberId;
    private String phoneNumber;
    private String name;
    private String email;
    private String password;
    private Boolean active;
    private Long planId;
    private LocalDate createdAt;
}
