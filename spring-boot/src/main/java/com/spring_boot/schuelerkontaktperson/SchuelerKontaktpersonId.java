package com.spring_boot.schuelerkontaktperson;

import lombok.Data;

import java.io.Serializable;

@Data
public class SchuelerKontaktpersonId implements Serializable {
    private Long schueler;
    private Long kontaktperson;
}
