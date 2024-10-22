package com.mock_project_102024_nhom02.dto.response;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) 
public class ApartmentResponse {

    String id;

    Integer flor;

    String status;

    String numApartment;

    Integer numBedroom;

    BigDecimal square;

    BigDecimal rentPrice;

    String address;

    List<ContractLeaseResponse> contractLeases;
}