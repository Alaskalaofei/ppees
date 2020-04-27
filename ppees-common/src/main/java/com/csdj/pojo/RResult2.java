package com.csdj.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RResult2 {

  private Integer rid;
  private Integer certificate;
  private Integer whetherabnormal;
  private String abnormalcondition;
  private String premaritalhealth_examination;
  private String resultsof_consultationand_guidance;
  private String medicalhistory;
  private Integer examinesuggest;
  private String examinesuggestproject;
  private Integer examineattitude;
  private String referralhospital;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date referraldate;
  private Date subsequentvisitdate;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date premaritalexaminationcertificatedate;
  private Integer eid;

  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }

  public Integer getCertificate() {
    return certificate;
  }

  public void setCertificate(Integer certificate) {
    this.certificate = certificate;
  }

  public Integer getWhetherabnormal() {
    return whetherabnormal;
  }

  public void setWhetherabnormal(Integer whetherabnormal) {
    this.whetherabnormal = whetherabnormal;
  }

  public String getAbnormalcondition() {
    return abnormalcondition;
  }

  public void setAbnormalcondition(String abnormalcondition) {
    this.abnormalcondition = abnormalcondition;
  }

  public String getPremaritalhealth_examination() {
    return premaritalhealth_examination;
  }

  public void setPremaritalhealth_examination(String premaritalhealth_examination) {
    this.premaritalhealth_examination = premaritalhealth_examination;
  }

  public String getResultsof_consultationand_guidance() {
    return resultsof_consultationand_guidance;
  }

  public void setResultsof_consultationand_guidance(String resultsof_consultationand_guidance) {
    this.resultsof_consultationand_guidance = resultsof_consultationand_guidance;
  }

  public String getMedicalhistory() {
    return medicalhistory;
  }

  public void setMedicalhistory(String medicalhistory) {
    this.medicalhistory = medicalhistory;
  }

  public Integer getExaminesuggest() {
    return examinesuggest;
  }

  public void setExaminesuggest(Integer examinesuggest) {
    this.examinesuggest = examinesuggest;
  }

  public String getExaminesuggestproject() {
    return examinesuggestproject;
  }

  public void setExaminesuggestproject(String examinesuggestproject) {
    this.examinesuggestproject = examinesuggestproject;
  }

  public Integer getExamineattitude() {
    return examineattitude;
  }

  public void setExamineattitude(Integer examineattitude) {
    this.examineattitude = examineattitude;
  }

  public String getReferralhospital() {
    return referralhospital;
  }

  public void setReferralhospital(String referralhospital) {
    this.referralhospital = referralhospital;
  }

  public Date getReferraldate() {
    return referraldate;
  }

  public void setReferraldate(Date referraldate) {
    this.referraldate = referraldate;
  }

  public Date getSubsequentvisitdate() {
    return subsequentvisitdate;
  }

  public void setSubsequentvisitdate(Date subsequentvisitdate) {
    this.subsequentvisitdate = subsequentvisitdate;
  }

  public Date getPremaritalexaminationcertificatedate() {
    return premaritalexaminationcertificatedate;
  }

  public void setPremaritalexaminationcertificatedate(Date premaritalexaminationcertificatedate) {
    this.premaritalexaminationcertificatedate = premaritalexaminationcertificatedate;
  }

  public Integer getEid() {
    return eid;
  }

  public void setEid(Integer eid) {
    this.eid = eid;
  }
}
