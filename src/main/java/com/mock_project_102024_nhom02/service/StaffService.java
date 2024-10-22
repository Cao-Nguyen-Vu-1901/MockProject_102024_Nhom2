package com.mock_project_102024_nhom02.service;

import org.springframework.data.domain.Page;

import com.mock_project_102024_nhom02.dto.request.StaffRequest;
import com.mock_project_102024_nhom02.dto.response.StaffResponse;


public interface StaffService {
    StaffResponse getStaffById(String staffId);
    Page<StaffResponse> getAllStaff(String searchValue, String status, int currentPage, int pageSize);
    StaffResponse addStaff(StaffRequest staffRequest);
    StaffResponse updateStaff(StaffRequest staffRequest, String id);
    void deleteStaff(String staffId);
}
