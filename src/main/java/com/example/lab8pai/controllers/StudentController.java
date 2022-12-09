package com.example.lab8pai.controllers;

import com.example.lab8pai.domain.Student;
import com.example.lab8pai.dtos.StudentDto;
import com.example.lab8pai.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/students")
public class StudentController {
    StudentService studentService;
    // TODO 8.3
    @GetMapping
    public List<StudentDto> getAllStudents() {
        return studentService.getAllStudents();
    }
}
