package hsoft.mobile.projectrecord.service;

import hsoft.mobile.projectrecord.model.Validation;
import hsoft.mobile.projectrecord.utils.Common;
import hsoft.mobile.projectrecord.utils.FBase64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ProjectServiceImpl implements ProjectService {

    @Autowired
    private ValidationService validationService;

    //本地测试时为true
    private boolean localtest = Common.localtest;

    @Override
    public String processCreate(Map<String, String> map) {
        return null;
    }


    private List<Validation> processValidation(Map<String, String> map, boolean isCreate){
        List<Validation> validations = new ArrayList<Validation>();
        //项目编号
        String projIndex = "";
        //项目名
        String projName = "";
        //项目描述
        String projDescription = "";
        String realname = "";
        int authority = 0;
        try {
            projIndex = map.get("projIndex");
            projName = map.get("projName");
            projDescription = map.get("projDescription");
            realname = map.get("realname");
            String authorityStr = map.get("authority");
            if (!localtest) {
                if(!isCreate){
                    projIndex = new String(FBase64.decode(projIndex));
                }
                projName = new String(FBase64.decode(projName));
                projDescription = new String(FBase64.decode(projDescription));
                realname = new String(FBase64.decode(realname));
                authorityStr = new String(FBase64.decode(authorityStr));
            }
            authority = Integer.valueOf(authorityStr);
        } catch (Exception e) {
            e.printStackTrace();
        }
        validationService.verifyString("项目编号",projIndex,"validation", "12",
                isCreate, validations);
        validationService.verifyString("项目名", projName, "validation",
                "2", "50", true, validations);
        validationService.verifyString("项目描述", projDescription, "validation",
                "2", "255", false, validations);
        validationService.verifyString("真实姓名", realname, "chinese",
                "2", "3", true, validations);
        validationService.verifyInt("权限", authority, "number",
                1, 3, true, validations);
        return validations;
    }
}
