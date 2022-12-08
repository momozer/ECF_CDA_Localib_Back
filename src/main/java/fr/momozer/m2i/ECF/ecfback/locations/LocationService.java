package fr.momozer.m2i.ECF.ecfback.locations;

import fr.momozer.m2i.ECF.ecfback.locataires.Locataire;

import java.time.LocalDate;
import java.util.List;

public interface LocationService  {
    List<Location> findAll();
    Location save(Location entity);
    Location findById(String id);
    void deleteById(Integer id);

    List<Location> findByDateDebut(LocalDate dateDebut);
    List<Location> findByDateFin(LocalDate dateFin);


}
