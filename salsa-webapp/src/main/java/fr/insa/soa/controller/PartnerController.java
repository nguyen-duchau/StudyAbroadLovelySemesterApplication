package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Partners;
import fr.insa.soa.model.exception.PartnerNotFoundException;
import fr.insa.soa.model.repository.PartnerRepository;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/partner")

public class PartnerController {


    private final PartnerRepository partnerRepository;

    public PartnerController(PartnerRepository partnerRepository) {
        this.partnerRepository = partnerRepository;
    }

    @PostMapping("/login")
    public Partners login(@RequestBody Partners partners) {
        return partnerRepository.findByNameAndPassword(partners.getName(), partners.getPassword()).orElseThrow(() -> new PartnerNotFoundException(partners.getName()));
    }
}
