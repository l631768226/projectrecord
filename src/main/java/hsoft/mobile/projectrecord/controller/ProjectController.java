package hsoft.mobile.projectrecord.controller;

import hsoft.mobile.projectrecord.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@CrossOrigin(origins = {"*"}, maxAge = 3600)
@RequestMapping("/project")
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @RequestMapping("/create")
    @ResponseBody
    public String processCreate(@RequestBody Map<String, String> map){
        return projectService.processCreate(map);
    }

    @RequestMapping("/update")
    @ResponseBody
    public String processUpdate(@RequestBody Map<String, String> map){
        return projectService.processUpdate(map);
    }
}
