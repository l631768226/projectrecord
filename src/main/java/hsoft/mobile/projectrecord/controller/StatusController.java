package hsoft.mobile.projectrecord.controller;

import hsoft.mobile.projectrecord.model.CheckResult;
import hsoft.mobile.projectrecord.model.User;
import hsoft.mobile.projectrecord.service.StatusService;
import hsoft.mobile.projectrecord.service.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/status")
@CrossOrigin(origins = {"*"}, maxAge = 3600)
public class StatusController {

    @Autowired
    private StatusService statusService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public String processCreate(Map<String, String> map){
        return statusService.processCreate(map);
    }

}
