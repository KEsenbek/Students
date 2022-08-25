
package kg.megacom.students.controllers;

import kg.megacom.students.models.Course;
import kg.megacom.students.models.Group;
import kg.megacom.students.services.GroupService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/group")
public class GroupController {

    private final GroupService groupService;


    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @PostMapping("/create")
    public Group createCourse(@RequestBody Group group) {
        return groupService.createGroup(group);

    }
}