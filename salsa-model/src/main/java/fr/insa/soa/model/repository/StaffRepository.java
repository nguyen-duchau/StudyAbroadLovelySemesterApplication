package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StaffRepository extends JpaRepository<Staff, String> {

    Optional<Staff> findByNameAndPassword(String username, String password);
}