package fr.momozer.m2i.ECF.ecfback.vehicules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {
    @Id
    private Integer id;
    private Etat etat;
    private String immatriculation;
    private String marque;
    private String modele;
    private Integer prix;
    private String statut;
    private Type type;
    private String photo;

}
