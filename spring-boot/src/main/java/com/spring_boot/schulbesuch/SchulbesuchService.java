package com.spring_boot.schulbesuch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SchulbesuchService {

    private final SchulbesuchRepository schulbesuchRepository;

    @Autowired
    public SchulbesuchService(SchulbesuchRepository schulbesuchRepository) {
        this.schulbesuchRepository = schulbesuchRepository;
    }

    @Transactional
    public void saveSchulbesuch(Schulbesuch schulbesuch) {
        schulbesuchRepository.save(schulbesuch);
    }

}
