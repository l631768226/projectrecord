package hsoft.mobile.projectrecord.model;

import java.util.Date;

public class Skill {
    private Integer skillid;

    private Integer userid;

    private Integer platformid;

    private Integer createid;

    private Date createtime;

    public Integer getSkillid() {
        return skillid;
    }

    public void setSkillid(Integer skillid) {
        this.skillid = skillid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPlatformid() {
        return platformid;
    }

    public void setPlatformid(Integer platformid) {
        this.platformid = platformid;
    }

    public Integer getCreateid() {
        return createid;
    }

    public void setCreateid(Integer createid) {
        this.createid = createid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}