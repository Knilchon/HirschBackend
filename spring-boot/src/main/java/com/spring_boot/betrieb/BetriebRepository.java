package com.spring_boot.betrieb;

import com.spring_boot.adresse.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BetriebRepository extends JpaRepository<Betrieb, Long> {
    Optional<Betrieb> findByNameAndFaxAndEmail(String name, String fax, String email);
}
