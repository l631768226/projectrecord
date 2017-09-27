package hsoft.mobile.projectrecord.model;

import java.util.Date;

public class ProjectInfo {
    private String projindex;

    private String projname;

    private String projdescription;

    private Integer projmanager;

    private Integer deptid;

    private Float projscore;

    private Integer statuscategoryid;

    private Integer createid;

    private Date createtime;

    private Integer updateid;

    private Date updatetime;

    private Integer hide;

    private String projcomment;

    public String getProjindex() {
        return projindex;
    }

    public void setProjindex(String projindex) {
        this.projindex = projindex == null ? null : projindex.trim();
    }

    public String getProjname() {
        return projname;
    }

    public void setProjname(String projname) {
        this.projname = projname == null ? null : projname.trim();
    }

    public String getProjdescription() {
        return projdescription;
    }

    public void setProjdescription(String projdescription) {
        this.projdescription = projdescription == null ? null : projdescription.trim();
    }

    public Integer getProjmanager() {
        return projmanager;
    }

    public void setProjmanager(Integer projmanager) {
        this.projmanager = projmanager;
    }

    public Integer getDeptid() {
        return deptid;
    }

    public void setDeptid(Integer deptid) {
        this.deptid = deptid;
    }

    public Float getProjscore() {
        return projscore;
    }

    public void setProjscore(Float projscore) {
        this.projscore = projscore;
    }

    public Integer getStatuscategoryid() {
        return statuscategoryid;
    }

    public void setStatuscategoryid(Integer statuscategoryid) {
        this.statuscategoryid = statuscategoryid;
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

    public Integer getUpdateid() {
        return updateid;
    }

    public void setUpdateid(Integer updateid) {
        this.updateid = updateid;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Integer getHide() {
        return hide;
    }

    public void setHide(Integer hide) {
        this.hide = hide;
    }

    public String getProjcomment() {
        return projcomment;
    }

    public void setProjcomment(String projcomment) {
        this.projcomment = projcomment == null ? null : projcomment.trim();
    }
}