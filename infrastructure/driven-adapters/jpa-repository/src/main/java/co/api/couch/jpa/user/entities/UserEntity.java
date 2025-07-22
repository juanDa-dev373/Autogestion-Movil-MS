package co.api.couch.jpa.user.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "account_number", nullable = false)
    private String accountNumber;

    @Column(name = "number_id", nullable = false, unique = true)
    private String numberId;

    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @JoinColumn(name = "plan_id")
    private Integer planId;

    @Column(name = "created_at")
    private LocalDate createdAt;
}
