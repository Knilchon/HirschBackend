package com.spring_boot.schueler;

import com.spring_boot.betrieb.Betrieb;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SchuelerRepository extends JpaRepository<Schueler, Long> {
    Optional<Schueler> findByVornameAndFamiliennameAndGeburtsdatumAndEmail(String vorname, String familienname, String geburtsdatum, String email);
}
