package com.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String getRootResponse() {
        return "";
    }

    @PostMapping("/submit")
    public String postStudentForm(@RequestBody Student student) {
        return studentService.saveStudentForm(student);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Optional<Student> studentForm = studentService.getStudentById(id);
        return studentForm.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/get-all")
    public List<Student> getAllStudents() { return studentService.getAllStudentsSortedByCreatedAt(); }

    @GetMapping("/filter-by-apprenticeship/{filtervalue}")
    public List<Student> getAllFilteredByApprenticeship(@PathVariable String filtervalue) { return studentService.getAllStudentsFilteredByApprenticeship(filtervalue); }

}
