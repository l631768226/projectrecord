package hsoft.mobile.projectrecord.model;

import java.util.Date;

public class ReqSchedule {
    private Integer schedid;

    private String projindex;

    private Integer reqid;

    private Integer platformid;

    private Integer reqprinciple;

    private Date deadline;

    private String deadlinenote;

    private Date starttime;

    private String starttimenote;

    private Date completetime;

    private String completetimenote;

    private Date onlinetime;

    private String onlinetimenote;

    private Integer createid;

    private Date createtime;

    private Integer updateid;

    private Date updatetime;

    private Integer hide;

    public Integer getSchedid() {
        return schedid;
    }

    public void setSchedid(Integer schedid) {
        this.schedid = schedid;
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

    public Integer getPlatformid() {
        return platformid;
    }

    public void setPlatformid(Integer platformid) {
        this.platformid = platformid;
    }

    public Integer getReqprinciple() {
        return reqprinciple;
    }

    public void setReqprinciple(Integer reqprinciple) {
        this.reqprinciple = reqprinciple;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public String getDeadlinenote() {
        return deadlinenote;
    }

    public void setDeadlinenote(String deadlinenote) {
        this.deadlinenote = deadlinenote == null ? null : deadlinenote.trim();
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public String getStarttimenote() {
        return starttimenote;
    }

    public void setStarttimenote(String starttimenote) {
        this.starttimenote = starttimenote == null ? null : starttimenote.trim();
    }

    public Date getCompletetime() {
        return completetime;
    }

    public void setCompletetime(Date completetime) {
        this.completetime = completetime;
    }

    public String getCompletetimenote() {
        return completetimenote;
    }

    public void setCompletetimenote(String completetimenote) {
        this.completetimenote = completetimenote == null ? null : completetimenote.trim();
    }

    public Date getOnlinetime() {
        return onlinetime;
    }

    public void setOnlinetime(Date onlinetime) {
        this.onlinetime = onlinetime;
    }

    public String getOnlinetimenote() {
        return onlinetimenote;
    }

    public void setOnlinetimenote(String onlinetimenote) {
        this.onlinetimenote = onlinetimenote == null ? null : onlinetimenote.trim();
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