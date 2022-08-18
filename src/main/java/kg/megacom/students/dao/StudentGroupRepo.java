package kg.megacom.students.dao;

import kg.megacom.students.models.Student;
import kg.megacom.students.models.StudentGroup;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentGroupRepo extends JpaRepository<StudentGroup,Long> {
}
