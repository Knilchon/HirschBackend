package com.spring_boot.schuelerkontaktperson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SchuelerKontaktpersonService {

    private final SchuelerKontaktpersonRepository schuelerKontaktpersonRepository;

    @Autowired
    public SchuelerKontaktpersonService(SchuelerKontaktpersonRepository schuelerKontaktpersonRepository) {
        this.schuelerKontaktpersonRepository = schuelerKontaktpersonRepository;
    }
    @Transactional
    public List<SchuelerKontaktperson> findAll() {
        return schuelerKontaktpersonRepository.findAll();
    }
    @Transactional
    public Optional<SchuelerKontaktperson> findById(SchuelerKontaktpersonId id) {
        return schuelerKontaktpersonRepository.findById(id);
    }
    @Transactional
    public SchuelerKontaktperson save(SchuelerKontaktperson entity) {
        return schuelerKontaktpersonRepository.save(entity);
    }
    @Transactional
    public void deleteById(SchuelerKontaktpersonId id) {
        schuelerKontaktpersonRepository.deleteById(id);
    }

}
