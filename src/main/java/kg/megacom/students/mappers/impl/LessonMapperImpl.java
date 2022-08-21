package kg.megacom.students.mappers.impl;

import kg.megacom.students.mappers.GroupMapper;
import kg.megacom.students.mappers.LessonMapper;
import kg.megacom.students.models.Lesson;
import kg.megacom.students.models.dto.LessonDto;

import java.util.ArrayList;
import java.util.List;

public class LessonMapperImpl implements LessonMapper {

    GroupMapper groupMapper;
    @Override
    public Lesson fromDto(LessonDto lessonDto) {
        Lesson lesson = new Lesson();
        lesson.setId(lessonDto.getId());
        lesson.setDay(lessonDto.getDay());
        lesson.setGroup(groupMapper.fromDto(lessonDto.getGroup()));

        return lesson;
    }

    @Override
    public LessonDto toDto(Lesson lesson) {
        LessonDto lessonDto = new LessonDto();

        lessonDto.setId(lesson.getId());
        lessonDto.setDay(lesson.getDay());
        lessonDto.setGroup(groupMapper.toDto(lesson.getGroup()));
        return lessonDto;
    }

    @Override
    public List<Lesson> fromDtos(List<LessonDto> lessonDtos) {
        List<Lesson> lessons = new ArrayList<>();

        for (LessonDto item: lessonDtos) {
            Lesson lesson = fromDto(item);
            lessons.add(lesson);

        }
        return lessons;
    }

    @Override
    public List<LessonDto> toDtos(List<Lesson> lessons) {
        List<LessonDto> lessonDtos = new ArrayList<>();

        for (Lesson item: lessons) {
            LessonDto lessonDto = toDto(item);
            lessonDtos.add(lessonDto);
        }

        return lessonDtos;
    }
}
