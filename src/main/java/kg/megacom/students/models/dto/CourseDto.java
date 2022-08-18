package kg.megacom.students.models.dto;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)



public class CourseDto {

    Long id;
    String title;
    double price;
    String duration;


}
