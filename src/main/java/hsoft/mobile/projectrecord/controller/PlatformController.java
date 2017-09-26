package hsoft.mobile.projectrecord.controller;

import hsoft.mobile.projectrecord.service.PlatformService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * 平台信息模块
 * create by LY on 2017/9/25
 */
@Controller
@RequestMapping("/platform")
@CrossOrigin(origins = {"*"}, maxAge = 3600)
public class PlatformController {

    @Autowired
    private PlatformService platformService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public String processCreate(@RequestBody Map<String, String> map){
        return platformService.processCreate(map);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String processUpdate(@RequestBody Map<String, String> map){
        return platformService.processUpdate(map);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public String processDelete(@RequestBody Map<String, String> map){
        return platformService.processUpdate(map);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public String processList(){
        return platformService.processList();
    }
}
