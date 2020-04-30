package com.csdj.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RegularProject {

  private Integer id;
  private String certificate;
  private String beforediseasename;
  private String nowdiseasename;
  private Integer morbiditynumber;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date lastmorbiditydate;
  private Integer whethermedicine;
  private Integer whetheroperation;
  private String operationname;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date operationdate;
  private Integer whethermarried;
  private Integer boynumber;
  private Integer girlnumber;
  private Integer whetherHereditarydisease;
  private Integer examinedoctorid;
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

  public String getBeforediseasename() {
    return beforediseasename;
  }

  public void setBeforediseasename(String beforediseasename) {
    this.beforediseasename = beforediseasename;
  }

  public String getNowdiseasename() {
    return nowdiseasename;
  }

  public void setNowdiseasename(String nowdiseasename) {
    this.nowdiseasename = nowdiseasename;
  }

  public Integer getMorbiditynumber() {
    return morbiditynumber;
  }

  public void setMorbiditynumber(Integer morbiditynumber) {
    this.morbiditynumber = morbiditynumber;
  }

  public Date getLastmorbiditydate() {
    return lastmorbiditydate;
  }

  public void setLastmorbiditydate(Date lastmorbiditydate) {
    this.lastmorbiditydate = lastmorbiditydate;
  }

  public Integer getWhethermedicine() {
    return whethermedicine;
  }

  public void setWhethermedicine(Integer whethermedicine) {
    this.whethermedicine = whethermedicine;
  }

  public Integer getWhetheroperation() {
    return whetheroperation;
  }

  public void setWhetheroperation(Integer whetheroperation) {
    this.whetheroperation = whetheroperation;
  }

  public String getOperationname() {
    return operationname;
  }

  public void setOperationname(String operationname) {
    this.operationname = operationname;
  }

  public Date getOperationdate() {
    return operationdate;
  }

  public void setOperationdate(Date operationdate) {
    this.operationdate = operationdate;
  }

  public Integer getWhethermarried() {
    return whethermarried;
  }

  public void setWhethermarried(Integer whethermarried) {
    this.whethermarried = whethermarried;
  }

  public Integer getBoynumber() {
    return boynumber;
  }

  public void setBoynumber(Integer boynumber) {
    this.boynumber = boynumber;
  }

  public Integer getGirlnumber() {
    return girlnumber;
  }

  public void setGirlnumber(Integer girlnumber) {
    this.girlnumber = girlnumber;
  }

  public Integer getWhetherHereditarydisease() {
    return whetherHereditarydisease;
  }

  public void setWhetherHereditarydisease(Integer whetherHereditarydisease) {
    this.whetherHereditarydisease = whetherHereditarydisease;
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
}
