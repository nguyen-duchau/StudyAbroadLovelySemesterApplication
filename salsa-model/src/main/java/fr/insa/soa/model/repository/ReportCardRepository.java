package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ReportCardRepository extends JpaRepository<ReportCard, Long> {
    Optional<ReportCard> findById (Long Id);
}
