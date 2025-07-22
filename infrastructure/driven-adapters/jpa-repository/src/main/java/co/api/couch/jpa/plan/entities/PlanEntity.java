package co.api.couch.jpa.plan.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "plans")
public class PlanEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private BigDecimal price;

    @Column(name = "data_gb", nullable = false)
    private Integer dataGb;

    @Column(nullable = false)
    private Integer minutes;

    @Column(nullable = false)
    private Integer sms;

    private String description;
}
