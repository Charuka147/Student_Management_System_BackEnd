package edu.icet.controller;

import edu.icet.dto.Student;
import edu.icet.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequiredArgsConstructor
@RequestMapping("/student")
public class StudentController {
    final StudentService service;
    @GetMapping("/get-student")
    public List<Student> getStudent(){
        return service.getStudent();
    }
    @PostMapping("/add-student")
    public void addStudent(@RequestPart("student") Student student,@RequestPart("image") MultipartFile file) throws IOException {
        student.setImage(file.getBytes());
        service.addStudent(student);
    }
    @GetMapping("/searchById/{id}")
    public Optional<Student> searchById(@PathVariable Integer id){
        return service.searchStudentById(id);
    }
    @DeleteMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Integer id){
        service.deleteStudentById(id);
    }
    @PatchMapping("/updateStudent")
    public void updateStudent(@RequestPart("student") Student student, @RequestPart("image") MultipartFile file) throws IOException {
        student.setImage(file.getBytes());
        service.updateStudent(student);

    }
}
