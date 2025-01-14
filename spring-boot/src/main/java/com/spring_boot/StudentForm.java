package com.spring_boot;

import lombok.Data;

@Data
public class StudentForm {

    //Adresse
    private String strasse;
    private String postleitzahl;
    private String wohnort;
    private String hausnummer;
    private String klingelschildname;

    //Schulbesuch
    private int abschlussjahr;
    private String schulabschluss;
    private boolean istNeuAnSchule;
    private String lehrgaenge;
    private String berufsausbildung;
    private String letzteSchule;

    //Schueler
    private String geschlecht;
    private String vornameSchueler;
    private String familienname;
    private String staatsangehoerigkeit;
    private String geburtsort;
    private String geburtsdatum;
    private String geburtsland;
    private String email;
    private String handynummer;
    private String ausbildung;
    private String telefonNr;
    private String anredeSchueler;
    //Wochentagkombination
    private String wochentagkombowunsch1;
    private String wochentagkombowunsch2;

    //Kontaktperson
    private String anredeKontaktperson;
    private String vornameKontaktperson;
    private String nachnameKontaktperson;
    private String telefonnummerKontaktperson;
    private Boolean istNotfallkontakt;

    //Betrieb
    private String nameBetrieb;
    private String fax;
    private String emailBetrieb;

}

