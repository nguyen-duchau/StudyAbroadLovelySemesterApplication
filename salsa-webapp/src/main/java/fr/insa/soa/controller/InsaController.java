package fr.insa.soa.controller;

import fr.insa.soa.model.entities.Partner;
import fr.insa.soa.model.repository.PartnerRepository;
import fr.insa.soa.model.exception.PartnerNotFoundException;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/insa")
public class InsaController {

    private final PartnerRepository partnerRepository;

    public InsaController(PartnerRepository partnerRepository){
        this.partnerRepository= partnerRepository;
    }

    @GetMapping("/partner")
    public List<Partner> getAllPartner() {return partnerRepository.findAll();
    }

    @GetMapping("/partner/{name}")
    public Partner getPartner(@PathVariable("name") String name) {
        return partnerRepository.findByName(name).orElseThrow(() ->
                new PartnerNotFoundException(name)
        );
    }

    @PutMapping("/partner")
    public Partner add(@RequestBody Partner partner) {
        return partnerRepository.saveAndFlush(partner);
    }
}
