package kg.megacom.students.models.dto;

import kg.megacom.students.models.enums.StudentGroupStatus;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@AllArgsConstructor
@NoArgsConstructor

public class StudentGroupDto {


    Long id;
    Date startDate;
    Date endDate;
    StudentGroupStatus studentGroupStatus;
    StudentDto student;
    GroupDto group;

}
