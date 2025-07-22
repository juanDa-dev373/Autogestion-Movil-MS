package co.api.couch.model.user;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
public class User {
    private Integer id;
    private String accountNumber;
    private String numberId;
    private String phoneNumber;
    private String name;
    private String email;
    private Integer planId;
    private LocalDate createdAt;
}
