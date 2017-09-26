package hsoft.mobile.projectrecord.controller;

import hsoft.mobile.projectrecord.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.Iterator;

@Controller
@CrossOrigin(origins = {"*"}, maxAge = 3600)
@RequestMapping("/test")
public class TestController {

    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/1", method = RequestMethod.GET)
    @ResponseBody
    public String processTest() {
        System.out.println("测试接口");
//        if (redisService.save("1", "OK")) {
//            return redisService.find("1");
//        }
        return "error";
    }

    @RequestMapping(value = "/2", method = RequestMethod.POST)
    @ResponseBody
    public String processTestUpload(HttpServletRequest request) {
        System.out.println("测试上传文件接口");
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        String filename = request.getParameter("name");
        //检查form中是否有enctype="multipart/form-data"
        if (multipartResolver.isMultipart(request)) {
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            String path = "";
            //获取multiRequest 中所有的文件名
            Iterator<?> iter = multiRequest.getFileNames();
            while (iter.hasNext()) {
                //一次遍历所有文件
                MultipartFile file = multiRequest.getFile(iter.next().toString());
                if (file != null) {
                    String name = file.getOriginalFilename();
                    if (name != null && !"".equals(name)) {
                        String extensionName = name.split("\\.")[1];
                        path = "E:\\File\\" + filename + ".apk";
                        //上传
                        try {
                            file.transferTo(new File(path));
                        } catch (Exception e) {
                            e.printStackTrace();
                            return "error";
                        }
                    }
                }
            }
        }
        return "OK";
    }
}
