package fr.insa.soa.authentication.controller;

import fr.insa.soa.model.entities.Account;
import fr.insa.soa.model.entities.Student;
import fr.insa.soa.model.exception.AccountNotFoundException;
import fr.insa.soa.model.repository.StudentRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {


    private StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/register")
    public Student register(@RequestBody Student student) {
        return studentRepository.save(student);
    }

    @PostMapping("/login")
    public Student login(@RequestBody Student student) {
        return studentRepository
                .findByUsernameAndPassword(student.getUsername(), student.getPassword())
                .orElseThrow(() ->
                        new AccountNotFoundException(student.getUsername()));
    }
}
