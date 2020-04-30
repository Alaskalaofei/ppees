package com.csdj.pojo;


import java.util.Date;

public class XRayExamineResult {

  private Integer id;
  private Integer equipmentnumber;
  private String examineresult;
  private String examineresultdescribe;
  private Integer examinedoctorid;
  private Date examinedate;
  private String certificate;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getEquipmentnumber() {
    return equipmentnumber;
  }

  public void setEquipmentnumber(Integer equipmentnumber) {
    this.equipmentnumber = equipmentnumber;
  }

  public String getExamineresult() {
    return examineresult;
  }

  public void setExamineresult(String examineresult) {
    this.examineresult = examineresult;
  }

  public String getExamineresultdescribe() {
    return examineresultdescribe;
  }

  public void setExamineresultdescribe(String examineresultdescribe) {
    this.examineresultdescribe = examineresultdescribe;
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
}
