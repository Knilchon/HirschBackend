package com.spring_boot.kontaktperson;

import com.spring_boot.betrieb.Betrieb;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Kontaktperson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long kontaktID;

    private String anrede;
    private String vorname;
    private String nachname;
    private String telefonnummer;
    private Boolean istNotfallkontakt;

    @ManyToOne
    @JoinColumn(name = "betriebID")
    private Betrieb betrieb;
}
