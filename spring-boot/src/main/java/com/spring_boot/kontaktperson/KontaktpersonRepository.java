package com.spring_boot.kontaktperson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface KontaktpersonRepository extends JpaRepository<Kontaktperson, Long> {
    Optional<Kontaktperson> findByVornameAndNachnameAndTelefonnummer(String vorname, String nachname, String telefonnummer);
}
