package com.spring_boot.schulbesuch;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Schulbesuch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long schulbesuchID;

    private int abschlussjahr;
    private String schulabschluss;
    private boolean istNeuAnSchule;
    private String lehrgaenge;
    private String berufsausbildung;
    private String letzteSchule;

}