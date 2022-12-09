package com.example.lab8pai.dtos;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDto {
    private String name;
    private String surname;
    private Integer age;
    private String street;
    private String city;
    private String state;
    private String zip;
}
