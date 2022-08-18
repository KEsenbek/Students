package kg.megacom.students.models;

import kg.megacom.students.models.enums.StudentGroupStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)


@Entity
@Table(name = "student_groups")
public class StudentGroup {

    @Id
            @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    Date startDate;
    Date endDate;

    @Enumerated(value = EnumType.STRING)
    StudentGroupStatus studentGroupStatus;

    @ManyToOne
            @JoinColumn(name = "student_id")
    Student student;
    @ManyToOne
            @JoinColumn(name = "group_id")
    Group group;

}
