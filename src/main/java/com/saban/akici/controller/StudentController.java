package com.saban.akici.controller;


import com.saban.akici.entity.Student;
import com.saban.akici.service.impl.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @PostMapping("/create")
    public ResponseEntity<Student> createStudent(@RequestBody Student student){
        Student resultStudent = studentService.createStudent(student);
        return ResponseEntity.ok(resultStudent);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<Student>> getStudents(){
        List<Student> students = studentService.getStudents();
        return ResponseEntity.ok(students);
    }
    @GetMapping("/getById/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable("id") Long id){
        Student student = studentService.getStudent(id);
        return ResponseEntity.ok(student);
    }
    @PutMapping("/edit/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable("id") Long id,@RequestBody Student student){
        Student resultStudent = studentService.updateStudent(id,student);
        return ResponseEntity.ok(resultStudent);
    }
    @DeleteMapping("/remove/{id}")
    public ResponseEntity<Boolean> deleteStudent(@PathVariable("id") Long id){
        Boolean status = studentService.deleteStudent(id);
        return ResponseEntity.ok(status);
    }
}
