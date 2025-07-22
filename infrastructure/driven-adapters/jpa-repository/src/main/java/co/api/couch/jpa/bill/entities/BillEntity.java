package co.api.couch.jpa.bill.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "bills")
public class BillEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "user_id")
    private Integer userId;

    @JoinColumn(name = "plan_id")
    private Integer planId;

    @Column(nullable = false)
    private String period;

    @Column(nullable = false)
    private BigDecimal amount;

    @Column(name = "due_date", nullable = false)
    private LocalDate dueDate;

    @Column(name = "issue_date", nullable = false)
    private LocalDate issueDate;

    @Column(name = "created_at")
    private LocalDate createdAt;
}
