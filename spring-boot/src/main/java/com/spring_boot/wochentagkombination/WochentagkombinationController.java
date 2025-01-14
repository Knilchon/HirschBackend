package com.spring_boot.wochentagkombination;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weekday-combo")
public class WochentagkombinationController {

    private final WochentagkombinationService wochentagkombinationService;

    @Autowired
    public WochentagkombinationController(WochentagkombinationService wochentagkombinationService) {
        this.wochentagkombinationService = wochentagkombinationService;
    }

    @PutMapping("/submit")
    public String postWeekdayCombos(@RequestBody List<String> wochentagkombinations) {
        wochentagkombinationService.saveAllWeekdayCombos(wochentagkombinations);
        return "success";
    }

    @GetMapping("/active-weekdaycombos")
    public List<Wochentagkombination> getActiveWeekendCombos() {
        return wochentagkombinationService.getActiveWeekDayCombos();
    }

}
