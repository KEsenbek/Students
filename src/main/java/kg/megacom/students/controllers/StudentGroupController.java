package kg.megacom.students.controllers;

import kg.megacom.students.models.StudentGroup;
import kg.megacom.students.services.StudentGroupService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("/studentGroup")
public class StudentGroupController {

    private  final StudentGroupService studentGroupService;

    public StudentGroupController(StudentGroupService studentGroupService) {
        this.studentGroupService = studentGroupService;
    }

    @PostMapping("/create")
  //  public StudentGroup createStudentGroup(@RequestBody StudentGroup studentGroup) {return studentGroupService.createStudentGroup(studentGroup);}
    public ResponseEntity createStudentGroup(@RequestParam@DateTimeFormat(pattern = "yyyy-MM-dd")Date startDate,
                                             @RequestParam@DateTimeFormat(pattern = "yyyy-MM-dd")Date endDate,
                                             @RequestParam Long studentId, @RequestParam Long groupId){
        return studentGroupService.createStudentGroup (startDate,endDate,studentId,groupId);
    }

}

