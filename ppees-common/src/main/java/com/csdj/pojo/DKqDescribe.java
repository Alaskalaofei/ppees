package com.csdj.pojo;


import java.util.Date;

public class DKqDescribe {

  private Integer id;
  private Integer dnumber;
  private Integer dnormal;
  private String describe;
  private Integer examinedoctorid;
  private Date examinedate;
  private String certificate;
  private  String examineresult;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getDnumber() {
    return dnumber;
  }

  public void setDnumber(Integer dnumber) {
    this.dnumber = dnumber;
  }

  public Integer getDnormal() {
    return dnormal;
  }

  public void setDnormal(Integer dnormal) {
    this.dnormal = dnormal;
  }

  public String getDescribe() {
    return describe;
  }

  public void setDescribe(String describe) {
    this.describe = describe;
  }

  public Integer getExaminedoctorid() {
    return examinedoctorid;
  }

  public void setExaminedoctorid(Integer examinedoctorid) {
    this.examinedoctorid = examinedoctorid;
  }

  public Date getExaminedate() {
    return examinedate;
  }

  public void setExaminedate(Date examinedate) {
    this.examinedate = examinedate;
  }

  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public String getExamineresult() {
    return examineresult;
  }

  public void setExamineresult(String examineresult) {
    this.examineresult = examineresult;
  }
}
