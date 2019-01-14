package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.Partners;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PartnerRepository extends JpaRepository<Partners, String> {

    Optional<Partners> findByNameAndPassword(String username, String password);

    Optional<Partners> findByUsername(String username);
}