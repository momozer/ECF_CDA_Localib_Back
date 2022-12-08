package fr.momozer.m2i.ECF.ecfback.locations;
import com.fasterxml.jackson.annotation.JsonFormat;
import fr.momozer.m2i.ECF.ecfback.locataires.Locataire;
import fr.momozer.m2i.ECF.ecfback.utils.Entity;
import fr.momozer.m2i.ECF.ecfback.vehicules.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDate;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Location extends Entity {

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateDebut;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dateFin;

    private Long prixTotal;

    @DBRef
    private Locataire locataire;

    @DBRef
    private Vehicule vehicule;

    public LocalDate getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(LocalDate dateDebut) {
        this.dateDebut = dateDebut;
    }

    public LocalDate getDateFin() {
        return dateFin;
    }

    public void setDateFin(LocalDate dateFin) {
        this.dateFin = dateFin;
    }

    public Long getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(Long prixTotal) {
        this.prixTotal = prixTotal;
    }

    public Locataire getLocataire() {
        return locataire;
    }

    public void setLocataire(Locataire locataire) {
        this.locataire = locataire;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }
}
