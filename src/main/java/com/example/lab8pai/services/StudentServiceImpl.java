package com.example.lab8pai.services;

import com.example.lab8pai.converters.StudentConverter;
import com.example.lab8pai.converters.StudentMapper;
import com.example.lab8pai.dtos.StudentDto;
import com.example.lab8pai.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
    private final StudentRepository studentRepository;
    private final StudentConverter studentConverter;
    private final StudentMapper studentMapper;
    @Override
    public List<StudentDto> getAllStudents() {
        return studentRepository.findAll().stream()
                .map(studentMapper::mapStudentToDtoStudent)
                .collect(Collectors.toList());
    }

    @Override
    public List<StudentDto> getAllStudentsNoAttachment() {
        return studentRepository.findAllNoAttachment();
    }
}
