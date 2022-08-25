package kg.megacom.students.services.impl;

import kg.megacom.students.dao.GroupRepo;
import kg.megacom.students.models.Group;
import kg.megacom.students.services.GroupService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GroupServiceImpl implements GroupService {

    private final GroupRepo groupRepo;


    public GroupServiceImpl(GroupRepo groupRepo) {
        this.groupRepo = groupRepo;
    }

    public Group createGroup (Group group) {return groupRepo.save(group) ;

    }


}
