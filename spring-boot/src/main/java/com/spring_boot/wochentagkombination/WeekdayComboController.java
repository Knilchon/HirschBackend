package com.spring_boot.wochentagkombination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weekday-combo")
public class WeekdayComboController {

    private final WeekdayComboService weekdayComboService;

    @Autowired
    public WeekdayComboController(WeekdayComboService weekdayComboService) {
        this.weekdayComboService = weekdayComboService;
    }

    @PutMapping("/submit")
    public String postWeekdayCombos(@RequestBody List<String> wochentagkombinations) {
        weekdayComboService.saveAllWeekdayCombos(wochentagkombinations);
        return "success";
    }

    @GetMapping("/active-weekdaycombos")
    public List<WeekdayCombo> getActiveWeekendCombos() {
        return weekdayComboService.getActiveWeekDayCombos();
    }

}
