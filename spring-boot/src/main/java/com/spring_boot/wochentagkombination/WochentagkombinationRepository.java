package com.spring_boot.wochentagkombination;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface WochentagkombinationRepository extends JpaRepository<Wochentagkombination, Long> {

    List<Wochentagkombination> findByIstAktivTrue();

    Wochentagkombination findByWochentagkombo(String wochentagkombowunsch);

    @Transactional
    @Modifying
    @Query("update Wochentagkombination woko set woko.istAktiv = true where woko.wochentagkombo = ?1")
    int updateIstAktiv(String wochentagkombo);

}
