package fr.insa.soa.authentication.controller;


import fr.insa.soa.model.entities.Staff;
import fr.insa.soa.model.exception.AccountNotFoundException;
import fr.insa.soa.model.repository.StaffRepository;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/staff")
public class StaffController {


    private StaffRepository staffRepository;

    public StaffController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    @PostMapping("/register")
    public Staff register(@RequestBody Staff staff) {
        return staffRepository.save(staff);
    }

    @PostMapping("/login")
    public Staff login(@RequestBody Staff staff) {
        return staffRepository
                .findByUsernameAndPassword(staff.getUsername(), staff.getPassword())
                .orElseThrow(() ->
                        new AccountNotFoundException(staff.getUsername()));
    }
}
