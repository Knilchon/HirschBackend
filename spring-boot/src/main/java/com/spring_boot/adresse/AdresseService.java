package com.spring_boot.adresse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

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

    @Transactional
    public Adresse getOrCreateAdresse(Adresse adresse) {
        Optional<Adresse> existingAdresse = adresseRepository.findByStrasseAndPostleitzahlAndWohnortAndHausnummerAndKlingelschildname(adresse.getStrasse(), adresse.getPostleitzahl(), adresse.getWohnort(), adresse.getHausnummer(), adresse.getKlingelschildname());
        if (existingAdresse.isEmpty()) {
            return adresseRepository.save(adresse);
        }
        return existingAdresse.get();
    }

}
