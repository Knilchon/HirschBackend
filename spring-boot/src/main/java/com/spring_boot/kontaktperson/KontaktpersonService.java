package com.spring_boot.kontaktperson;

import com.spring_boot.betrieb.Betrieb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class KontaktpersonService {

    private final KontaktpersonRepository kontaktPersonRepository;

    @Autowired
    public KontaktpersonService(KontaktpersonRepository kontaktPersonRepository) {
        this.kontaktPersonRepository = kontaktPersonRepository;
    }

    @Transactional
    public void saveKontaktperson(Kontaktperson kontaktPerson) {
        kontaktPersonRepository.save(kontaktPerson);
    }

    @Transactional
    public Kontaktperson getOrCreateKontaktperson(Kontaktperson kontaktperson) {
        Optional<Kontaktperson> existingKontaktperson = kontaktPersonRepository.findByVornameAndNachnameAndTelefonnummer(kontaktperson.getVorname(), kontaktperson.getNachname(), kontaktperson.getTelefonnummer());
        if (existingKontaktperson.isEmpty()) {
            return kontaktPersonRepository.save(kontaktperson);
        }
        return existingKontaktperson.get();
    }

}
