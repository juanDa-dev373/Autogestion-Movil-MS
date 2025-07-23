package co.com.seti.jpa.plan.entities;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "plans")
@Entity
public class PlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "data_gb", nullable = false)
    private Double dataGb;

    @Column(nullable = false)
    private Integer minutes;

    @Column(nullable = false)
    private Integer sms;

    private String description;
}
