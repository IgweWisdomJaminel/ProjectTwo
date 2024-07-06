package com.hngtask.hng.repository;

import com.hngtask.hng.model.Organization;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrganizationRepository extends JpaRepository<Organization, Long> {
    
}
