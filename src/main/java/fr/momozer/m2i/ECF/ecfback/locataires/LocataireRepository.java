package fr.momozer.m2i.ECF.ecfback.locataires;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface LocataireRepository extends MongoRepository<Locataire, String> {
    List<Locataire> findByPrenom(String prenom);
    List<Locataire> findByNom(String nom);
    List<Locataire> findBydateNaissance(String dateNaissance);
    List<Locataire> findByMail(String mail);
    List<Locataire> findByTel(String tel);

}
