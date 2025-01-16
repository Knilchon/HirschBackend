package com.spring_boot;

import com.spring_boot.schueler.Schueler;
import com.spring_boot.schueler.SchuelerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student-form")
public class StudentFormController {

    private final StudentFormService studentFormService;
    private final SchuelerService schuelerService;

    @Autowired
    public StudentFormController(StudentFormService studentFormService) {
        this.studentFormService = studentFormService;
        schuelerService = studentFormService.getSchuelerService();
    }

    @GetMapping("/")
    public String getRootResponse() {
        return "";
    }

    @GetMapping("/schueler")
    public Schueler getSchueler(String vorname, String familienname, String geburtsdatum, String email) {
        Schueler schueler = new Schueler();
        schueler.setVorname(vorname);
        schueler.setFamilienname(familienname);
        schueler.setGeburtsdatum(geburtsdatum);
        schueler.setEmail(email);
        return schuelerService.getOrCreateSchueler(schueler);
    }

    @GetMapping("/schuelerbyid")
    public Schueler getSchuelerByID(String id) {
        return schuelerService.getSchuelerByID(id);
    }

    @GetMapping("/all")
    public List<Schueler> getAllSchueler() {
        return schuelerService.getAllSchueler();
    }

    @PostMapping("/submit")
    public String postStudentForm(@RequestBody StudentForm studentForm) {
        return studentFormService.saveStudentForm(studentForm);
    }

}
