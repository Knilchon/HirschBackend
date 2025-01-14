package com.spring_boot.betrieb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BetriebRepository extends JpaRepository<Betrieb, Long> {
}
