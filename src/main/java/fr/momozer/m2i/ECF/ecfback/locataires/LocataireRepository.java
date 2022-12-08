package fr.momozer.m2i.ECF.ecfback.locataires;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocataireRepository extends MongoRepository<Locataire, String> {
}
