package hsoft.mobile.projectrecord.model;

import java.util.Date;

public class ReqInfo {
    private Integer reqid;

    private String projindex;

    private String reqname;

    private Integer statuscategoryid;

    private String statusnote;

    private String reqnote;

    private String reqproposer;

    private Float reqscore;

    private String reqcomment;

    private String reqkeyword;

    private Integer createid;

    private Date createtime;

    private Integer updateid;

    private Date updatetime;

    private Integer hide;

    private String reqdescription;

    public Integer getReqid() {
        return reqid;
    }

    public void setReqid(Integer reqid) {
        this.reqid = reqid;
    }

    public String getProjindex() {
        return projindex;
    }

    public void setProjindex(String projindex) {
        this.projindex = projindex == null ? null : projindex.trim();
    }

    public String getReqname() {
        return reqname;
    }

    public void setReqname(String reqname) {
        this.reqname = reqname == null ? null : reqname.trim();
    }

    public Integer getStatuscategoryid() {
        return statuscategoryid;
    }

    public void setStatuscategoryid(Integer statuscategoryid) {
        this.statuscategoryid = statuscategoryid;
    }

    public String getStatusnote() {
        return statusnote;
    }

    public void setStatusnote(String statusnote) {
        this.statusnote = statusnote == null ? null : statusnote.trim();
    }

    public String getReqnote() {
        return reqnote;
    }

    public void setReqnote(String reqnote) {
        this.reqnote = reqnote == null ? null : reqnote.trim();
    }

    public String getReqproposer() {
        return reqproposer;
    }

    public void setReqproposer(String reqproposer) {
        this.reqproposer = reqproposer == null ? null : reqproposer.trim();
    }

    public Float getReqscore() {
        return reqscore;
    }

    public void setReqscore(Float reqscore) {
        this.reqscore = reqscore;
    }

    public String getReqcomment() {
        return reqcomment;
    }

    public void setReqcomment(String reqcomment) {
        this.reqcomment = reqcomment == null ? null : reqcomment.trim();
    }

    public String getReqkeyword() {
        return reqkeyword;
    }

    public void setReqkeyword(String reqkeyword) {
        this.reqkeyword = reqkeyword == null ? null : reqkeyword.trim();
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

    public String getReqdescription() {
        return reqdescription;
    }

    public void setReqdescription(String reqdescription) {
        this.reqdescription = reqdescription == null ? null : reqdescription.trim();
    }
}