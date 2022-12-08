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
        logger.info("Affiche l'ensemble des vehicules enregistrés dejà");
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule save(Vehicule entity) {
        logger.info("Sauvegarde, ajout d'un nouveau véhicule appelé entity en prenant les informations" +
                "renseignées par le client dans le body : " + entity);
        return vehiculeRepository.save(entity);
    }

    @Override
    public Vehicule findById(String id) {
        logger.info("Recherche d'un vehicule à partir de son id : " + id);
        return vehiculeRepository.findById(id).orElseThrow(() ->{
            logger.warn("findByIdInvalide: "+ id);
            return  new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
    }

    @Override
    public void deleteById(String id) {
        logger.info("Suppression d'un vehicule à partir de son id : " + id);
        vehiculeRepository.deleteById(id);
    }

    @Override
    public List<Vehicule> findByEtat(Etat etat) {
        logger.info("Recherche d'un vehicule à partir de son etat : " + etat);
        return vehiculeRepository.findByEtat(etat);
    }

    @Override
    public List<Vehicule> findByImmatriculation(String immatriculation) {
        logger.info("Recherche d'un vehicule à partir de son immatriculation : " + immatriculation);
        return vehiculeRepository.findByImmatriculation(immatriculation);
    }

    @Override
    public List<Vehicule> findByMarque(String marque) {
        logger.info("Recherche d'un vehicule à partir de son marque : " + marque);
        return vehiculeRepository.findByMarque(marque);
    }

    @Override
    public List<Vehicule> findByModele(String modele) {
        logger.info("Recherche d'un vehicule à partir de son modele : " + modele);
        return vehiculeRepository.findByModele(modele);
    }

    @Override
    public List<Vehicule> findByPrix(Integer prix) {
        logger.info("Recherche d'un vehicule à partir de son prix : " + prix);
        return vehiculeRepository.findByPrix(prix);
    }

    @Override
    public List<Vehicule> findByStatut(String statut) {
        logger.info("Recherche d'un vehicule à partir de son statut : " + statut);
        return vehiculeRepository.findByStatut(statut);
    }

    @Override
    public List<Vehicule> findByType(Type type) {
        logger.info("Recherche d'un vehicule à partir de son type : " + type);
        return vehiculeRepository.findByType(type);
    }
}
