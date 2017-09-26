package hsoft.mobile.projectrecord.model;

import java.util.Date;

public class Document {
    private Integer docid;

    private String projindex;

    private Integer reqid;

    private Integer issueid;

    private String docname;

    private String docdescription;

    private Integer doccategoryid;

    private String docpath;

    private String docnote;

    private String docmd5;

    private Integer createid;

    private Date createtime;

    private Integer updateid;

    private Date updatetime;

    private Integer hide;

    public Integer getDocid() {
        return docid;
    }

    public void setDocid(Integer docid) {
        this.docid = docid;
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

    public Integer getIssueid() {
        return issueid;
    }

    public void setIssueid(Integer issueid) {
        this.issueid = issueid;
    }

    public String getDocname() {
        return docname;
    }

    public void setDocname(String docname) {
        this.docname = docname == null ? null : docname.trim();
    }

    public String getDocdescription() {
        return docdescription;
    }

    public void setDocdescription(String docdescription) {
        this.docdescription = docdescription == null ? null : docdescription.trim();
    }

    public Integer getDoccategoryid() {
        return doccategoryid;
    }

    public void setDoccategoryid(Integer doccategoryid) {
        this.doccategoryid = doccategoryid;
    }

    public String getDocpath() {
        return docpath;
    }

    public void setDocpath(String docpath) {
        this.docpath = docpath == null ? null : docpath.trim();
    }

    public String getDocnote() {
        return docnote;
    }

    public void setDocnote(String docnote) {
        this.docnote = docnote == null ? null : docnote.trim();
    }

    public String getDocmd5() {
        return docmd5;
    }

    public void setDocmd5(String docmd5) {
        this.docmd5 = docmd5 == null ? null : docmd5.trim();
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