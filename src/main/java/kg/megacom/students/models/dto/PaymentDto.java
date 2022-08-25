package kg.megacom.students.models.dto;

import kg.megacom.students.models.enums.PaymentStatus;
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
public class PaymentDto {

    Long id;
    Date paymentDate;
    PaymentStatus paymentStatus;
    GroupDto group;
    StudentDto student;
}
