package kg.megacom.students.mappers.impl;

import kg.megacom.students.mappers.GroupMapper;
import kg.megacom.students.mappers.PaymentMapper;
import kg.megacom.students.mappers.StudentMapper;
import kg.megacom.students.models.Payment;
import kg.megacom.students.models.dto.GroupDto;
import kg.megacom.students.models.dto.PaymentDto;
import kg.megacom.students.models.dto.StudentDto;
import kg.megacom.students.models.enums.PaymentStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentMapperImpl implements PaymentMapper {

    GroupMapper groupMapper;
    StudentMapper studentMapper;

//    Long id;
//    Date paymentDate;
//    PaymentStatus paymentStatus;
//    GroupDto group;
//    StudentDto student;

    @Override
    public Payment fromDto(PaymentDto paymentDto) {
        Payment payment = new Payment();
        payment.setId(paymentDto.getId());
        payment.setPaymentDate(paymentDto.getPaymentDate());
        payment.setPaymentStatus(paymentDto.getPaymentStatus());
        payment.setGroup(groupMapper.fromDto(paymentDto.getGroup()));
        payment.setStudent(studentMapper.fromDto(paymentDto.getStudent()));

        return payment;
    }

    @Override
    public PaymentDto toDto(Payment payment) {
        PaymentDto paymentDto = new PaymentDto();
        paymentDto.setId(payment.getId());
        paymentDto.setPaymentDate(payment.getPaymentDate());
        paymentDto.setPaymentStatus(payment.getPaymentStatus());
        paymentDto.setGroup(groupMapper.toDto(payment.getGroup()));
        paymentDto.setStudent(studentMapper.toDto(payment.getStudent()));

        return paymentDto;
    }

    @Override
    public List<Payment> fromDtos(List<PaymentDto> paymentDtos) {

        List<Payment> payments = new ArrayList<>();
        for (PaymentDto item: paymentDtos) {
            Payment payment = fromDto(item);
            payments.add(payment);
        }
        return payments;
    }

    @Override
    public List<PaymentDto> toDtos(List<Payment> payments) {
        List<PaymentDto> paymentDtos = new ArrayList<>();

        for (Payment item: payments) {
            PaymentDto paymentDto = toDto(item);
            paymentDtos.add(paymentDto);
        }
        return paymentDtos;
    }
}
