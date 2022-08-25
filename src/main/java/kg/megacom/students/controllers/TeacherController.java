package kg.megacom.students.controllers;

import kg.megacom.students.models.Teacher;
import kg.megacom.students.services.TeacherService;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping("/create")
        public Teacher createTeacher(@RequestBody Teacher teacher){
            return teacherService.createTeacher(teacher);
        }

    @PutMapping("/update")
        public Teacher updateTeaacher(@RequestParam("id") Long id, @RequestParam("title") String title) {return  teacherService.updateTeacher(id, title);}

    @DeleteMapping("/delete")
        public void deleteTeacher (@RequestParam Long id) {teacherService.deleteTeacher(id);}
    }
