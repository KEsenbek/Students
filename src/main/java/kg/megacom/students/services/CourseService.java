package kg.megacom.students.services;


import kg.megacom.students.models.Course;

public interface CourseService {

    Course createCourse (Course course);

    Course updateCourse (Long id,String title);

    void delete (Long id);


}
