package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Course;
import fr.insa.soa.model.entities.MandatoryCourse;
import fr.insa.soa.model.entities.Partners;
import fr.insa.soa.model.entities.YearEnrolment;
import fr.insa.soa.model.exception.PartnersNotFoundException;
import fr.insa.soa.model.repository.CourseRepository;
import fr.insa.soa.model.repository.PartnersRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partners")
public class PartnersController {

    private final PartnersRepository partnersRepository;
    private final CourseRepository courseRepository;

    public PartnersController(PartnersRepository partnersRepository, CourseRepository courseRepository){
        this.partnersRepository=partnersRepository;
        this.courseRepository=courseRepository;
    }


    @GetMapping
    public List<Partners> all() {
        return partnersRepository.findAll();
    }

    @PutMapping("/add")
    public Partners add(@RequestBody Partners student) {
        return partnersRepository.saveAndFlush(student);
    }

    @GetMapping("/getCourses/{university}")
    public List<Course> getCourses(@PathVariable("university") String university) {
        Partners partner = partnersRepository.findByName(university).orElseThrow(() ->
        new PartnersNotFoundException(university)
        );

        return partner.getCourses();
    }

    @PutMapping("/addMandatoryCourse/{university}/{code}/{name}")
    public Course addCourse(@PathVariable("university") String university,
                                          @PathVariable("code") String code,
                                          @PathVariable("name") String name) {

        Partners partner = partnersRepository.findByName(university).orElseThrow(() ->
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
