package com.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student-form")
public class StudentFormController {

    private final StudentFormService studentFormService;

    @Autowired
    public StudentFormController(StudentFormService studentFormService) {
        this.studentFormService = studentFormService;
    }

    @GetMapping("/")
    public String getRootResponse() {
        return "";
    }

    @PostMapping("/submit")
    public String postStudentForm(@RequestBody StudentForm studentForm) {
        return studentFormService.saveStudentForm(studentForm);
    }

}
