package kg.megacom.students.dao;

import kg.megacom.students.models.Student;
import kg.megacom.students.models.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepo extends JpaRepository<Teacher,Long> {
}
