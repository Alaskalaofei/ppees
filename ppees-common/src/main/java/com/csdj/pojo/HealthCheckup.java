package com.csdj.pojo;


import com.alibaba.fastjson.annotation.JSONField;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class HealthCheckup {
  private Integer id;
  private Integer height;
  private Integer weight;
  private Integer heartrate;
  private Integer bodymassindex;
  private Integer systolicpressure;
  private Integer diastolicpressure;
  private String stateabnormality;
  private Integer Intelligence;
  private String Facialfeatures;
  private String Specialposture;
  private String Specialfacecondition;
  private String skinandhair;
  private String Thyroidcondition;
  private Integer examinedoctorid;

  public void setId(Integer id) {
    this.id = id;
  }

  public void setHeight(Integer height) {
    this.height = height;
  }

  public void setWeight(Integer weight) {
    this.weight = weight;
  }

  public void setHeartrate(Integer heartrate) {
    this.heartrate = heartrate;
  }

  public void setBodymassindex(Integer bodymassindex) {
    this.bodymassindex = bodymassindex;
  }

  public void setSystolicpressure(Integer systolicpressure) {
    this.systolicpressure = systolicpressure;
  }

  public void setDiastolicpressure(Integer diastolicpressure) {
    this.diastolicpressure = diastolicpressure;
  }

  public void setStateabnormality(String stateabnormality) {
    this.stateabnormality = stateabnormality;
  }

  public void setIntelligence(Integer intelligence) {
    Intelligence = intelligence;
  }

  public void setFacialfeatures(String facialfeatures) {
    Facialfeatures = facialfeatures;
  }

  public void setSpecialposture(String specialposture) {
    Specialposture = specialposture;
  }

  public void setSpecialfacecondition(String specialfacecondition) {
    Specialfacecondition = specialfacecondition;
  }

  public void setSkinandhair(String skinandhair) {
    this.skinandhair = skinandhair;
  }

  public void setThyroidcondition(String thyroidcondition) {
    Thyroidcondition = thyroidcondition;
  }

  public void setExaminedoctorid(Integer examinedoctorid) {
    this.examinedoctorid = examinedoctorid;
  }

  public void setExaminedate(Date examinedate) {
    this.examinedate = examinedate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  @JSONField(format="yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")

  private Date examinedate;
  private  String certificate;

  public Integer getId() {
    return id;
  }

  public Integer getHeight() {
    return height;
  }

  public Integer getWeight() {
    return weight;
  }

  public Integer getHeartrate() {
    return heartrate;
  }

  public Integer getBodymassindex() {
    return bodymassindex;
  }

  public Integer getSystolicpressure() {
    return systolicpressure;
  }

  public Integer getDiastolicpressure() {
    return diastolicpressure;
  }

  public String getStateabnormality() {
    return stateabnormality;
  }

  public Integer getIntelligence() {
    return Intelligence;
  }

  public String getFacialfeatures() {
    return Facialfeatures;
  }

  public String getSpecialposture() {
    return Specialposture;
  }

  public String getSpecialfacecondition() {
    return Specialfacecondition;
  }

  public String getSkinandhair() {
    return skinandhair;
  }

  public String getThyroidcondition() {
    return Thyroidcondition;
  }

  public Integer getExaminedoctorid() {
    return examinedoctorid;
  }

  public Date getExaminedate() {
    return examinedate;
  }

  public String getCertificate() {
    return certificate;
  }
}
