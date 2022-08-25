package kg.megacom.students.services.impl;

import kg.megacom.students.dao.TeacherRepo;
import kg.megacom.students.models.Teacher;
import kg.megacom.students.services.TeacherService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeacherServiceImpl implements TeacherService {

private final TeacherRepo teacherRepo;

    public TeacherServiceImpl(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    @Override
    public Teacher createTeacher (Teacher teacher) {
        Teacher newTeacher = new Teacher();
        newTeacher.setId(teacher.getId());
        newTeacher.setName(teacher.getName());
        newTeacher.setSurname(teacher.getSurname());
        newTeacher.setTitle(teacher.getTitle());
        teacherRepo.save(newTeacher);

        return newTeacher;
    }

    @Override
    public Teacher updateTeacher(Long id, String title) {
        Optional<Teacher> teacher = teacherRepo.findById(id);
        teacher.get().setTitle(title);


        return teacherRepo.findById(id).get();
    }

    @Override
    public void deleteTeacher(Long id) {

    }
}
