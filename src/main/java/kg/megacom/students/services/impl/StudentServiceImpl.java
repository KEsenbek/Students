package kg.megacom.students.services.impl;

import kg.megacom.students.dao.StudentRepo;
import kg.megacom.students.mappers.StudentMapper;
import kg.megacom.students.models.Student;
import kg.megacom.students.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    private  StudentMapper studentMapper;

    private final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Student createStudent(Student student) {
        Student newStudent = new Student();
        newStudent.setId(student.getId());
        newStudent.setName(student.getName());
        newStudent.setSurname(student.getSurname());
        newStudent.setTitle(student.getTitle());
        studentRepo.save(newStudent);

        return newStudent;
    }

    @Override
    public Student updateStudent(Long id, String title) {
        Optional<Student> student = studentRepo.findById(id);
        student.get().setTitle(title);
//        studentRepo.update(id, title);

        return studentRepo.findById(id).get();
    }

    @Override
    public Student deleteStudent(Long id) {
    //    studentRepo.delete(studentRepo.findById(id).get());

        Student student = studentRepo.findById(id).get();
        student.setDeleted(true);
        studentRepo.save(student);
        return studentRepo.findById(id).get();
    }

    @Override
    public List<Student> findAllNoDeleted() {
        return studentRepo.findByIsDeletedIsFalse();
    }
}
