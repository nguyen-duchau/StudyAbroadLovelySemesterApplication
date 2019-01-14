package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Partners;
import fr.insa.soa.model.exception.PartnerNotFoundException;
import fr.insa.soa.model.repository.StaffRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/partner")

public class PartnerController {


    private final StaffRepository staffRepository;

    public PartnerController(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

}
