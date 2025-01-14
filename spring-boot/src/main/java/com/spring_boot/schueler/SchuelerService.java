package com.spring_boot.schueler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

}
