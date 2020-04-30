package com.csdj.pojo;


public class RResult {

  private Integer rid;
  private String rentryname;
  private String result;
  private Integer examinedoctorid;
  private String certificate;
  private  SysUser user;

  public SysUser getUser() {
    return user;
  }

  public void setUser(SysUser user) {
    this.user = user;
  }

  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }

  public String getRentryname() {
    return rentryname;
  }

  public void setRentryname(String rentryname) {
    this.rentryname = rentryname;
  }

  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  public Integer getExaminedoctorid() {
    return examinedoctorid;
  }

  public void setExaminedoctorid(Integer examinedoctorid) {
    this.examinedoctorid = examinedoctorid;
  }

  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }
}
