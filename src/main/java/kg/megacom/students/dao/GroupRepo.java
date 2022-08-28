package kg.megacom.students.dao;

import kg.megacom.students.models.Course;
import kg.megacom.students.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;

@Repository
public interface GroupRepo extends JpaRepository<Group,Long> {

    Date findByStartDate(Date startDate);

    Date findByEndDate(Date endDate);
}
