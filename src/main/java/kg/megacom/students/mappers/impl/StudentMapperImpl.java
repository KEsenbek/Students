package kg.megacom.students.mappers.impl;

import kg.megacom.students.mappers.StudentMapper;
import kg.megacom.students.models.Student;
import kg.megacom.students.models.dto.StudentDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
@RequiredArgsConstructor
public class StudentMapperImpl implements StudentMapper {

    @Override
    public Student fromDto(StudentDto studentDto) {
        return null;
    }

    @Override
    public StudentDto toDto(Student student) {
        return null;
    }

    @Override
    public List<Student> fromDtos(List<StudentDto> studentDtos) {
        return null;
    }

    @Override
    public List<StudentDto> toDtos(List<Student> students) {
        return null;
    }
}