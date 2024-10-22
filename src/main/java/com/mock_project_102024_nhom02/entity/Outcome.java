package com.mock_project_102024_nhom02.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "outcome_")
public class Outcome implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_")
    String id;

    @Column(name = "status_")
    String status;

    @Column(name = "name_service_")
    String nameService;

    @Column(name = "deription_")
    String description;

    @Column(name = "price_")
    BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "id_type_outcome_")
    TypeOutcome typeOutcome;

    @ManyToOne
    @JoinColumn(name = "id_repair_history_")
    RepairHistory repairHistory;
}

