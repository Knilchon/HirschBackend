package com.spring_boot.schuelerkontaktperson;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchuelerKontaktpersonRepository extends JpaRepository<SchuelerKontaktperson, SchuelerKontaktpersonId> {
}
