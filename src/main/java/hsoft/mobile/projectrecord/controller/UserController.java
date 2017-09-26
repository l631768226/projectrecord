package hsoft.mobile.projectrecord.controller;

import hsoft.mobile.projectrecord.service.TokenService;
import hsoft.mobile.projectrecord.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Map;

/**
 * 用户信息模块
 * create by LY on 2017/9/25
 */
@Controller
@RequestMapping("/user")
@CrossOrigin(origins = {"*"}, maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private TokenService tokenService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public String processLogin(@RequestBody Map<String, String> map, HttpServletRequest request, HttpServletResponse response){
        return tokenService.processLogin(map,request, response);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public String processCreate(@RequestBody Map<String, String> map){
        return userService.processCreate(map);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    @ResponseBody
    public String processUpdate(@RequestBody Map<String, String> map){
        return userService.processUpdate(map);
    }

    @RequestMapping(value = "/list", method = RequestMethod.POST)
    @ResponseBody
    public String processList() {
        return userService.processList();
    }

}
