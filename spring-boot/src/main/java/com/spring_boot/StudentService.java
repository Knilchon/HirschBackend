package com.spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
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

    @Transactional
    public List<Student> getAllStudentsSortedByCreatedAt() { return studentRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt")); }

    @Transactional
    public List<Student> getAllStudentsFilteredByApprenticeship(String filtervalue) { return studentRepository.findByApprenticeship(filtervalue); }

}
