package fr.momozer.m2i.ECF.ecfback.vehicules;

import java.util.List;

public interface VehiculeService {
    List<Vehicule> findAll();
    Vehicule save(Vehicule entity);
    Vehicule findById(Integer id);
    void deleteById(Integer id);
}
