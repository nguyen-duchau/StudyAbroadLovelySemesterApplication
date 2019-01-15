package fr.insa.soa.content.controller;

import fr.insa.soa.model.entities.Speciality;
import fr.insa.soa.model.repository.SpecialityRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/speciality")
public class SpecialityServiceController {

    private final SpecialityRepository specialityRepository;

    public SpecialityServiceController(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @GetMapping
    public List<Speciality> getAll() {
        return this.specialityRepository.findAll();
    }

//    @GetMapping
//    public Speciality get(@RequestParam(value="year", required=false) int year,
//                          @RequestParam(value="department", required=false) String department) {
//        return this.specialityRepository.findSpecialitiesByYearAndDepartment(year, department);
//    }

    @PutMapping
    public void put(@RequestBody Speciality speciality) {
        this.specialityRepository.save(speciality);
    }

    @DeleteMapping("/{year}/{department}")
    public void delete(@PathVariable int year, @PathVariable String department) {
        this.specialityRepository.deleteById(new Speciality(year, department));
    }
}
