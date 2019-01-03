package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Account;
import fr.insa.soa.model.entities.Student;
import fr.insa.soa.model.repository.AccountRepository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final AccountRepository accountRepository;

    private final RestTemplate restTemplate;

    public StudentController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;

        this.restTemplate = new RestTemplate();
    }

    @PutMapping
    public Student add(@RequestBody Student student) {
        return accountRepository.saveAndFlush(student);
    }

    @PostMapping("/login")
    public Student login(@RequestBody Account account) {

        return restTemplate.postForObject(
                "localhost:9001/verify",
                account,
                Student.class);

    }

    @GetMapping("/success")
    public String success() {
        return "Yo, this one is gooood";
    }

}
