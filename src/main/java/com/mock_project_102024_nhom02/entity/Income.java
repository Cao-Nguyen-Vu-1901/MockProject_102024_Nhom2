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
@Table(name = "income_")
public class Income implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_")
    String id;

    @ManyToOne
    @JoinColumn(name = "id_user_")
    User user;

    @ManyToOne
    @JoinColumn(name = "id_apartment_")
    Apartment apartment;

    @Column(name = "status_")
    String status;

    @ManyToOne
    @JoinColumn(name = "id_service_")
    Service service;

    @ManyToOne
    @JoinColumn(name = "id_payment_method_")
    PaymentMethod paymentMethod;

    @Column(name = "total_")
    BigDecimal total;

    @Column(name = "payment_deadline_")
    String paymentDeadline;

    @ManyToOne
    @JoinColumn(name = "id_type_income_")
    TypeIncome typeIncome;
}

