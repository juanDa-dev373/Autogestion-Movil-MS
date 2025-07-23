package co.com.seti.jpa.usage.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name = "usage")
@Entity
public class UsageEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "data_gb", nullable = false)
    private Double dataGb;

    @Column(nullable = false)
    private Double minutes;

    @Column(nullable = false)
    private Double sms;

    @Column(name = "last_updated")
    private LocalDate lastUpdated;
}
