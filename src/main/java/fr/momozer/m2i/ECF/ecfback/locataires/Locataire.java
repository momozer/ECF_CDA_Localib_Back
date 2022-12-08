package fr.momozer.m2i.ECF.ecfback.locataires;

import com.fasterxml.jackson.annotation.JsonFormat;
import fr.momozer.m2i.ECF.ecfback.utils.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Locataire extends Entity {


    private String prenom;
    private String nom;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private String dateNaissance;
    private String mail;
    private String tel;


}
