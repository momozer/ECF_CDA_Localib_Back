package fr.momozer.m2i.ECF.ecfback.locations;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface LocationRepository extends MongoRepository<Location, String> {
}
