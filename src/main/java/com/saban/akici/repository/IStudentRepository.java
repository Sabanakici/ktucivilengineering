package com.saban.akici.repository;

import com.saban.akici.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStudentRepository extends JpaRepository<Student,Long> {
}
