package com.example.lab8pai.services;

import com.example.lab8pai.dtos.StudentDto;

import java.util.List;

public interface StudentService {
    List<StudentDto> getAllStudents();
    List<StudentDto> getAllStudentsNoAttachment();
}
