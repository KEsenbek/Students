package kg.megacom.students.mappers.impl;

import kg.megacom.students.mappers.StudentMapper;
import kg.megacom.students.models.Student;
import kg.megacom.students.models.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class StudentMapperImpl implements StudentMapper {
    @Override
    public Student fromDto(StudentDto studentDto) {

        Student student = new Student();
        student.setId(studentDto.getId());
        student.setName(studentDto.getName());
        student.setSurname(studentDto.getSurname());
        student.setTitle(studentDto.getTitle());

        return student;
    }

    @Override
    public StudentDto toDto(Student student) {
        StudentDto studentDto = new StudentDto();
        studentDto.setId(student.getId());
        studentDto.setName(student.getName());
        studentDto.setSurname(student.getSurname());
        studentDto.setTitle(student.getTitle());
        return studentDto;
    }

    @Override
    public List<Student> fromDtos(List<StudentDto> studentDtos) {

        List<Student> students = new ArrayList<>();

        for (StudentDto item:studentDtos) {
            Student student = fromDto(item);
            students.add(student);
        }
        return students;
    }

    @Override
    public List<StudentDto> toDtos(List<Student> students) {
        List<StudentDto> studentDtos = new ArrayList<>();
        for (Student item:students) {
            StudentDto studentDto = toDto(item);
            studentDtos.add(studentDto);
        }
        return studentDtos;
    }
}
