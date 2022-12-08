package fr.momozer.m2i.ECF.ecfback.vehicules;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class VehiculeServiceImpl implements VehiculeService{

    private static final Logger logger = LoggerFactory.getLogger(VehiculeService.class);
    private final VehiculeRepository vehiculeRepository;

    public VehiculeServiceImpl(VehiculeRepository voitureRepository) {
        this.vehiculeRepository = voitureRepository;
    }

    @Override
    public List<Vehicule> findAll() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule save(Vehicule entity) {
        return vehiculeRepository.save(entity);
    }

    @Override
    public Vehicule findById(Integer id) {
        return vehiculeRepository.findById(String.valueOf(id)).orElseThrow(() ->{
            logger.warn("findByIdInvalide: "+ id);
            return  new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
    }

    @Override
    public void deleteById(Integer id) {
        vehiculeRepository.deleteById(String.valueOf(id));
    }
}
