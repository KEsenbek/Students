package kg.megacom.students.controllers;

import kg.megacom.students.models.Payment;
import kg.megacom.students.services.PaymentService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    private  final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

//    @PostMapping("/create")
//    public Payment createPayment (@RequestBody Payment payment) {return paymentService.createPayment(payment);}



}
