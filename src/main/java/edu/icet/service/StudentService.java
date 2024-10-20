package edu.icet.service;

import edu.icet.dto.Student;

import java.util.List;
import java.util.Optional;


public interface StudentService {
    List<Student>getStudent();

    void addStudent(Student student);
    Optional<Student> searchStudentById(Integer id);

    void deleteStudentById(Integer id);

    void updateStudent(Student student);

}
