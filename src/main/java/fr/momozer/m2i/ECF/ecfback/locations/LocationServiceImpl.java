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
        logger.info("Affiche l'ensemble des locations existants ");
        return locationRepository.findAll();
    }

    @Override
    public Location save(Location entity) {
        logger.info("Ssauvegarde, enregistrement d'une nouvelle location en fonction des renseignements" +
                "renseignés par l'utilisateur dans le body : " + entity);
        return locationRepository.save(entity);
    }

    @Override
    public Location findById(String id) {
        logger.info("Recherche d'une location à partir de son id : " + id);
        return locationRepository.findById(id).orElseThrow(() ->{
            logger.warn("findByIdInvalide: "+ id);
            return  new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
    }

    @Override
    public void deleteById(String id) {
        logger.info("Suppression d'une location à partir de son id : " + id);
        locationRepository.deleteById(id);
    }

    @Override
    public List<Location> findByDateDebut(LocalDate dateDebut) {
        logger.info("Recherche d'une location à partir de sa date de debut : " + dateDebut);
        return locationRepository.findByDateDebut(dateDebut);
    }

    @Override
    public List<Location> findByDateFin(LocalDate dateFin) {
        logger.info("Recherche d'un vehicule à partir de sa date de fin : " + dateFin);
        return locationRepository.findByDateFin(dateFin);
    }
}
