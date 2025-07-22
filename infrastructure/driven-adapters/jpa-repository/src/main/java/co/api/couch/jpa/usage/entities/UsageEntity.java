package co.api.couch.jpa.usage.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "usage")
public class UsageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @JoinColumn(name = "user_id")
    private Integer userId;

    @Column(name = "data_gb", nullable = false)
    private Integer dataGb;

    @Column(nullable = false)
    private Integer minutes;

    @Column(nullable = false)
    private Integer sms;

    @Column(name = "last_updated")
    private LocalDate lastUpdated;
}
