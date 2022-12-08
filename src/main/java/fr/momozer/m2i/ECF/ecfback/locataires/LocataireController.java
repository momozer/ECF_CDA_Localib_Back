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
    public Locataire findById(@PathVariable String id) {
        return locataireService.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        locataireService.deleteById(id);
    }
    @PatchMapping("{id}")
    public Locataire modifierLocataire(@PathVariable String id, @PathVariable Locataire entity) {
        return locataireService.modifierLocataire(id, entity);
    }
    @GetMapping("/prenom/{prenom}")
    public List<Locataire> findByPrenom(@PathVariable String prenom) {
        return locataireService.findByPrenom(prenom);
    }
    @GetMapping("/nom/{nom}")
    public List<Locataire> findByNom(@PathVariable String nom) {
        return locataireService.findByNom(nom);
    }
    @GetMapping("/dateNaissance/{dateNaissance}")
    public List<Locataire> findBydateNaissance(@PathVariable String dateNaissance) {
        return locataireService.findBydateNaissance(dateNaissance);
    }
    @GetMapping("/mail/{mail}")
    public List<Locataire> findByMail(@PathVariable String mail) {
        return locataireService.findByMail(mail);
    }
    @GetMapping("/tel/{tel}")
    public List<Locataire> findByTel(@PathVariable String tel) {
        return locataireService.findByTel(tel);
    }
}
