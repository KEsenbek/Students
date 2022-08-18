package kg.megacom.students.models.dto;

import kg.megacom.students.models.Group;
import kg.megacom.students.models.Student;
import kg.megacom.students.models.enums.PaymentStatus;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE)

public class PaymentDto {

    Long id;
    Date paymentDate;

    PaymentStatus paymentStatus;

    GroupDto group;

    StudentDto student;
}
