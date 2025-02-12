package com.spring_boot.wochentagkombination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class WeekdayComboService {

    private final WeekdayComboRepository weekdayComboRepository;

    @Autowired
    public WeekdayComboService(WeekdayComboRepository weekdayComboRepository) {
        this.weekdayComboRepository = weekdayComboRepository;
    }

    @Transactional
    public String saveAllWeekdayCombos(List<String> wochentagkombinations) {
        disableAllWeekDayCombos();
        for (String wochentagkombination : wochentagkombinations) {
            weekdayComboRepository.updateIsActive(wochentagkombination);
        }
        return "success";
    }

    @Transactional
    public void disableAllWeekDayCombos() {
        List<WeekdayCombo> weekdayCombos = weekdayComboRepository.findByIsActiveTrue();
        for (WeekdayCombo weekdayCombo : weekdayCombos) {
            weekdayCombo.setActive(false);
            weekdayComboRepository.save(weekdayCombo);
        }
    }

    @Transactional
    public List<WeekdayCombo> getActiveWeekDayCombos() {
        return weekdayComboRepository.findByIsActiveTrue();
    }
}
