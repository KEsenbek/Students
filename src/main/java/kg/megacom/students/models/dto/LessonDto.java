package kg.megacom.students.models.dto;

import kg.megacom.students.models.Group;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)



public class LessonDto {


    Long id;
    Date day;
    GroupDto group;

}
