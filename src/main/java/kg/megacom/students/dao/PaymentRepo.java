package kg.megacom.students.dao;

import kg.megacom.students.models.Course;
import kg.megacom.students.models.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<Payment,Long> {
}
