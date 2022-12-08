package fr.momozer.m2i.ECF.ecfback.locations;

import org.springframework.web.bind.annotation.*;

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
    public Location findById(@PathVariable Integer id) {
        return locationService.findById(id);
    }
    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Integer id) {
        locationService.deleteById(id);
    }
}
