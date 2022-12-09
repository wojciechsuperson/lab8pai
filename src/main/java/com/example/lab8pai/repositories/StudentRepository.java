package com.example.lab8pai.repositories;

import com.example.lab8pai.domain.Student;
import com.example.lab8pai.dtos.StudentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository <Student, Long> {
    @Query("select new com.example.lab8pai.dtos.StudentDto(s.name, s.surname, s.age, " +
            " s.address.street, s.address.city, s.address.state, s.address.zip) from Student s")
    List<StudentDto> findAllNoAttachment();
}
