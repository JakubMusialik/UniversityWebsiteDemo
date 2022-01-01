package com.example.demo.service.student;

import com.example.demo.model.Student;



import java.util.List;
import java.util.Optional;


public interface StudentService {

    Student addStudent(Student student);

    List<Student> getStudents();

    Optional<Student> getStudent(long id);

    void deleteStudent(long id);

    void updateStudent(Student student);
}
