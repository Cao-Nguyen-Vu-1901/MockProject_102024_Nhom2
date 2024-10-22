package com.mock_project_102024_nhom02.controller;

import com.mock_project_102024_nhom02.dto.request.StaffRequest;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import com.mock_project_102024_nhom02.dto.response.ApiResponse;
import com.mock_project_102024_nhom02.dto.response.StaffResponse;
import com.mock_project_102024_nhom02.service.StaffService;

@RestController
@RequestMapping("${api.prefix}"+"/staff")
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class StaffController {

    StaffService staffService;

//    @GetMapping()
//    public ResponseEntity<ApiResponse> getAllStaff() {
//        return ResponseEntity
//                .status(HttpStatus.OK.value())
//                .body(ApiResponse.<List<StaffResponse>>builder()
//                        .description("This is the data of the staff.")
//                        .result(staffService.getAllStaff())
//                        .build());
//    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse> getStaffById(@PathVariable("id") String id) {
        return ResponseEntity
                .status(HttpStatus.OK.value())
                .body(ApiResponse.<StaffResponse>builder()
                        .description("This is the data of the staff.")
                        .result(staffService.getStaffById(id))
                        .build());
    }

    @PostMapping
    public ResponseEntity<ApiResponse> addStaff(@RequestBody StaffRequest staffRequest) {
        return ResponseEntity
                .status(HttpStatus.CREATED.value())
                .body(ApiResponse.<StaffResponse>builder()
                        .description("This is the data of the staff.")
                        .result(staffService.addStaff(staffRequest))
                        .build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse> updateStaff( @PathVariable("id") String id,
                                                   @RequestBody StaffRequest staffRequest) {
        return ResponseEntity
                .status(HttpStatus.CREATED.value())
                .body(ApiResponse.<StaffResponse>builder()
                        .description("This is the data of the staff.")
                        .result(staffService.updateStaff(staffRequest,id))
                        .build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> addStaff(@PathVariable("id") String id) {
        staffService.deleteStaff(id);
        return ResponseEntity
                .status(HttpStatus.OK.value())
                .body(ApiResponse.<List<StaffResponse>>builder()
                        .message("Delete success")
                        .build());
    }

}
