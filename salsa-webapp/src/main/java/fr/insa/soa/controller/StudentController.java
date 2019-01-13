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

    private final StudentRepository studentRepository;

    public StudentController(AccountRepository accountRepository, StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @PostMapping("/login")
    public fr.insa.soa.model.entities.Account login(@RequestBody String username, @RequestBody String password) {
        return studentRepository.findByUsernameAndPassword(username, password).orElseThrow(() ->
                new AccountNotFoundException(username)
        );
    }

    @GetMapping("/success")
    public String success() {
        return "Yo, this one is gooood";
    }


    @PutMapping("/add")
    public Student add(@RequestBody Student student) {
            return studentRepository.saveAndFlush(student);
    }

    @GetMapping("/{username}")
    public Student student(@PathVariable("username") String username) {
        return studentRepository.findById(username).orElseThrow(() ->
                new StudentNotFoundException(username)
        );
    }

    @GetMapping
    public List<Student> all() {
        return studentRepository.findAll();
    }
}
