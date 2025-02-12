package com.spring_boot.wochentagkombination;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface WeekdayComboRepository extends JpaRepository<WeekdayCombo, Long> {

    List<WeekdayCombo> findByIsActiveTrue();

    WeekdayCombo findByWeekdayCombo(String weekdaycombowish);

    @Modifying
    @Query("update WeekdayCombo weco set weco.isActive = true where weco.weekdayCombo = ?1")
    int updateIsActive(String weekdayCombo);

}
