package com.mock_project_102024_nhom02.repository;

import com.mock_project_102024_nhom02.entity.ContractLease;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractLeaseRepository extends JpaRepository<ContractLease, String> {
}
