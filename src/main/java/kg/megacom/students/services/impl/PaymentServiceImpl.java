package kg.megacom.students.services.impl;

import kg.megacom.students.dao.PaymentRepo;
import kg.megacom.students.models.Payment;
import kg.megacom.students.services.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private  final PaymentRepo paymentRepo;

    public PaymentServiceImpl(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepo.save(payment);
    }
}
