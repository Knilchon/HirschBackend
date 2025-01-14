package com.spring_boot.schuelerkontaktperson;

import com.spring_boot.kontaktperson.Kontaktperson;
import com.spring_boot.schueler.Schueler;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@IdClass(SchuelerKontaktpersonId.class)
public class SchuelerKontaktperson {
    @Id
    @ManyToOne
    @JoinColumn(name = "schuelerID")
    private Schueler schueler;

    @Id
    @ManyToOne
    @JoinColumn(name = "kontaktID")
    private Kontaktperson kontaktperson;
}
