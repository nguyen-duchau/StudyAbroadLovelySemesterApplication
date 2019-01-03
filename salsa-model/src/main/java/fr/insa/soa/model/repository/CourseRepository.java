package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {

	Optional<Course> findByCode(String code);

	Optional<Course> deleteByCode(String code);

}
