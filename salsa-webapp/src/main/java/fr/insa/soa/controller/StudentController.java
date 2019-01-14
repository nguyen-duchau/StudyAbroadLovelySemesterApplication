package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Account;
import fr.insa.soa.model.entities.Student;
import fr.insa.soa.model.exception.AccountNotFoundException;
import fr.insa.soa.model.exception.StudentNotFoundException;
import fr.insa.soa.model.repository.AccountRepository;
import fr.insa.soa.model.repository.StudentRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final AccountRepository accountRepository;
    private final StudentRepository studentRepository;

    public StudentController(AccountRepository accountRepository, StudentRepository studentRepository) {
        this.accountRepository = accountRepository;
        this.studentRepository = studentRepository;
    }

    @PutMapping("/add/account")
    public Account add(@RequestBody Account student) {
        return accountRepository.saveAndFlush(student);
    }


    @PutMapping("/add")
    public Student add(@RequestBody Student student) {
            return studentRepository.saveAndFlush(student);
    }

    @GetMapping("/{username}")
    public Student student(@PathVariable("username") String username) {
        return studentRepository.findByUsername(username).orElseThrow(() ->
                new StudentNotFoundException(username)
        );
    }

    @GetMapping
    public List<Student> all() {
        return studentRepository.findAll();
    }
}
