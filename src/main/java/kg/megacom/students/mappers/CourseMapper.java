package kg.megacom.students.mappers;

import kg.megacom.students.models.Course;
import kg.megacom.students.models.dto.CourseDto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseMapper {

    Course fromDto (CourseDto courseDto);
    CourseDto toDto (Course course);

    List<Course> fromDtos (List<CourseDto> courseDtos);
    List<CourseDto> toDtos (List<Course> courses);
}
