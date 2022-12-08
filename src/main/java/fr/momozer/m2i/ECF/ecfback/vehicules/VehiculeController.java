package fr.momozer.m2i.ECF.ecfback.vehicules;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/vehicules")
public class VehiculeController {
    private final VehiculeService vehiculeService;
    public VehiculeController(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }
    @RequestMapping("")
    public List<Vehicule> findAll() {
        return vehiculeService.findAll();
    }
    @PostMapping("")
    public Vehicule save(@RequestBody Vehicule entity) {
        return vehiculeService.save(entity);
    }
    @GetMapping("{id}")
    public Vehicule findById(@PathVariable String id) {
        return vehiculeService.findById(id);
    }
    @PatchMapping("{id}")
    public Vehicule modifierVehicule(@PathVariable String id,@PathVariable Vehicule entity) {
        return vehiculeService.modifierVehicule(id, entity);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        vehiculeService.deleteById(id);
    }
    @GetMapping("/etat/{etat}")
    public List<Vehicule> findByEtat(@PathVariable Etat etat) {
        return vehiculeService.findByEtat(etat);
    }
    @GetMapping("/immatriculation/{immatriculation}")
    public List<Vehicule> findByImmatriculation(@PathVariable String immatriculation) {
        return vehiculeService.findByImmatriculation(immatriculation);
    }
    @GetMapping("/marque/{marque}")
    public List<Vehicule> findByMarque(@PathVariable String marque) {
        return vehiculeService.findByMarque(marque);
    }
    @GetMapping("/modele/{modele}")
    public List<Vehicule> findByModele(@PathVariable String modele) {
        return vehiculeService.findByModele(modele);
    }
    @GetMapping("/prix/{prix}")
    public List<Vehicule> findByPrix(@PathVariable Integer prix) {
        return vehiculeService.findByPrix(prix);
    }
    @GetMapping("/statut/{statut}")
    public List<Vehicule> findByStatut(@PathVariable String statut) {
        return vehiculeService.findByStatut(statut);
    }
    @GetMapping("/type/{type}")
    public List<Vehicule> findByType(@PathVariable Type type) {
        return vehiculeService.findByType(type);
    }
}
