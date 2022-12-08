package fr.momozer.m2i.ECF.ecfback.locataires;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/locataires")
public class LocataireController {

    private final LocataireService locataireService;

    public LocataireController(LocataireService locataireService) {
        this.locataireService = locataireService;
    }
    @GetMapping("")
    public List<Locataire> findAll() {
        return locataireService.findAll();
    }
    @PostMapping("")
    public Locataire save(@RequestBody Locataire entity) {
        return locataireService.save(entity);
    }
    @GetMapping("{id}")
    public Locataire findById(@PathVariable Integer id) {
        return locataireService.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id) {
        locataireService.deleteById(id);
    }
}
