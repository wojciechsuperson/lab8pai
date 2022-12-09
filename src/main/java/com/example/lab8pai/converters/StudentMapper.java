package com.example.lab8pai.converters;

import com.example.lab8pai.domain.Student;
import com.example.lab8pai.dtos.StudentDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface StudentMapper {
    @Mapping(target = "street", source = "student.address.street")
    @Mapping(target = "city", source = "student.address.city")
    @Mapping(target = "state", source = "student.address.state")
    @Mapping(target = "zip", source = "student.address.zip")
    StudentDto mapStudentToDtoStudent(Student student);
}
