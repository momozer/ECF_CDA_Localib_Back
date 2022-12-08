package fr.momozer.m2i.ECF.ecfback.locations;

import fr.momozer.m2i.ECF.ecfback.locataires.Locataire;
import fr.momozer.m2i.ECF.ecfback.utils.Entity;
import fr.momozer.m2i.ECF.ecfback.vehicules.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Location extends Entity {


    private LocalDate dateDebut;
    private LocalDate dateFin;
    private Long prixTotal;

    @DBRef
    private Locataire locataire;

    @DBRef
    private Vehicule vehicule;
}
