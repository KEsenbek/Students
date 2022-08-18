package kg.megacom.students.models.dto;

import kg.megacom.students.models.Group;
import kg.megacom.students.models.Student;
import kg.megacom.students.models.enums.StudentGroupStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


public class StudentGroupDto {


    Long id;

    Date startDate;
    Date endDate;

    StudentGroupStatus studentGroupStatus;
    StudentDto student;

    GroupDto group;

}
