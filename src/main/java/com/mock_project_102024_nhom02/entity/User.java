package com.mock_project_102024_nhom02.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.io.Serializable;
import java.time.LocalDate;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "user_")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_")
    String id;

    @Column(name = "name_")
    String name;

    @Column(name = "email_")
    String email;

    @Column(name = "phone_")
    String phone;

    @Column(name = "gender_")
    String gender;

    @Column(name = "ssn_")
    String ssn;

    @Column(name = "status_")
    String status;

    @Column(name = "password_")
    String password;

    @Column(name = "debt_")
    String debt;

    @Column(name = "total_payment_")
    String total_payment;

}
