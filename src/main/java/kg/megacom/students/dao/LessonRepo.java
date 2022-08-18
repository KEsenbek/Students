package kg.megacom.students.dao;

import kg.megacom.students.models.Course;
import kg.megacom.students.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LessonRepo extends JpaRepository<Lesson,Long> {
}
