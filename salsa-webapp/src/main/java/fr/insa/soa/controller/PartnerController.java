package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Course;
import fr.insa.soa.model.entities.MandatoryCourse;
import fr.insa.soa.model.entities.Partner;
import fr.insa.soa.model.entities.YearEnrollment;
import fr.insa.soa.model.exception.PartnerNotFoundException;
import fr.insa.soa.model.exception.PartnersNotFoundException;
import fr.insa.soa.model.repository.CourseRepository;
import fr.insa.soa.model.repository.PartnerRepository;
import fr.insa.soa.model.repository.PartnersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/partner")
public class PartnerController {

    private final PartnerRepository partnerRepository;
    private final CourseRepository courseRepository;

    public PartnerController(PartnerRepository partnerRepository, CourseRepository courseRepository){
        this.partnerRepository=partnerRepository;
        this.courseRepository=courseRepository;
    }


    @GetMapping
    public List<Partner> all() {
        return partnerRepository.findAll();
    }

    @PutMapping("/add")
    public Partner add(@RequestBody Partner student) {
        return partnerRepository.saveAndFlush(student);
    }

    @GetMapping("/getCourses/{university}")
    public List<Course> getCourses(@PathVariable("university") String university) {
        Partner partner = partnerRepository.findByName(university).orElseThrow(() ->
        new PartnerNotFoundException(university)
        );

        return partner.getCourses();
    }

    @PutMapping("/addMandatoryCourse/{university}/{code}/{name}")
    public Course addCourse(@PathVariable("university") String university,
                                          @PathVariable("code") String code,
                                          @PathVariable("name") String name) {

        Partner partner = partnerRepository.findByName(university).orElseThrow(() ->
                new PartnersNotFoundException(university)
        );

        for (Course course: partner.getCourses()){
            if (course.getCode().equals(code)){
                return course;
            }
        }

        for (Course course: courseRepository.findAll()){
            if (course.getCode().equals(code)){
                partner.addCourse(course);
                return courseRepository.saveAndFlush(course);
            }
        }

        Course course= new MandatoryCourse(code,name);
        partner.addCourse(course);
        return courseRepository.saveAndFlush(course);
    }

}
