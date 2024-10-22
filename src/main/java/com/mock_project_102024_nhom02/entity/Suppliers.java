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
@Table(name = "suppliers_")
public class Suppliers implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_")
    String id;

    @Column(name = "name_")
    String name;

    @Column(name = "phone_")
    String phone;

    @Column(name = "address_")
    String address;

    @OneToMany(mappedBy = "suppliers", cascade = CascadeType.ALL)
    List<ContractLease> contractLeases;

    @OneToMany(mappedBy = "suppliers", cascade = CascadeType.ALL)
    List<ContractService> contractServices;

    @OneToMany(mappedBy = "suppliers", cascade = CascadeType.ALL)
    List<UtilityContract> utilityContracts;
}

