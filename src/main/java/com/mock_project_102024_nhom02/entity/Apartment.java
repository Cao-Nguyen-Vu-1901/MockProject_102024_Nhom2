package com.mock_project_102024_nhom02.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "apartment_")
public class Apartment implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_")
    String id;

    @Column(name = "flor_")
    Integer flor;

    @Column(name = "status_")
    String status;

    @Column(name = "num_apartment_")
    String numApartment;

    @Column(name = "num_bedroom_")
    Integer numBedroom;

    @Column(name = "square_")
    BigDecimal square;

    @Column(name = "rent_price_")
    BigDecimal rentPrice;

    @Column(name = "address_")
    String address;

    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    List<RentalRequest> rentalRequest;

    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    List<ContractLease> contractLeases;

    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    List<MaintenanceRepair> maintenanceRepair;

    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    List<Complaints> complaints;

    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    List<ScheduleAHomeInspection> sheScheduleAHomeInspections;

    @OneToMany(mappedBy = "apartment", cascade = CascadeType.ALL)
    List<Income> incomes;
}
