package com.spring_boot.adresse;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long adressID;

    private String strasse;
    private String postleitzahl;
    private String wohnort;
    private String hausnummer;
    private String klingelschildname;

}
