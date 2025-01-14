package com.spring_boot.schueler;

import com.spring_boot.adresse.Adresse;
import com.spring_boot.schulbesuch.Schulbesuch;
import com.spring_boot.wochentagkombination.Wochentagkombination;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Schueler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schuelerID;

    private String geschlecht;
    private String vorname;
    private String familienname;
    private String staatsangehoerigkeit;
    private String geburtsort;
    private String geburtsdatum;
    private String geburtsland;
    private String email;
    private String handynummer;
    private String ausbildung;
    private String telefonNr;
    private String anrede;
    private String Wochentagkombowunsch1;
    private String Wochentagkombowunsch2;

    @OneToOne
    @JoinColumn(name = "adressID", unique = true)
    private Adresse adresse;

    @OneToOne
    @JoinColumn(name = "schulbesuchID", unique = true)
    private Schulbesuch schulbesuch;

    @ManyToOne
    @JoinColumn(name = "wochentagkombinationID")
    private Wochentagkombination wochentagkombination;
}
