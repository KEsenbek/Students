package kg.megacom.students.dao;

import kg.megacom.students.models.Course;
import kg.megacom.students.models.Group;
import kg.megacom.students.models.Lesson;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LessonRepo extends JpaRepository<Lesson,Long> {
    List<Lesson> findAllByGroupOrderById(Group group);
}
