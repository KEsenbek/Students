package kg.megacom.students.mappers.impl;

import kg.megacom.students.mappers.GroupMapper;
import kg.megacom.students.mappers.StudentGroupMapper;
import kg.megacom.students.mappers.StudentMapper;
import kg.megacom.students.models.StudentGroup;
import kg.megacom.students.models.dto.GroupDto;
import kg.megacom.students.models.dto.StudentDto;
import kg.megacom.students.models.dto.StudentGroupDto;
import kg.megacom.students.models.enums.StudentGroupStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentGroupMapperImpl implements StudentGroupMapper {

//    Long id;
//    Date startDate;
//    Date endDate;
//    StudentGroupStatus studentGroupStatus;
//    StudentDto student;
//    GroupDto group;


    StudentMapper studentMapper;
    GroupMapper groupMapper;

    @Override
    public StudentGroup fromDto(StudentGroupDto studentGroupDto) {
    StudentGroup studentGroup = new StudentGroup();
    studentGroup.setId(studentGroupDto.getId());
    studentGroup.setStartDate(studentGroupDto.getStartDate());
    studentGroup.setEndDate(studentGroupDto.getEndDate());
    studentGroup.setStudentGroupStatus(studentGroupDto.getStudentGroupStatus());
    studentGroup.setStudent(studentMapper.fromDto(studentGroupDto.getStudent()));
    studentGroup.setGroup(groupMapper.fromDto(studentGroupDto.getGroup()));

        return studentGroup;
    }

    @Override
    public StudentGroupDto toDto(StudentGroup studentGroup) {
        StudentGroupDto studentGroupDto = new StudentGroupDto();

        studentGroupDto.setId(studentGroup.getId());
        studentGroupDto.setStartDate(studentGroup.getStartDate());
        studentGroupDto.setEndDate(studentGroup.getEndDate());
        studentGroupDto.setStudentGroupStatus(studentGroup.getStudentGroupStatus());
        studentGroupDto.setStudent(studentMapper.toDto(studentGroup.getStudent()));
        studentGroupDto.setGroup(groupMapper.toDto(studentGroup.getGroup()));

        return studentGroupDto;
    }

    @Override
    public List<StudentGroup> fromDtos(List<StudentGroupDto> studentGroupDtos) {
        List<StudentGroup> studentGroups = new ArrayList<>();

        for (StudentGroupDto item: studentGroupDtos) {
            StudentGroup studentGroup = fromDto(item);
            studentGroups.add(studentGroup);
        }

        return studentGroups;
    }

    @Override
    public List<StudentGroupDto> toDtos(List<StudentGroup> studentGroups) {
        List<StudentGroupDto> studentGroupDtos = new ArrayList<>();

        for (StudentGroup item: studentGroups) {
            StudentGroupDto studentGroupDto = toDto(item);
            studentGroupDtos.add(studentGroupDto);
        }
        return studentGroupDtos;
    }
}
