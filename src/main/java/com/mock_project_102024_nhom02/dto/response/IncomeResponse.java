package com.mock_project_102024_nhom02.dto.response;

 
import lombok.*;
import lombok.experimental.FieldDefaults;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) 
public class IncomeResponse {

    
    String id;
 
    UserResponse user;
 
    ApartmentResponse apartment;
 
    String status; 

    ServiceResponse service;
 
    PaymentMethodResponse paymentMethod;
 
    String total;
 
    String paymentDeadline;
 
    TypeIncomeResponse typeIncome;
}

