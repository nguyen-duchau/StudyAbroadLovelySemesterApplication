package fr.insa.soa.controller;

import fr.insa.soa.model.bean.Account;
import fr.insa.soa.model.bean.Student;
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

    @PostMapping("/login")
    public Account login(@RequestBody String username, @RequestBody String password) {
        return accountRepository.findAccountByUsernameAndPassword(username, password).orElseThrow(() ->
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

    @GetMapping("/{name}")
    public Student student(@PathVariable("name") String name) {
        return studentRepository.findByName(name).orElseThrow(() ->
                new StudentNotFoundException(name)
        );
    }

    @GetMapping
    public List<Student> all() {
        return studentRepository.findAll();
    }
}
