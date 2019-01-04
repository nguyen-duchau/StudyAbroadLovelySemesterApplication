package fr.insa.soa.model.repository;

import fr.insa.soa.model.bean.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpecialityRepository extends JpaRepository<Speciality, String> {

    Optional<Speciality> findByCode(String code);
}
