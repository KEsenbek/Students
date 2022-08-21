package kg.megacom.students.mappers.impl;

import kg.megacom.students.mappers.CourseMapper;
import kg.megacom.students.models.Course;
import kg.megacom.students.models.Student;
import kg.megacom.students.models.dto.CourseDto;
import kg.megacom.students.models.dto.StudentDto;

import java.util.ArrayList;
import java.util.List;

public class CourseMapperImpl implements CourseMapper {
    @Override
    public Course fromDto(CourseDto courseDto) {

        Course course = new Course();
        course.setId(courseDto.getId());
        course.setPrice(courseDto.getPrice());
        course.setDuration(courseDto.getDuration());
        course.setTitle(courseDto.getTitle());

        return course;
    }

    @Override
    public CourseDto toDto(Course course) {

        CourseDto courseDto = new CourseDto();
        courseDto.setId(course.getId());
        courseDto.setPrice(course.getPrice());
        courseDto.setDuration(course.getDuration());
        courseDto.setTitle(course.getTitle());

        return courseDto;
    }

    @Override
    public List<Course> fromDtos(List<CourseDto> courseDtos) {
        List<Course> courses = new ArrayList<>();

        for (CourseDto item:courseDtos) {
            Course course = fromDto(item);
            courses.add(course);
        }
        return courses;
    }

    @Override
    public List<CourseDto> toDtos(List<Course> courses) {
        List<CourseDto> courseDtos = new ArrayList<>();
        for (Course item:courses) {
            CourseDto courseDto = toDto(item);
            courseDtos.add(courseDto);
        }
        return courseDtos;
    }
}
