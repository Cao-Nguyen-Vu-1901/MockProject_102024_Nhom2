package com.mock_project_102024_nhom02.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "staff_")
public class Staff implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_")
    String id;

    @Column(name = "name_")
    String name;

    @Column(name = "phone_")
    String phone;

    @Column(name = "gender_")
    String gender;

    @Column(name = "start_day_")
    String startDay;

    @Column(name = "end_day_")
    String endDay;

    @Column(name = "status_")
    String status;

    @Column(name = "password_")
    String password;

    @ManyToOne
    @JoinColumn(name = "id_role_")
    Role role;

}
