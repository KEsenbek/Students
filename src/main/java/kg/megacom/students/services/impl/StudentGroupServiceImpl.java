package kg.megacom.students.services.impl;

import kg.megacom.students.dao.GroupRepo;
import kg.megacom.students.dao.StudentGroupRepo;
import kg.megacom.students.dao.StudentRepo;
import kg.megacom.students.models.Student;
import kg.megacom.students.models.StudentGroup;
import kg.megacom.students.models.enums.StudentGroupStatus;
import kg.megacom.students.services.StudentGroupService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class StudentGroupServiceImpl implements StudentGroupService {

    private  final StudentGroupRepo studentGroupRepo;

    private  final StudentRepo studentRepo;

    private  final GroupRepo groupRepo;

    public StudentGroupServiceImpl(StudentGroupRepo studentGroupRepo, StudentRepo studentRepo, GroupRepo groupRepo) {
        this.studentGroupRepo = studentGroupRepo;
        this.studentRepo = studentRepo;
        this.groupRepo = groupRepo;
    }

//    @Override
//   // public StudentGroup createStudentGroup(StudentGroup studentGroup) {
//        return studentGroupRepo.save(studentGroup);
//    }

    @Override
    public ResponseEntity<?> createStudentGroup(Date startDate, Date endDate,
                                                Long studentId, Long groupId) {
        try {
            Student student = studentRepo.findById(studentId).get();

            if (student.isDeleted()){
                return ResponseEntity.ok("Student is deleted");
            }

            StudentGroup studentGroup = new StudentGroup();
            studentGroup.setStudent(student);
            studentGroup.setGroup(groupRepo.findById(groupId).get());
            studentGroup.setStartDate(startDate);
            studentGroup.setEndDate(endDate);
            studentGroup.setStudentGroupStatus(StudentGroupStatus.STUDIES);
            return ResponseEntity.ok(studentGroupRepo.save(studentGroup));
        }catch (Exception e){
            return ResponseEntity.ok("Student doesn't exists");
        }
    }
}
