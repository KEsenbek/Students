package kg.megacom.students.models.dto;

import kg.megacom.students.models.Course;
import kg.megacom.students.models.Teacher;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


public class GroupDto {

    Long id;

    String name;
    Date starDate;
    Date endDate;
    CourseDto course;
    TeacherDto teacher;

}
