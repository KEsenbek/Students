package kg.megacom.students.mappers;

import kg.megacom.students.models.Payment;
import kg.megacom.students.models.dto.PaymentDto;

import java.util.List;

public interface PaymentMapper {

    Payment fromDto (PaymentDto paymentDto);
    PaymentDto toDto (Payment payment);

    List<Payment> fromDtos (List<PaymentDto> paymentDtos);
    List<PaymentDto> toDtos (List<Payment> payments);
}

