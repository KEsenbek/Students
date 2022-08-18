package kg.megacom.students.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


public class StudentDto {


    Long id;
    String name;
    String surname;
    String title;


}
