package fr.insa.soa.controller;

import fr.insa.soa.model.entities.*;
import fr.insa.soa.model.exception.*;
import fr.insa.soa.model.repository.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentRepository studentRepository;
    private final YearEnrollmentRepository yearEnrollmentRepository;
    private final SimpleEnrollmentRepository simpleEnrollmentRepository;
    private final PartnerRepository partnerRepository;
    private final SpecialityRepository specialityRepository;

    public StudentController(StudentRepository studentRepository,
                             YearEnrollmentRepository yearEnrollmentRepository,
                             SimpleEnrollmentRepository simpleEnrollmentRepository,
                             PartnerRepository partnerRepository,
                             SpecialityRepository specialityRepository) {
        this.studentRepository = studentRepository;
        this.yearEnrollmentRepository = yearEnrollmentRepository;
        this.simpleEnrollmentRepository = simpleEnrollmentRepository;
        this.partnerRepository = partnerRepository;
        this.specialityRepository = specialityRepository;
    }

    @PutMapping("/add")
    public Student add(@RequestBody Student student) {
            return studentRepository.saveAndFlush(student);
    }

    @PutMapping("/add/YearEnrollment/{year}/{username}")
    public YearEnrollment addYearEnrollment(@PathVariable("username") String username, @PathVariable("year") Integer year) {

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

    @PutMapping("/add/simpleEnrollment/{university}/{username}/{year}")
    public Enrollment addSimpleEnrollment(@PathVariable("username") String username,
                                            @PathVariable("university") String university,
                                            @PathVariable("year") Integer year) {

        YearEnrollment yearEnrollment = yearEnrollmentRepository.findYearEnrollmentById(username+"-"+year)
                .orElseThrow(() -> new YearEnrollmentNotFoundException(username+"-"+year));

        Partner partner = partnerRepository.findByName(university)
                .orElseThrow(() -> new PartnerNotFoundException(university));

        for (Enrollment enrollment : yearEnrollment.getEnrollment()){
            if (enrollment.getPartner().getName().equals(university)){
                return enrollment;
            }
        }

        SimpleEnrollment simpleEnrollment = new SimpleEnrollment(yearEnrollment,partner);
        return simpleEnrollmentRepository.saveAndFlush(simpleEnrollment);
    }

    @PutMapping("/set/speciality/{username}/{code}")
    public Speciality setSpeciality(@PathVariable ("username") String username,
                                          @PathVariable ("code") String code){

        Speciality speciality = specialityRepository.findByCode(code).orElseThrow(() ->
                new SpecialityNotFoundException(code)
        );

        Student student = studentRepository.findByUsername(username).orElseThrow(() ->
                new StudentNotFoundException(username)
        );

        student.setSpeciality(speciality);

        return specialityRepository.saveAndFlush(speciality);
    }

    @GetMapping("/get/speciality/{username}")
    public Speciality getSpeciality(@PathVariable ("username") String username){

        Student student = studentRepository.findByUsername(username).orElseThrow(() ->
                new StudentNotFoundException(username)
        );

        return student.getSpeciality();
    }

}
