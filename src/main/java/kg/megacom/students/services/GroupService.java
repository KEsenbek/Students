package kg.megacom.students.services;


import kg.megacom.students.models.Group;
import kg.megacom.students.models.requests.GroupRequest;

import java.util.Date;
import java.util.List;

public interface GroupService {

    Group createGroup (Group group);


    Group create(GroupRequest groupRequest);

    Group findById(Long id);

    List<Group> findAll(Group group);


}
