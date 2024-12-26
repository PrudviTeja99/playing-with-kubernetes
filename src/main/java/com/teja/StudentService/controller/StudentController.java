package com.teja.StudentService.controller;

import com.teja.StudentService.entity.Student;
import com.teja.StudentService.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;
    @GetMapping("/students")
    public List<Student> getStudent(){
        return studentRepository.findAll();
    }

    @PostMapping("/student")
    public Student saveStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }
}
