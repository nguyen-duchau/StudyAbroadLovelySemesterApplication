package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PartnerRepository extends JpaRepository<Partner, String> {
    List<Partner> findAll();
    Optional<Partner> findByName(String name);
}
