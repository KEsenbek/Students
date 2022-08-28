package kg.megacom.students.services.impl;

import kg.megacom.students.dao.StudentGroupRepo;
import kg.megacom.students.models.Group;
import kg.megacom.students.models.Payment;
import kg.megacom.students.models.Student;
import kg.megacom.students.models.StudentGroup;
import kg.megacom.students.models.enums.StudentGroupStatus;
import kg.megacom.students.services.GroupService;
import kg.megacom.students.services.PaymentService;
import kg.megacom.students.services.StudentGroupService;
import kg.megacom.students.services.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class StudentGroupServiceImpl implements StudentGroupService {

   // private  final StudentGroupRepo studentGroupRepo;

    private final StudentService studentService;

    private  final StudentGroupRepo studentGroupRepo;

    private  final GroupService groupService;

    private  final PaymentService paymentService;

    public StudentGroupServiceImpl(StudentService studentService, StudentGroupRepo studentGroupRepo, GroupService groupService, PaymentService paymentService) {
        this.studentService = studentService;
        this.studentGroupRepo = studentGroupRepo;
        this.groupService = groupService;
        this.paymentService = paymentService;
    }





//    @Override
//   // public StudentGroup createStudentGroup(StudentGroup studentGroup) {
//        return studentGroupRepo.save(studentGroup);
//    }

    @Override
    public ResponseEntity<?> createStudentGroup(Date startDate, Date endDate,
                                                Long studentId, Long groupId) {
//        try {
//            Student student = studentRepo.findById(studentId).get();
//
//            if (student.isDeleted()){
//                return ResponseEntity.ok("Student is deleted");
//            }
//
//            StudentGroup studentGroup = new StudentGroup();
//            studentGroup.setStudent(student);
//            studentGroup.setGroup(groupRepo.findById(groupId).get());
//            studentGroup.setStartDate(startDate);
//            studentGroup.setEndDate(endDate);
//            studentGroup.setStudentGroupStatus(StudentGroupStatus.STUDIES);
//            return ResponseEntity.ok(studentGroupRepo.save(studentGroup));
//        }catch (Exception e){
//            return ResponseEntity.ok("Student doesn't exists");
//        }

        return null;
    }

    @Override
    public StudentGroup append(Long studentId, Long groupId) {
        Student student = studentService.findById(studentId);
        Group group = groupService.findById(groupId);

        if (group.getEndDate().compareTo(new Date()) <=0)
            throw new RuntimeException("Группа уже завершила обучение!");

        StudentGroup studentGroup = studentGroupRepo.findByStudentAndAndGroup(student,group);

        if (studentGroup == null) {
            //студент новый .Надо создать
            studentGroup = new StudentGroup();
            studentGroup.setStudentGroupStatus(StudentGroupStatus.STUDIES);
            studentGroup.setStartDate(new Date());
            studentGroup.setGroup(group);
            studentGroup.setStudent(student);

            studentGroup = studentGroupRepo.save(studentGroup);
            List<Payment> payments = paymentService.setPayment(student,group);

            System.out.println(payments);

        }else {
            if (studentGroup.getStudentGroupStatus().equals(StudentGroupStatus.STUDIES))
                throw new RuntimeException("Студент уже в группе");
            else{
                studentGroup.setStudentGroupStatus(StudentGroupStatus.STUDIES);
            studentGroupRepo.save(studentGroup);
            }
        }


        return studentGroup;
    }
}
