package fr.momozer.m2i.ECF.ecfback.vehicules;
import java.util.List;

public interface VehiculeService {

    /**
     * Affiche l'ensemble des vehicules
     * @return l'ensemble des vehicules
     */
    List<Vehicule> findAll();

    /**
     * sauvegarde le nouveau vehicule en fonction de ce que l'utilisateur a renseigné dans le body
     * @param entity nouveau vehicule
     * @return la nouvelle entity qui est un nouveau vehicule
     */
    Vehicule save(Vehicule entity);

    /**
     * Affiche le vehicule en fonction de son id
     * @param id du vehicule
     * @return le véhicule en fonction de son id
     */
    Vehicule findById(String id);

    /**
     * Modifie le vehicule
     * @param id du vehicule à modifier
     * @param entity represente les information renseigné du vehicule à modifier
     * @return l'entity vehicule modifier
     */
    Vehicule modifierVehicule(String id, Vehicule entity);

    /**
     * Supprime le vehicule en fonction de son  id
     * @param id du vehicule à supprimer
     */
    void deleteById(String id);

    /**
     * Affiche le ou les vehicules en fonction de son etat
     * @param etat du ou des vehicules
     * @return les vehicules en focntion de leurs etats
     */
    List<Vehicule> findByEtat(Etat etat);

    /**
     * Affiche le vehicule en fonction de son immatriculation
     * @param immatriculation du vehicule
     * @return le vehicule en fonction de son immatriculation
     */
    List<Vehicule> findByImmatriculation(String immatriculation);

    /**
     * Affiche le ou les vehicules en fonction de son marque
     * @param marque du ou des vehicules
     * @return le vehicule en fonction de sa marque
     */
    List<Vehicule> findByMarque(String marque);

    /**
     * Affiche le ou les vehicules en fonction de son modele
     * @param modele du ou des vehicules
     * @return le vehicule en fonction de sa modele
     */
    List<Vehicule> findByModele(String modele);

    /**
     * Affiche le ou les vehicules en fonction de son prix
     * @param prix du ou des vehicules
     * @return le vehicule en fonction de son prix
     */
    List<Vehicule> findByPrix(Integer prix);

    /**
     * Affiche le ou les vehicules en fonction de son statut
     * @param statut du ou des vehicules
     * @return le ou les vehicules en fonction de son statut
     */
    List<Vehicule> findByStatut(String statut);

    /**+
     * Affiche le ou les vehicules en fonction de son type
     * @param type du ou des vehicules
     * @return le ou les vehicules en fonction de son type
     */
    List<Vehicule> findByType(Type type);
}
