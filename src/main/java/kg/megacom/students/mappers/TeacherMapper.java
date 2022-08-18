package kg.megacom.students.mappers;

import kg.megacom.students.models.Student;
import kg.megacom.students.models.Teacher;
import kg.megacom.students.models.dto.StudentDto;
import kg.megacom.students.models.dto.TeacherDto;

import java.util.List;

public interface TeacherMapper {

    Teacher fromDto (TeacherDto teacherDto);
    TeacherDto toDto (Teacher teacher);

    List<Teacher> fromDtos (List<TeacherDto> teacherDtos);
    List<TeacherDto> toDtos (List<Teacher> teachers);
}
