package com.csdj.pojo;


import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class GGeneral {

  private Integer id;
  private Integer anydisease;
  private Integer birthdefects;
  private Integer isdisease;
  private Integer atpresent;
  private Integer vaccinationornot;
  private Integer examinedoctorid;
  @JSONField(format = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date inspectiontime;
  private String certificate;

  private String username;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getAnydisease() {
    return anydisease;
  }

  public void setAnydisease(Integer anydisease) {
    this.anydisease = anydisease;
  }

  public Integer getBirthdefects() {
    return birthdefects;
  }

  public void setBirthdefects(Integer birthdefects) {
    this.birthdefects = birthdefects;
  }

  public Integer getIsdisease() {
    return isdisease;
  }

  public void setIsdisease(Integer isdisease) {
    this.isdisease = isdisease;
  }

  public Integer getAtpresent() {
    return atpresent;
  }

  public void setAtpresent(Integer atpresent) {
    this.atpresent = atpresent;
  }

  public Integer getVaccinationornot() {
    return vaccinationornot;
  }

  public void setVaccinationornot(Integer vaccinationornot) {
    this.vaccinationornot = vaccinationornot;
  }

  public Integer getExaminedoctorid() {
    return examinedoctorid;
  }

  public void setExaminedoctorid(Integer examinedoctorid) {
    this.examinedoctorid = examinedoctorid;
  }

  public Date getInspectiontime() {
    return inspectiontime;
  }

  public void setInspectiontime(Date inspectiontime) {
    this.inspectiontime = inspectiontime;
  }

  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }
}
