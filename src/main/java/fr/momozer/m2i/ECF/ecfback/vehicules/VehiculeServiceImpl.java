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

    @Override
    public List<Vehicule> findByEtat(Etat etat) {
        return vehiculeRepository.findByEtat(etat);
    }

    @Override
    public List<Vehicule> findByImmatriculation(String immatriculation) {
        return vehiculeRepository.findByImmatriculation(immatriculation);
    }

    @Override
    public List<Vehicule> findByMarque(String marque) {
        return vehiculeRepository.findByMarque(marque);
    }

    @Override
    public List<Vehicule> findByModele(String modele) {
        return vehiculeRepository.findByModele(modele);
    }

    @Override
    public List<Vehicule> findByPrix(Integer prix) {
        return vehiculeRepository.findByPrix(prix);
    }

    @Override
    public List<Vehicule> findByStatut(String statut) {
        return vehiculeRepository.findByStatut(statut);
    }

    @Override
    public List<Vehicule> findByType(Type type) {
        return vehiculeRepository.findByType(type);
    }
}
