package kg.megacom.students.mappers.impl;

import kg.megacom.students.mappers.CourseMapper;
import kg.megacom.students.mappers.GroupMapper;
import kg.megacom.students.mappers.TeacherMapper;
import kg.megacom.students.models.Group;
import kg.megacom.students.models.dto.CourseDto;
import kg.megacom.students.models.dto.GroupDto;
import kg.megacom.students.models.dto.TeacherDto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GroupMapperImpl implements GroupMapper {

    CourseMapper courseMapper;
    TeacherMapper teacherMapper;

    @Override
    public Group fromDto(GroupDto groupDto) {
        Group group = new Group();
        group.setId(groupDto.getId());
        group.setName(groupDto.getName());
        group.setStarDate(groupDto.getStarDate());
        group.setEndDate(groupDto.getEndDate());
        group.setCourse(courseMapper.fromDto(groupDto.getCourse()));
        group.setTeacher(teacherMapper.fromDto(groupDto.getTeacher()));
        return group;
    }


//    Long id;
//    String name;
//    Date starDate;
//    Date endDate;
//    CourseDto course;
//    TeacherDto teacher;


    @Override
    public GroupDto toDto(Group group) {
        GroupDto groupDto = new GroupDto();

        groupDto.setId(group.getId());
        groupDto.setName(group.getName());
        groupDto.setStarDate(group.getStarDate());
        groupDto.setEndDate(group.getEndDate());
        groupDto.setCourse(courseMapper.toDto(group.getCourse()));
        groupDto.setTeacher(teacherMapper.toDto(group.getTeacher()));

        return groupDto;
    }

    @Override
    public List<Group> fromDtos(List<GroupDto> groupDtos) {
        List<Group> groups = new ArrayList<>();

        for (GroupDto item: groupDtos) {
            Group group = fromDto(item);
            groups.add(group);
        }
        return groups;
    }

    @Override
    public List<GroupDto> toDtos(List<Group> groups) {
        List<GroupDto> groupDtos = new ArrayList<>();
        for (Group item: groups){
            GroupDto groupDto = toDto(item);
            groupDtos.add(groupDto);
        }
        return groupDtos;
    }
}
