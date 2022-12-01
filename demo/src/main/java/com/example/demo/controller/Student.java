package com.example.demo.controller;

import com.example.demo.model.StudentModel;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/v1/student")
public class Student {
    private final StudentService studentService;

    @Autowired
    public Student(StudentService studentService) {
        this.studentService = studentService;
    }

    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping
    public void addUser(@RequestBody StudentModel stud) {
        studentService.addNewUser(stud);
    }
    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping(value="/all")
    public List<StudentModel> getAllUsers()
    {
        return studentService.findAll();
    }

}
