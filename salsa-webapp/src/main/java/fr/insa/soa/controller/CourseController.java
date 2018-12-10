package fr.insa.soa.controller;

import fr.insa.soa.model.bean.Course;
import fr.insa.soa.model.repository.CourseRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CourseController {

	private final CourseRepository courseRepository;

	public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@GetMapping("/courses")
	public List<Course> hello() {
		return courseRepository.findAll();
	}

}
