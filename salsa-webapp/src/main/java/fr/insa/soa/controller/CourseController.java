package fr.insa.soa.controller;

import fr.insa.soa.model.bean.Course;
import fr.insa.soa.model.exception.CourseNotFoundException;
import fr.insa.soa.model.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

	private final CourseRepository courseRepository;

	public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@GetMapping("/course")
	public List<Course> getAll() {
		return courseRepository.findAll();
	}

	@GetMapping("/course/{code}")
	public Course get(@PathVariable String code) {
		return courseRepository.findByCode(code).orElseThrow(() ->
				new CourseNotFoundException(code)
		);
	}

	@PutMapping("/course")
	public Course add(@RequestBody Course course) {
		return courseRepository.save(course);
	}



	@DeleteMapping("/course/{code}")
	public Course delete(@PathVariable String code) {
		return courseRepository.deleteByCode(code).orElseThrow(() ->
				new CourseNotFoundException(code)
		);
	}
}
