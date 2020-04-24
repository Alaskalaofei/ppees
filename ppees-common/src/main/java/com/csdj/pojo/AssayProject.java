package com.csdj.pojo;


public class AssayProject {

  private Integer id;
  private String certificate;
  private String sex;
  private String projectname;
  private Integer unit;
  private Integer referencerange;
  private Integer eid;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public String getSex() {
    return sex;
  }

  public void setSex(String sex) {
    this.sex = sex;
  }

  public String getProjectname() {
    return projectname;
  }

  public void setProjectname(String projectname) {
    this.projectname = projectname;
  }

  public Integer getUnit() {
    return unit;
  }

  public void setUnit(Integer unit) {
    this.unit = unit;
  }

  public Integer getReferencerange() {
    return referencerange;
  }

  public void setReferencerange(Integer referencerange) {
    this.referencerange = referencerange;
  }

  public Integer getEid() {
    return eid;
  }

  public void setEid(Integer eid) {
    this.eid = eid;
  }
}
