package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.Partner;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartnerRepository extends JpaRepository<Partner, String> {
    List<Partner> findAll();
}
