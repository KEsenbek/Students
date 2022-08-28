package kg.megacom.students.services;


import kg.megacom.students.models.Student;
import kg.megacom.students.models.Teacher;

public interface TeacherService {

    Teacher createTeacher (Teacher teacher);

    Teacher updateTeacher(Long id, String title);

    void deleteTeacher(Long id);

    Teacher findById(Long id);
}
