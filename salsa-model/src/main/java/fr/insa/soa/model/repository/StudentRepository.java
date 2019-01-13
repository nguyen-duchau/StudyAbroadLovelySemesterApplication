package fr.insa.soa.model.repository;

import fr.insa.soa.model.entities.Account;
import fr.insa.soa.model.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

    Optional<Student> findByUsernameAndPassword(String username, String password);
    Optional<Student> findByUsername(String username);
}
