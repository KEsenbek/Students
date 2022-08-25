package kg.megacom.students.controllers;

import kg.megacom.students.models.Student;
import kg.megacom.students.services.StudentService;
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
    public Student createStudent(@RequestBody Student student){
     return studentService.createStudent(student);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestParam Long id,@RequestParam String title) {return  studentService.updateStudent(id, title);}

    @DeleteMapping("/delete")
    public void deleteStudent(@RequestParam Long id) {studentService.deleteStudent(id);}

    @GetMapping("/findAll")
    public List<Student> findAll(){return studentService.findAllNoDeleted();}
}
