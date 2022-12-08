package fr.momozer.m2i.ECF.ecfback.vehicules;

import fr.momozer.m2i.ECF.ecfback.locations.Location;

import java.time.LocalDate;
import java.util.List;

public interface VehiculeService {
    List<Vehicule> findAll();
    Vehicule save(Vehicule entity);
    Vehicule findById(Integer id);
    void deleteById(Integer id);

    List<Vehicule> findByEtat(Etat etat);
    List<Vehicule> findByImmatriculation(String immatriculation);
    List<Vehicule> findByMarque(String marque);
    List<Vehicule> findByModele(String modele);
    List<Vehicule> findByPrix(Integer prix);
    List<Vehicule> findByStatut(String statut);
    List<Vehicule> findByType(Type type);
}
