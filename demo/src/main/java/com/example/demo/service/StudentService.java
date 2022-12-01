package com.example.demo.service;

import com.example.demo.model.StudentModel;
import com.example.demo.repository.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addNewUser(StudentModel stud) {
            studentRepo.save(stud);
    }

    public List<StudentModel> findAll() {
            return   studentRepo.findAll();
    }

}

