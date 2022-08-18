package kg.megacom.students.dao;

import kg.megacom.students.models.Course;
import kg.megacom.students.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepo extends JpaRepository<Group,Long> {
}
