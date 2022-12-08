package fr.momozer.m2i.ECF.ecfback.vehicules;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehiculeRepository extends MongoRepository<Vehicule, String> {
}
