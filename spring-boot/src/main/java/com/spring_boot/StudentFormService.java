package com.spring_boot;

import com.spring_boot.adresse.Adresse;
import com.spring_boot.adresse.AdresseService;
import com.spring_boot.betrieb.Betrieb;
import com.spring_boot.betrieb.BetriebService;
import com.spring_boot.common.StudentFormObjectMapper;
import com.spring_boot.kontaktperson.Kontaktperson;
import com.spring_boot.kontaktperson.KontaktpersonService;
import com.spring_boot.kontaktpersonadresse.KontaktpersonAdresse;
import com.spring_boot.kontaktpersonadresse.KontaktpersonAdresseService;
import com.spring_boot.schueler.Schueler;
import com.spring_boot.schuelerkontaktperson.SchuelerKontaktperson;
import com.spring_boot.schuelerkontaktperson.SchuelerKontaktpersonService;
import com.spring_boot.schulbesuch.Schulbesuch;
import com.spring_boot.schulbesuch.SchulbesuchService;
import com.spring_boot.schueler.SchuelerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class StudentFormService {

    private final SchuelerService schuelerService;
    private final AdresseService adresseService;
    private final BetriebService betriebService;
    private final KontaktpersonService kontaktpersonService;
    private final SchulbesuchService schulbesuchService;
    private final SchuelerKontaktpersonService schuelerKontaktpersonService;
    private final KontaktpersonAdresseService kontaktpersonAdresseService;

    @Autowired
    public StudentFormService(SchuelerService schuelerService, AdresseService adresseService, BetriebService betriebService,
                              KontaktpersonService kontaktpersonService, SchulbesuchService schulbesuchService,
                              SchuelerKontaktpersonService schuelerKontaktpersonService,
                              KontaktpersonAdresseService kontaktpersonAdresseService) {
        this.schuelerService = schuelerService;
        this.adresseService = adresseService;
        this.betriebService = betriebService;
        this.kontaktpersonService = kontaktpersonService;
        this.schulbesuchService = schulbesuchService;
        this.schuelerKontaktpersonService = schuelerKontaktpersonService;
        this.kontaktpersonAdresseService = kontaktpersonAdresseService;
    }


    @Transactional
    public String saveStudentForm(StudentForm studentForm) {
        Adresse adresse = StudentFormObjectMapper.mapToAdresse(studentForm);
        adresseService.saveAdresse(adresse);

        Betrieb betrieb = StudentFormObjectMapper.mapToBetrieb(studentForm);
        betriebService.saveBetrieb(betrieb);

        Schulbesuch schulbesuch = StudentFormObjectMapper.mapToSchulbesuch(studentForm);
        schulbesuchService.saveSchulbesuch(schulbesuch);

        Schueler schueler = StudentFormObjectMapper.mapToSchueler(studentForm);
        schueler.setAdresse(adresse);
        schueler.setSchulbesuch(schulbesuch);

        schuelerService.saveSchueler(schueler);

        Kontaktperson kontaktperson = StudentFormObjectMapper.mapToKontaktperson(studentForm);
        kontaktperson.setBetrieb(betrieb);
        kontaktpersonService.saveKontaktperson(kontaktperson);

        SchuelerKontaktperson schuelerKontaktperson = new SchuelerKontaktperson();
        schuelerKontaktperson.setSchueler(schueler);
        schuelerKontaktperson.setKontaktperson(kontaktperson);
        schuelerKontaktpersonService.save(schuelerKontaktperson);

        KontaktpersonAdresse kontaktpersonAdresse = new KontaktpersonAdresse();
        kontaktpersonAdresse.setAdresse(adresse);
        kontaktpersonAdresse.setKontaktperson(kontaktperson);
        kontaktpersonAdresseService.save(kontaktpersonAdresse);


        return "success";
    }

}
