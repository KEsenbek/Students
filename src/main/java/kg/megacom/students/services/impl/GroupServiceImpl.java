package kg.megacom.students.services.impl;

import kg.megacom.students.dao.GroupRepo;
import kg.megacom.students.dao.LessonRepo;
import kg.megacom.students.models.Course;
import kg.megacom.students.models.Group;
import kg.megacom.students.models.Lesson;
import kg.megacom.students.models.enums.Day;
import kg.megacom.students.models.requests.GroupRequest;
import kg.megacom.students.services.CourseService;
import kg.megacom.students.services.GroupService;
import kg.megacom.students.services.TeacherService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupServiceImpl implements GroupService {

    private final GroupRepo groupRepo;
    private  final LessonRepo lessonRepo;
    private  final CourseService courseService;
    private  final TeacherService teacherService;


    public GroupServiceImpl(GroupRepo groupRepo, LessonRepo lessonRepo, CourseService courseService, TeacherService teacherService) {
        this.groupRepo = groupRepo;
        this.lessonRepo = lessonRepo;
        this.courseService = courseService;
        this.teacherService = teacherService;
    }

   public Group createGroup (Group group) {return groupRepo.save(group);}

   private List<Date> getLessonsDate(List<Day> days, int duration, Date startDate){
    List<Date> dates = new ArrayList<>();
    Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);

        //days=[MONDAY, WEDNESDAY,FRIDAY]
        //[2,4,6]
        //[]

       for (int i = 0; i < duration;) {
           long count =days.stream()
                   .map(x->x.getDayValue())
                   .filter(x->x == calendar.get(Calendar.DAY_OF_WEEK))
                   .count();

                if(count == 1 ){
                    i++;
                    dates.add(calendar.getTime());
                }
                calendar.add(Calendar.DAY_OF_MONTH,1);
       }

        return dates;
   }

    @Override
    public Group create(GroupRequest groupRequest) {
        //GroupRequest(groupTitle=Java 18:00, courseId=1,
        // startDate=Thu Sep 01 06:00:00 ALMT 2022,
        // days=[MONDAY, WEDNESDAY, FRIDAY])

        // Найти курс по ID
        // duration не должен быть пустой или меньше или равно 0
        // Получить список дат уроков
        // insert into groups
        // insert into lessons

        Course course =courseService.findById(groupRequest.getCourseId());
        System.out.println(course);

        if (course.getDuration() <=0)
            throw new RuntimeException("Длительность не может быть меньше или равна нулю!");

        List<Date> lessonDates = getLessonsDate(groupRequest.getDays(), course.getDuration(),groupRequest.getStartDate());
//        Date maxDate = lessonDates
//                .stream()
//                .max(Date::compareTo)
//                .get();

        Date maxDate = lessonDates.get(lessonDates.size() - 1);
        Date minDate = lessonDates.get(0);


        Group group = new Group();
        group.setCourse(course);
        group.setStartDate(minDate);
        group.setEndDate(maxDate);
        group.setName(groupRequest.getGroupTitle());
        group.setTeacher(teacherService.findById(groupRequest.getTeacherId()));

        group = groupRepo.save(group);

        Group finalGroup = group;
        List<Lesson>lessons = lessonDates
                .stream()
                .map(x->{
                    Lesson lesson = new Lesson();
                      lesson.setDay(x);
                      lesson.setGroup(finalGroup);
                    return lesson;
                }).collect(Collectors.toList());

        lessonRepo.saveAll(lessons);

        return group;
    }

    @Override
    public Group findById(Long id) {
        return groupRepo.findById(id).orElseThrow(()->new RuntimeException("Группа не найдена!"));
    }

    @Override
    public List<Group> findAll(Group group) {
        return groupRepo.findAll();
    }



}
