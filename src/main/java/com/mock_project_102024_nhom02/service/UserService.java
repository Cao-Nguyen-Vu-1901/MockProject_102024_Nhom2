package com.mock_project_102024_nhom02.service;

import org.springframework.data.domain.Page;

import com.mock_project_102024_nhom02.dto.request.UserRequest;
import com.mock_project_102024_nhom02.dto.response.UserResponse;


public interface UserService {
    UserResponse getUserById(String id);
    UserResponse getUserByEmail(String email);
    UserResponse getUserByUsername(String username);
    Page<UserResponse> getAllUsers(String searchValue, String status, int currentPage, int pageSize);
    UserResponse updateUser(UserRequest userRequest, String id);
    UserResponse addUser(UserRequest userRequest);
    void deleteUserById(String id);

}
