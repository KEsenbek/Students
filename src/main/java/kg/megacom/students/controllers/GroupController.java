
package kg.megacom.students.controllers;

import kg.megacom.students.models.Course;
import kg.megacom.students.models.Group;
import kg.megacom.students.models.requests.GroupRequest;
import kg.megacom.students.services.GroupService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group")
public class GroupController {

    private final GroupService groupService;


    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

//    @PostMapping("/create")
//    public Group createCourse(@RequestBody Group group) {
//        return groupService.createGroup(group);}

    @PostMapping("/create")
    public Group create(@RequestBody GroupRequest groupRequest) {return groupService.create(groupRequest);}

    @GetMapping("/get")
    public List<Group> findAll(Group group){return groupService.findAll(group);}
}