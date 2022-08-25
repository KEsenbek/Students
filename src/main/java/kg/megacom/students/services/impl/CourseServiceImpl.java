package kg.megacom.students.services.impl;

import kg.megacom.students.dao.CourseRepo;
import kg.megacom.students.models.Course;
import kg.megacom.students.services.CourseService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepo courseRepo;

    public CourseServiceImpl(CourseRepo courseRepo) {
        this.courseRepo = courseRepo;}

    @Override
    public Course createCourse(Course course) {
           Course newCourse = new Course();
            newCourse.setId(course.getId());
            newCourse.setPrice(course.getPrice());
            newCourse.setDuration(course.getDuration());
            newCourse.setTitle(course.getTitle());
            courseRepo.save(newCourse);

            return newCourse;
    }

    @Override
    public Course updateCourse(Long id, String title) {

        Optional<Course> course = courseRepo.findById(id);
        course.get().setTitle(title);
        return courseRepo.findById(id).get();
    }

    @Override
    public void delete(Long id) {

    }
}
