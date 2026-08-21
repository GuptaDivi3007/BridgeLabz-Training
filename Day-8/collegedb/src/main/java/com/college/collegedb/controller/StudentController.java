package com.college.collegedb.controller;

import com.college.collegedb.dto.StudentDTO;
import com.college.collegedb.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping
    public List<StudentDTO> getAllStudents(){
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public StudentDTO getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @PostMapping
    public StudentDTO createStudent(@Valid @RequestBody StudentDTO studentDTO) {
        return studentService.createStudent(studentDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable Integer id){
        studentService.deleteStudentById(id);
    }

    @PutMapping
    public StudentDTO updateStudent(@Valid @RequestBody StudentDTO studentDTO) {
        return studentService.updateStudent(studentDTO);
    }

    @GetMapping("/searchByCity")
    public List<StudentDTO> searchByCity(@RequestParam String city){
        return studentService.searchByCity(city);
    }
}