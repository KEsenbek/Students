package kg.megacom.students.services.impl;

import kg.megacom.students.dao.StudentRepo;
import kg.megacom.students.mappers.StudentMapper;
import kg.megacom.students.models.Student;
import kg.megacom.students.models.dto.StudentDto;
import kg.megacom.students.services.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private  StudentMapper studentMapper;

    private final StudentRepo studentRepo;

    public StudentServiceImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @Override
    public Student createStudent(Student student) {
        StudentDto studentDto = studentMapper.toDto(student);
        Student student1 = studentMapper.fromDto(studentDto);

        return studentRepo.save(student1);
    }
}
