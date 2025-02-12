package com.spring_boot.wochentagkombination;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "weekdaycombo")
public class WeekdayCombo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long weekday_comboid;

    private String weekdayCombo;
    private boolean isActive;

    public WeekdayCombo() {
    }

}


