package com.college.collegedb.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class FacultyDTO{
    private Integer facultyId;
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private String address;
    private String city;
    private String state;
    private String department;
    private String designation;
    private Integer joiningYear;
    private BigDecimal salary;
}