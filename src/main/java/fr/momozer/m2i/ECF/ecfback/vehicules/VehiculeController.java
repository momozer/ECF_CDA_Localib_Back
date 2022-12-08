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
    public Vehicule findById(@PathVariable Integer id) {
        return vehiculeService.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id) {
        vehiculeService.deleteById(id);
    }
}
