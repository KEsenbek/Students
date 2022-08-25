package kg.megacom.students.services.impl;

import kg.megacom.students.dao.LessonRepo;
import kg.megacom.students.models.Lesson;
import kg.megacom.students.services.LessonService;
import org.springframework.stereotype.Service;

@Service
public class LessonServiceImpl implements LessonService {

    private  final LessonRepo lessonRepo;

    public LessonServiceImpl(LessonRepo lessonRepo) {
        this.lessonRepo = lessonRepo;
    }

    @Override
    public Lesson createLesson(Lesson lesson) {
        return lessonRepo.save(lesson);
    }
}
