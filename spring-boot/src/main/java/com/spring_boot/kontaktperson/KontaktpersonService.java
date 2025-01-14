package com.spring_boot.kontaktperson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}
