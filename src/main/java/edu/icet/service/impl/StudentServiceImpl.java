package edu.icet.service.impl;

import edu.icet.dto.Student;
import edu.icet.repository.StudentRepository;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    final StudentRepository repository;
    @Override
    public List<Student> getStudent() {
        return repository.findAll();
    }
    @Override
    public void addStudent(Student student) {
        repository.save(student);
    }

    @Override
    public Optional<Student> searchStudentById(Integer id) {
         return repository.findById(id);
    }

    @Override
    public void deleteStudentById(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public void updateStudent(Student student) {
        repository.save(student);
    }
}
