package com.spring_boot.common;

import com.spring_boot.StudentForm;
import com.spring_boot.adresse.Adresse;
import com.spring_boot.betrieb.Betrieb;
import com.spring_boot.kontaktperson.Kontaktperson;
import com.spring_boot.schueler.Schueler;
import com.spring_boot.schulbesuch.Schulbesuch;

public class StudentFormObjectMapper {

    public static Schueler mapToSchueler(StudentForm studentForm) {
        Schueler schueler = new Schueler();
        schueler.setGeschlecht(studentForm.getGeschlecht());
        schueler.setVorname(studentForm.getVornameSchueler());
        schueler.setFamilienname(studentForm.getFamilienname());
        schueler.setStaatsangehoerigkeit(studentForm.getStaatsangehoerigkeit());
        schueler.setGeburtsort(studentForm.getGeburtsort());
        schueler.setGeburtsdatum(studentForm.getGeburtsdatum());
        schueler.setGeburtsland(studentForm.getGeburtsland());
        schueler.setEmail(studentForm.getEmail());
        schueler.setHandynummer(studentForm.getHandynummer());
        schueler.setAusbildung(studentForm.getAusbildung());
        schueler.setTelefonNr(studentForm.getTelefonNr());
        schueler.setAnrede(studentForm.getAnredeSchueler());
        schueler.setWochentagkombowunsch1(studentForm.getWochentagkombowunsch1());
        schueler.setWochentagkombowunsch2(studentForm.getWochentagkombowunsch2());
        return schueler;
    }

    public static Adresse mapToAdresse(StudentForm studentForm) {
        Adresse adresse = new Adresse();
        adresse.setStrasse(studentForm.getStrasse());
        adresse.setPostleitzahl(studentForm.getPostleitzahl());
        adresse.setWohnort(studentForm.getWohnort());
        adresse.setHausnummer(studentForm.getHausnummer());
        adresse.setKlingelschildname(studentForm.getKlingelschildname());
        return adresse;
    }

    public static Betrieb mapToBetrieb(StudentForm studentForm) {
        Betrieb betrieb = new Betrieb();
        betrieb.setName(studentForm.getNameBetrieb());
        betrieb.setFax(studentForm.getFax());
        betrieb.setEmail(studentForm.getEmailBetrieb());
        return betrieb;
    }

    public static Schulbesuch mapToSchulbesuch(StudentForm studentForm) {
        Schulbesuch schulbesuch = new Schulbesuch();
        schulbesuch.setAbschlussjahr(studentForm.getAbschlussjahr());
        schulbesuch.setSchulabschluss(studentForm.getSchulabschluss());
        schulbesuch.setIstNeuAnSchule(studentForm.isIstNeuAnSchule());
        schulbesuch.setLehrgaenge(studentForm.getLehrgaenge());
        schulbesuch.setBerufsausbildung(studentForm.getBerufsausbildung());
        schulbesuch.setLetzteSchule(studentForm.getLetzteSchule());
        return schulbesuch;
    }

}
