package fr.momozer.m2i.ECF.ecfback.locations;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;

public class LocationServiceImpl implements LocationService{

    private static final Logger logger = LoggerFactory.getLogger(LocationService.class);
    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public Location save(Location entity) {
        return locationRepository.save(entity);
    }

    @Override
    public Location findById(String id) {
        return locationRepository.findById(id).orElseThrow(() ->{
            logger.warn("findByIdInvalide: "+ id);
            return  new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
    }

    @Override
    public void deleteById(Integer id) {
        locationRepository.deleteById(String.valueOf(id));
    }

    @Override
    public List<Location> findByDateDebut(LocalDate dateDebut) {
        return locationRepository.findByDateDebut(dateDebut);
    }

    @Override
    public List<Location> findByDateFin(LocalDate dateFin) {
        return locationRepository.findByDateFin(dateFin);
    }
}
