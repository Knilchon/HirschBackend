package com.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Transactional
    public String saveStudentForm(Student student) {
        studentRepository.save(student);
        return "success";
    }

    @Transactional
    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }

}
