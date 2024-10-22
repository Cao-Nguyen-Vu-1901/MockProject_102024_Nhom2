package com.mock_project_102024_nhom02.dto.response;
 
import lombok.*;
import lombok.experimental.FieldDefaults;
 
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) 
public class OutcomeResponse   {
 
    String id;
 
    String status;
 
    String nameService;
 
    String description;
 
    BigDecimal price;
 
    TypeOutcomeResponse typeOutcome;
 
    RepairHistoryResponse repairHistory;
}

