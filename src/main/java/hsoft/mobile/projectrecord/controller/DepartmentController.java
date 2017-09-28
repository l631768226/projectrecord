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
public class DepartmentController {

    @Autowired
    private PlatformService platformService;

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public String processCreate(@RequestBody Map<String, String> map){
        System.out.println("进入创建部门信息接口");
        return platformService.processCreate(map);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String processUpdate(@RequestBody Map<String, String> map){
        System.out.println("进入修改部门信息接口");
        return platformService.processUpdate(map);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.POST)
    @ResponseBody
    public String processDelete(@RequestBody Map<String, String> map){
        System.out.println("进入删除部门信息接口");
        return platformService.processDelete(map);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public String processList(){
        System.out.println("进入获取部门信息列表接口");
        return platformService.processList();
    }
}
