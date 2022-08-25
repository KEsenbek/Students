package kg.megacom.students.services;


import org.springframework.http.ResponseEntity;

import java.util.Date;

public interface StudentGroupService {

 //StudentGroup createStudentGroup (StudentGroup studentGroup);

 ResponseEntity<?> createStudentGroup (Date startDate, Date endDate, Long studentId, Long groupId);

}
