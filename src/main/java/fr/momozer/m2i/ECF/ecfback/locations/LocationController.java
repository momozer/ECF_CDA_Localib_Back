package fr.momozer.m2i.ECF.ecfback.locations;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDate;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/locations")
public class LocationController {
    private final LocationService locationService;
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("")
    public List<Location> findAll() {
        return locationService.findAll();
    }
    @PostMapping("")
    public Location save(@RequestBody Location entity) {
        return locationService.save(entity);
    }
    @GetMapping("{id}")
    public Location findById(@PathVariable String id) {
        return locationService.findById(id);
    }
    @PatchMapping("{id}")
    public Location modifierById(String id, Location entity) {
        return locationService.modifierById(id, entity);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id) {
        locationService.deleteById(id);
    }
    @GetMapping("/dateDebut/{dateDebut}")
    public List<Location> findByDateDebut(@PathVariable LocalDate dateDebut) {
        return locationService.findByDateDebut(dateDebut);
    }
    @GetMapping("/dateFin/{dateFin}")
    public List<Location> findByTel(@PathVariable LocalDate dateFin) {
        return locationService.findByDateFin(dateFin);
    }

}
