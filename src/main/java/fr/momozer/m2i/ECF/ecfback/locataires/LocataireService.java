package fr.momozer.m2i.ECF.ecfback.locataires;
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
     *
     * @param id du locataire à modifier
     * @param entity locataire à modifier
     * @return le locataire (entity) modifier
     */
    Locataire modifierLocataire(String id, Locataire entity);

    /**
     * Affiche un locataire en focntion de son id renseigné par l'utilisateur
     * @param id du locataire que l'utilisateur cherche
     * @return le locataire recherché par l'utilisateur
     */
    Locataire findById(String id);

    /**
     * Supprime le locataire en fonction de son id
     * @param id du locataire à supprimer renseigné par l'utilisateur
     */
    void deleteById(String id);

    /**
     * Affiche un locataire en focntion de son prenom renseigné par l'utilisateur
     * @param prenom du locataire que l'utilisateur cherche
     * @return le locataire recherché par l'utilisateur
     */
    List<Locataire> findByPrenom(String prenom);

    /**
     * Affiche un locataire en focntion de son nom renseigné par l'utilisateur
     * @param nom du locataire que l'utilisateur cherche
     * @return le locataire recherché par l'utilisateur
     */
    List<Locataire> findByNom(String nom);

    /**
     * Affiche un locataire en focntion de son dateNaissance renseignée par l'utilisateur
     * @param dateNaissance du locataire que l'utilisateur cherche
     * @return le locataire recherché par l'utilisateur
     */
    List<Locataire> findBydateNaissance(String dateNaissance);

    /**
     * Affiche un locataire en focntion de son mail renseigné par l'utilisateur
     * @param mail du locataire que l'utilisateur cherche
     * @return le locataire recherché par l'utilisateur
     */
    List<Locataire> findByMail(String mail);

    /**
     * Affiche un locataire en focntion de son tel renseigné par l'utilisateur
     * @param tel du locataire que l'utilisateur cherche
     * @return le locataire recherché par l'utilisateur
     */
    List<Locataire> findByTel(String tel);
}
