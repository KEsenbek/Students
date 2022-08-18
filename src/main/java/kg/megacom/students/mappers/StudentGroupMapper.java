package kg.megacom.students.mappers;

import kg.megacom.students.models.StudentGroup;
import kg.megacom.students.models.dto.StudentGroupDto;

import java.util.List;

public interface StudentGroupMapper {

    StudentGroup fromDto (StudentGroupDto studentGroupDto);
    StudentGroupDto toDto (StudentGroup studentGroup);

    List<StudentGroup> fromDtos (List<StudentGroupDto> studentGroupDtos);
    List<StudentGroupDto> toDtos (List<StudentGroup> studentGroups);
}
