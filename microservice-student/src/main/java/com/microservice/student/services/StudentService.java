package com.microservice.student.services;

import java.util.List;

import com.microservice.student.entities.Student;

public interface StudentService {

    List<Student> findAll();

    Student findById(Long id);

    void save(Student student);

    List<Student> findByIdCourse(Long idCourse);
}
