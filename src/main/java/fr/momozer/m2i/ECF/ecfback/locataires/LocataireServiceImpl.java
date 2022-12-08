package fr.momozer.m2i.ECF.ecfback.locataires;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class LocataireServiceImpl implements LocataireService {
    private static final Logger logger = LoggerFactory.getLogger(LocataireService.class);
    private final LocataireRepository locataireRepository;

    public LocataireServiceImpl(LocataireRepository locataireRepository) {
        this.locataireRepository = locataireRepository;
    }

    @Override
    public List<Locataire> findAll() {
        logger.info("Affiche l'ensemble des locataires existants");
        return locataireRepository.findAll();
    }

    @Override
    public Locataire save(Locataire entity) {
        logger.info("Sauvegarder, enregistre un novueau locataire en fonction des renseignements" +
                "fournis par l'utilisateur dans le body: " + entity);
        return locataireRepository.save(entity);
    }

    @Override
    public Locataire findById(Integer id) {
        logger.info("Recherche d'un locataire à partir de son id : " + id);
        return locataireRepository.findById(String.valueOf(id)).orElseThrow(() ->{
            logger.warn("findByIdInvalide: "+ id);
            return  new ResponseStatusException(HttpStatus.NOT_FOUND);
        });
    }

    @Override
    public void deleteById(String id) {
        logger.info("Suppression d'un locataire à partir de son id : " + id);
        locataireRepository.deleteById(id);
    }

    @Override
    public List<Locataire> findByPrenom(String prenom) {
        logger.info("Recherche d'un locataire à partir de son prenom : " + prenom);
        return locataireRepository.findByPrenom(prenom);
    }

    @Override
    public List<Locataire> findByNom(String nom) {
        logger.info("Recherche d'un locataire à partir de son nom: " + nom);
        return locataireRepository.findByNom(nom);
    }

    @Override
    public List<Locataire> findBydateNaissance(String dateNaissance) {
        logger.info("Recherche d'un locataire à partir de sa date de naissance : " + dateNaissance);
        return locataireRepository.findBydateNaissance(dateNaissance);
    }

    @Override
    public List<Locataire> findByMail(String mail) {
        logger.info("Recherche d'un locataire à partir de son mail : " + mail);
        return locataireRepository.findByMail(mail);
    }

    @Override
    public List<Locataire> findByTel(String tel) {
        logger.info("Recherche d'un locataire à partir de son tel : " + tel);
        return locataireRepository.findByTel(tel);
    }
}
