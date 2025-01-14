package com.spring_boot.kontaktperson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KontaktpersonRepository extends JpaRepository<Kontaktperson, Long> {
}
