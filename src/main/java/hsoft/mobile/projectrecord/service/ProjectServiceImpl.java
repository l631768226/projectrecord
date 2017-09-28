package hsoft.mobile.projectrecord.service;

import hsoft.mobile.projectrecord.model.CheckResult;
import hsoft.mobile.projectrecord.model.ProjectInfo;
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


    /**
     *
     * @param projectInfo
     * @param checkResult
     * @param isCreate
     */
    private void processValidation(ProjectInfo projectInfo, CheckResult checkResult , boolean isCreate){
        List<Validation> validations = new ArrayList<Validation>();
        validationService.verifyString("项目编号",projectInfo.getProjindex(),"validation",
                "12","12", isCreate, validations);
        validationService.verifyString("项目名", projectInfo.getProjname(), "validation",
                "2", "50", false, validations);
        validationService.verifyString("项目描述", projectInfo.getProjdescription(), "validation",
                "2", "255", false, validations);

        validationService.verifyString("对协作部门的评价", projectInfo.getProjcomment(), "validation",
                "1", "255", true, validations);

        if (!validations.isEmpty()) {
            checkResult.setCheckCode(-1);
            checkResult.setCheckMsg(validations.get(0).getField() + validations.get(0).getError());
        }
    }
}
