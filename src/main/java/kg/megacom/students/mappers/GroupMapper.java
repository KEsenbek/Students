package kg.megacom.students.mappers;

import kg.megacom.students.models.Group;
import kg.megacom.students.models.dto.GroupDto;

import java.util.List;

public interface GroupMapper {

    Group fromDto (GroupDto groupDto);
    GroupDto toDto (Group group);

    List<Group> fromDtos (List<GroupDto> groupDtos);
    List<GroupDto> toDtos (List<Group> groups);
}
