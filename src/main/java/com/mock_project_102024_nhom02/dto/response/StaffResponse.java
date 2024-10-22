package com.mock_project_102024_nhom02.dto.response;
 
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) 
public class StaffResponse {
  
    String id;
 
    String name;
 
    String phone;
 
    String gender;
 
    String status;

    RoleResponse role;

}
