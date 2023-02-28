package com.saban.akici.service;

import com.saban.akici.entity.Student;

import java.util.List;

public interface IStudentService {

    Student createStudent(Student student);
    List<Student> getStudents();
    Student getStudent(Long id);
    Student updateStudent(Long id,Student student);
    Boolean deleteStudent(Long id);
}
