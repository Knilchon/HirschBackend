package com.spring_boot.wochentagkombination;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Wochentagkombination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long wochentagkombinationID;

    private String wochentagkombo;
    private boolean istAktiv;

    public Wochentagkombination() {
    }

}


