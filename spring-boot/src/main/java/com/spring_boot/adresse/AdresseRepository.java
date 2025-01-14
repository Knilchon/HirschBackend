package com.spring_boot.adresse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdresseRepository extends JpaRepository<Adresse, Long> {
    Optional<Adresse> findByStrasseAndPostleitzahlAndWohnortAndHausnummerAndKlingelschildname(String strasse, String postleitzahl, String wohnort, String hausnummer, String klingelschildname);
}
