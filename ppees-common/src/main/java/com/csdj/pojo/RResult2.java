package com.csdj.pojo;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RResult2 {

  private Integer rid;
  private String certificate;
  private Integer whetherabnormal;
  private String abnormalcondition;
  private String premaritalhealthexamination;
  private String resultsofconsultationandguidance;
  private String medicalhistory;
  private Integer examinesuggest;
  private String examinesuggestproject;
  private Integer examineattitude;
  private String referralhospital;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date referraldate;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date subsequentvisitdate;
  @JsonFormat(pattern = "yyyy-MM-dd")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date premaritalexaminationcertificatedate;
  private Integer examinedoctorid;
  private  Date registrationtime;

  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }


  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
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

  public String getPremaritalhealthexamination() {
    return premaritalhealthexamination;
  }

  public void setPremaritalhealthexamination(String premaritalhealthexamination) {
    this.premaritalhealthexamination = premaritalhealthexamination;
  }

  public String getResultsofconsultationandguidance() {
    return resultsofconsultationandguidance;
  }

  public void setResultsofconsultationandguidance(String resultsofconsultationandguidance) {
    this.resultsofconsultationandguidance = resultsofconsultationandguidance;
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

  public Integer getExaminedoctorid() {
    return examinedoctorid;
  }

  public void setExaminedoctorid(Integer examinedoctorid) {
    this.examinedoctorid = examinedoctorid;
  }

  public Date getRegistrationtime() {
    return registrationtime;
  }

  public void setRegistrationtime(Date registrationtime) {
    this.registrationtime = registrationtime;
  }
}
