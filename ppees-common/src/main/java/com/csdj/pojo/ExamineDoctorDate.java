package com.csdj.pojo;


import java.util.Date;

public class ExamineDoctorDate {

  private Integer id;
  private String certificate;
  private Integer examinedoctorId;
  private Date examinedate;

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

  public Integer getExaminedoctorId() {
    return examinedoctorId;
  }

  public void setExaminedoctorId(Integer examinedoctorId) {
    this.examinedoctorId = examinedoctorId;
  }

  public Date getExaminedate() {
    return examinedate;
  }

  public void setExaminedate(Date examinedate) {
    this.examinedate = examinedate;
  }
}
