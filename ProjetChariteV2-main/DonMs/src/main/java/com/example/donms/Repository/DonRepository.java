package com.example.donms.Repository;

import com.example.donms.Entity.Don;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


import java.util.UUID;
@RepositoryRestResource
public interface DonRepository extends JpaRepository<Don, UUID> {
}
