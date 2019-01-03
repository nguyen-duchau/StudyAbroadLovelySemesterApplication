package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.Speciality;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpecialityRepository extends JpaRepository<Speciality, Speciality> {
    Speciality findSpecialitiesByYearAndDepartment(int year, String department);
}
