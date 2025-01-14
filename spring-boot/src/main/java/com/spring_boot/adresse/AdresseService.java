package com.spring_boot.adresse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AdresseService {

    private final AdresseRepository adresseRepository;

    @Autowired
    public AdresseService(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    @Transactional
    public void saveAdresse(Adresse adresse) {
        adresseRepository.save(adresse);
    }

}
