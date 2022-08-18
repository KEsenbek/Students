package kg.megacom.students.dao;

import kg.megacom.students.models.Course;
import kg.megacom.students.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
