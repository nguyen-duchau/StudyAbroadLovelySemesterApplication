package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PartnersRepository extends JpaRepository<Partner, String> {
    Optional<Partner> findByName (String name);
}
