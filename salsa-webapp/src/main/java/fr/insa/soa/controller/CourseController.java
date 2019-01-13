package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Course;
import fr.insa.soa.model.entities.MandatoryCourse;
import fr.insa.soa.model.exception.CourseNotFoundException;
import fr.insa.soa.model.repository.CourseRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

	private final CourseRepository courseRepository;

	public CourseController(CourseRepository courseRepository) {
		this.courseRepository = courseRepository;
	}

	@GetMapping
	public List<Course> getAll() {
		return courseRepository.findAll();
	}

	@GetMapping("{code}")
	public Course get(@PathVariable String code) {
		return courseRepository.findByCode(code).orElseThrow(() ->
				new CourseNotFoundException(code)
		);
	}

	@PutMapping
	public MandatoryCourse add(@RequestBody MandatoryCourse course) {
		return courseRepository.save(course);
	}

	@DeleteMapping("{code}")
	public Course delete(@PathVariable String code) {
		return courseRepository.deleteByCode(code).orElseThrow(() ->
				new CourseNotFoundException(code)
		);
	}
}
