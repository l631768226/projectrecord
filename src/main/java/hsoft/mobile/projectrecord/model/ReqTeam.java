package hsoft.mobile.projectrecord.model;

import java.util.Date;

public class ReqTeam {
    private Integer reqteamid;

    private String projindex;

    private Integer reqid;

    private Integer schedid;

    private Integer member;

    private String task;

    private Integer createid;

    private Date createtime;

    private Integer updateid;

    private Date updatetime;

    private Integer hide;

    public Integer getReqteamid() {
        return reqteamid;
    }

    public void setReqteamid(Integer reqteamid) {
        this.reqteamid = reqteamid;
    }

    public String getProjindex() {
        return projindex;
    }

    public void setProjindex(String projindex) {
        this.projindex = projindex == null ? null : projindex.trim();
    }

    public Integer getReqid() {
        return reqid;
    }

    public void setReqid(Integer reqid) {
        this.reqid = reqid;
    }

    public Integer getSchedid() {
        return schedid;
    }

    public void setSchedid(Integer schedid) {
        this.schedid = schedid;
    }

    public Integer getMember() {
        return member;
    }

    public void setMember(Integer member) {
        this.member = member;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task == null ? null : task.trim();
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
}