package kg.megacom.students.models;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


@Entity
@Table(name = "lesssons")
public class Lesson {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Date day;

    @ManyToOne
            @JoinColumn(name = "group_id")
    Group group;

}
