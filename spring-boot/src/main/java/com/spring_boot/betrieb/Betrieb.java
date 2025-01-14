package com.spring_boot.betrieb;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Betrieb {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long betriebID;

    private String name;
    private String fax;
    private String email;

}
