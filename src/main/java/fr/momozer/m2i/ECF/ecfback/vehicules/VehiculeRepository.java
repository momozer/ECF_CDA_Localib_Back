package fr.momozer.m2i.ECF.ecfback.vehicules;
import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface VehiculeRepository extends MongoRepository<Vehicule, String> {
    List<Vehicule> findByEtat(Etat etat);
    List<Vehicule> findByImmatriculation(String immatriculation);
    List<Vehicule> findByMarque(String marque);
    List<Vehicule> findByModele(String modele);
    List<Vehicule> findByPrix(Integer prix);
    List<Vehicule> findByStatut(String statut);
    List<Vehicule> findByType(Type type);
}
