package kg.megacom.students.dao;

import kg.megacom.students.models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {

    int findByPeriod(int period);
}
