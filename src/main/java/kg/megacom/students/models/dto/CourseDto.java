package kg.megacom.students.models.dto;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

@AllArgsConstructor
@NoArgsConstructor

public class CourseDto {

    Long id;
    String title;
    double price;
    int duration;


}
