package fr.momozer.m2i.ECF.ecfback.locataires;

import fr.momozer.m2i.ECF.ecfback.locations.LocationService;

import java.util.List;

public interface LocataireService {
    /**
     * Affiche la liste de l'ensemble des locataires
     * @return l'ensemble des locataires
     */
    List<Locataire> findAll();

    /**
     * Sauvagarde, enregistre un locataire
     * @param entity est le locataire renseigné par l'utilisateur dans le body
     * @return entity qui est le locataire
     */
    Locataire save(Locataire entity);

    /**
     * Affiche un locataire en focntion de son id renseigné par l'utilisateur
     * @param id du locataire que l'utilisateur cherche
     * @return le locataire recherché par l'utilisateur
     */
    Locataire findById(Integer id);

    /**
     * Supprime le locataire en fonction de son id
     * @param id du locataire à supprimer renseigné par l'utilisateur
     */
    void deleteById(String id);


    List<Locataire> findByPrenom(String prenom);
    List<Locataire> findByNom(String nom);
    List<Locataire> findBydateNaissance(String dateNaissance);
    List<Locataire> findByMail(String mail);
    List<Locataire> findByTel(String tel);
}
