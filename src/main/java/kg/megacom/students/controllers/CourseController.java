package kg.megacom.students.controllers;

import kg.megacom.students.models.Course;
import kg.megacom.students.services.CourseService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

private final CourseService courseService;

    public CourseController (CourseService courseService) {
        this.courseService = courseService;
    }

    @PostMapping("/create")
public Course createCourse (@RequestBody Course course) {return courseService.createCourse(course);
    }

    @PutMapping("/update")
    public Course updateCourse (@RequestParam("id") Long id, @RequestParam("title") String title) {return courseService.updateCourse(id, title);}

    @DeleteMapping("/delete")
    void deleteCourse (@RequestParam Long id) {courseService.delete(id);}
}
