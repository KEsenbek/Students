package kg.megacom.students.mappers;

import kg.megacom.students.models.Lesson;
import kg.megacom.students.models.dto.LessonDto;

import java.util.List;

public interface LessonMapper {

    Lesson fromDto (LessonDto lessonDto);
    LessonDto toDto (Lesson lesson);

    List<Lesson> fromDtos (List<LessonDto> lessonDtos);
    List<LessonDto> toDtos (List<Lesson> lessons);
}
