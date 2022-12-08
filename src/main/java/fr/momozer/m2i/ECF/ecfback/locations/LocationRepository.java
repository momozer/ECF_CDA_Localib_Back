package fr.momozer.m2i.ECF.ecfback.locations;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.time.LocalDate;
import java.util.List;

public interface LocationRepository extends MongoRepository<Location, String> {
    List<Location> findByDateDebut(LocalDate dateCreation);
    List<Location> findByDateFin(LocalDate dateFin);

}
