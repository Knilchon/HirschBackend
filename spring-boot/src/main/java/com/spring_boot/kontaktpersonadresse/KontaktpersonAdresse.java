package com.spring_boot.kontaktpersonadresse;

import com.spring_boot.adresse.Adresse;
import com.spring_boot.kontaktperson.Kontaktperson;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@IdClass(KontaktpersonAdresseId.class)
public class KontaktpersonAdresse {
    @Id
    @ManyToOne
    @JoinColumn(name = "kontaktID")
    private Kontaktperson kontaktperson;

    @Id
    @ManyToOne
    @JoinColumn(name = "adressID")
    private Adresse adresse;

}
