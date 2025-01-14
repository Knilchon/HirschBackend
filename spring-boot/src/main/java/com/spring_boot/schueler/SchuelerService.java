package com.spring_boot.schueler;

import com.spring_boot.betrieb.Betrieb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class SchuelerService {

    private final SchuelerRepository schuelerRepository;

    @Autowired
    public SchuelerService(SchuelerRepository schuelerRepository) {
        this.schuelerRepository = schuelerRepository;
    }

    @Transactional
    public void saveSchueler(Schueler schueler) {
        schuelerRepository.save(schueler);
    }

    @Transactional
    public Schueler getOrCreateSchueler(Schueler schueler) {
        Optional<Schueler> existingSchueler = schuelerRepository.findByVornameAndFamiliennameAndGeburtsdatumAndEmail(schueler.getVorname(), schueler.getFamilienname(), schueler.getGeburtsdatum(), schueler.getEmail());
        if (existingSchueler.isEmpty()) {
            return schuelerRepository.save(schueler);
        }
        return existingSchueler.get();
    }

}
