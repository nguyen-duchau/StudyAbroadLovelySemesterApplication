package fr.insa.soa.controller;

import fr.insa.soa.model.entities.*;
import fr.insa.soa.model.exception.AccountNotFoundException;
import fr.insa.soa.model.exception.PartnersNotFoundException;
import fr.insa.soa.model.exception.StudentNotFoundException;
import fr.insa.soa.model.exception.YearEnrolmentNotFoundException;
import fr.insa.soa.model.repository.PartnersRepository;
import fr.insa.soa.model.repository.SimpleEnrolmentRepository;
import fr.insa.soa.model.repository.StudentRepository;
import fr.insa.soa.model.repository.YearEnrolmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentRepository studentRepository;
    private final YearEnrolmentRepository yearEnrolmentRepository;
    private final SimpleEnrolmentRepository simpleEnrolmentRepository;
    private final PartnersRepository partnersRepository;

    public StudentController(StudentRepository studentRepository,
                             YearEnrolmentRepository yearEnrolmentRepository,
                             SimpleEnrolmentRepository simpleEnrolmentRepository,
                             PartnersRepository partnersRepository) {
        this.studentRepository = studentRepository;
        this.yearEnrolmentRepository = yearEnrolmentRepository;
        this.simpleEnrolmentRepository = simpleEnrolmentRepository;
        this.partnersRepository = partnersRepository;
    }

    @PostMapping("/login")
    public fr.insa.soa.model.entities.Account login(@RequestBody String username, @RequestBody String password) {
        return studentRepository.findByUsernameAndPassword(username, password).orElseThrow(() ->
                new AccountNotFoundException(username)
        );
    }


    @PutMapping("/add")
    public Student add(@RequestBody Student student) {
            return studentRepository.saveAndFlush(student);
    }

    @PutMapping("/add/YearEnrolment/{year}/{username}")
    public YearEnrollment addYearEnrolment(@PathVariable("username") String username, @PathVariable("year") Integer year) {

        Student student = studentRepository.findById(username).orElseThrow(() ->
                new StudentNotFoundException(username)
        );

        for (YearEnrollment yearEnr: student.getYearEnrollments()){
            if (yearEnr.getYear().equals(year)){
                return yearEnr;
            }
        }

        YearEnrollment yearEnrollment= new YearEnrollment(username,year);
        yearEnrollment.setStudent(student);
        return yearEnrollmentRepository.saveAndFlush(yearEnrollment);
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

    @PutMapping("/add/simpleEnrolment/{university}/{username}/{year}")
    public Enrollment addSimpleEnrolment(@PathVariable("username") String username,
                                            @PathVariable("university") String university,
                                            @PathVariable("year") Integer year) {

        YearEnrollment yearEnrollment = yearEnrollmentRepository.findYearEnrolmentById(username+"-"+year)
                .orElseThrow(() -> new YearEnrolmentNotFoundException(username+"-"+year));

        Partners partner = partnersRepository.findByName(university)
                .orElseThrow(() -> new PartnersNotFoundException(university));

        for (Enrollment enrollment : yearEnrollment.getEnrollment()){
            if (enrollment.getPartner().getName().equals(university)){
                return enrollment;
            }
        }

        SimpleEnrollment simpleEnrolment = new SimpleEnrollment(yearEnrollment,partner);
        return simpleEnrollmentRepository.saveAndFlush(simpleEnrolment);
    }

}
