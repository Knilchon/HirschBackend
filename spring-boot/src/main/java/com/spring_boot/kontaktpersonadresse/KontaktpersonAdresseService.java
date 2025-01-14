package com.spring_boot.kontaktpersonadresse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KontaktpersonAdresseService {

    private final KontaktpersonAdresseRepository kontaktpersonAdresseRepository;

    @Autowired
    public KontaktpersonAdresseService(KontaktpersonAdresseRepository kontaktpersonAdresseRepository) {
        this.kontaktpersonAdresseRepository = kontaktpersonAdresseRepository;
    }

    public List<KontaktpersonAdresse> findAll() {
        return kontaktpersonAdresseRepository.findAll();
    }

    public Optional<KontaktpersonAdresse> findById(KontaktpersonAdresseId id) {
        return kontaktpersonAdresseRepository.findById(id);
    }

    public KontaktpersonAdresse save(KontaktpersonAdresse entity) {
        return kontaktpersonAdresseRepository.save(entity);
    }

    public void deleteById(KontaktpersonAdresseId id) {
        kontaktpersonAdresseRepository.deleteById(id);
    }

}
