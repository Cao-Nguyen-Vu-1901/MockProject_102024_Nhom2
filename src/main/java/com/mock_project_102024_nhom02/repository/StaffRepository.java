package com.mock_project_102024_nhom02.repository;

import com.mock_project_102024_nhom02.entity.Staff;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {
    boolean existsByPhone(String phone);

    Page<Staff> findAllByNameAndStatus(String name, String status, Pageable pageable);
    Page<Staff> findAllByStatus(String status, Pageable pageable);
}
