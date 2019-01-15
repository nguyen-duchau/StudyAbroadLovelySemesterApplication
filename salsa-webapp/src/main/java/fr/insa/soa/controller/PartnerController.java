package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Partner;
import fr.insa.soa.model.repository.PartnerRepository;
import fr.insa.soa.model.repository.StaffRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/partner")

public class PartnerController {

    private final StaffRepository staffRepository;
    private final PartnerRepository partnerRepository;

    public PartnerController(StaffRepository staffRepository, PartnerRepository partnerRepository) {
        this.staffRepository = staffRepository;
        this.partnerRepository = partnerRepository;
    }

    @GetMapping
    public List<Partner> getAll() {
        return partnerRepository.findAll();
    }

}
