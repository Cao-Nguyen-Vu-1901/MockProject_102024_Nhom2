package com.mock_project_102024_nhom02.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) 
public class OutcomeRequest   {
 
    String id;
 
    String status;
 
    String nameService;
 
    String description;
 
    BigDecimal price;
 
    String typeOutcome;
 
    String repairHistory;
}
