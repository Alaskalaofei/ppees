package com.csdj.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UltrasonicImage {

  private Integer id;
  private String image;
  private Integer result;
  private String resultdescribe;
  private Integer sid;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date inspectiontime;
  private Integer rid;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public String getResultdescribe() {
    return resultdescribe;
  }

  public void setResultdescribe(String resultdescribe) {
    this.resultdescribe = resultdescribe;
  }

  public Integer getSid() {
    return sid;
  }

  public void setSid(Integer sid) {
    this.sid = sid;
  }

  public Date getInspectiontime() {
    return inspectiontime;
  }

  public void setInspectiontime(Date inspectiontime) {
    this.inspectiontime = inspectiontime;
  }

  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }
}


