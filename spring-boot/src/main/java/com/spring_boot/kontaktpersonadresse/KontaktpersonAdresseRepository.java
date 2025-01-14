package com.spring_boot.kontaktpersonadresse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KontaktpersonAdresseRepository extends JpaRepository<KontaktpersonAdresse, KontaktpersonAdresseId> {
}