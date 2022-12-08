package fr.momozer.m2i.ECF.ecfback.locations;
import java.time.LocalDate;
import java.util.List;

public interface LocationService  {

    /**
     * Affiche l'ensemble des locations
     * @return toutes les locations
     */
    List<Location> findAll();

    /**
     * sauvegarde une nouvelle location en fonction de ce qui est renseigné par l'utilisateur dans le body
     * @param entity nouvelle location
     * @return  enregistre la nouvelle entity
     */
    Location save(Location entity);

    /**
     * affiche la location recherchée par l'utilisateur en fonction de l'id
     * @param id de la location
     * @return la location
     */
    Location findById(String id);

    /**
     * Modifie la location
     * @param id de la location
     * @param entity location body
     * @return modification de la location
     */
    Location modifierById(String id, Location entity);

    /**
     * Supprime la location en fonction de son id
     * @param id de la location
     */
    void deleteById(String id);

    /**
     * Affiche la location en fonction de sa date de début
     * @param dateDebut de la location
     * @return la ou les locations en fonction de la dateDebut
     */
    List<Location> findByDateDebut(LocalDate dateDebut);

    /**
     * Affiche la location en fonction de sa date de fin
     * @param dateFin de la location
     * @return la ou les locations en fonction de la dateFin
     */
    List<Location> findByDateFin(LocalDate dateFin);


}
