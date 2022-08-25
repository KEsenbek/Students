package kg.megacom.students.services;

import kg.megacom.students.models.Student;

import java.util.List;

public interface StudentService {


    Student createStudent (Student student);

    Student updateStudent(Long id,String title);

    Student deleteStudent(Long id);

    List<Student> findAllNoDeleted();
}
