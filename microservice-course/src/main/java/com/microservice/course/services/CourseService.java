package com.microservice.course.services;

import java.util.List;

import com.microservice.course.entities.Course;
import com.microservice.course.http.response.StudentByCourseResponse;

public interface CourseService {
    List<Course> findAll();

    Course findById(Long id);

    void save(Course course);

    StudentByCourseResponse findStudentByIdCourse(Long idCourse);
}
