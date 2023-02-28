package com.saban.akici.service.impl;

import com.saban.akici.entity.Student;
import com.saban.akici.repository.IStudentRepository;
import com.saban.akici.service.IStudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService implements IStudentService {

    private final IStudentRepository studentsRepository;

    public StudentService(IStudentRepository studentsRepository){
        this.studentsRepository = studentsRepository;
    }

    @Override
    public Student createStudent(Student student) {
        student.setFirstName(student.getFirstName());
        student.setLastName(student.getLastName());
        student.setLessons(student.getLessons());
        return studentsRepository.save(student);
    }

    @Override
    public List<Student> getStudents() {
        return studentsRepository.findAll();
    }

    @Override
    public Student getStudent(Long id) {
        Optional<Student> student = studentsRepository.findById(id);
        if (student.isPresent()) {
            return student.get();
        }
        return null;
    }

    @Override
    public Student updateStudent(Long id, Student student) {
        Optional<Student> resultStudent = studentsRepository.findById(id);
        if (resultStudent.isPresent()) {
            resultStudent.get().setFirstName(student.getFirstName());
            resultStudent.get().setLastName(student.getLastName());
            return studentsRepository.save(resultStudent.get());
        }
        return null;
    }
    @Override
    public Boolean deleteStudent(Long id) {
        Optional<Student> student = studentsRepository.findById(id);
        if (student.isPresent()) {
            studentsRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
