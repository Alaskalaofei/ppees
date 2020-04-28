package com.csdj.pojo;


public class FollowUpVisit {

  private Integer id;
  private Integer rid;
  private String assessmentcontent;
  /**
   * 档案信息
   */
  private Record record;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getRid() {
    return rid;
  }

  public void setRid(Integer rid) {
    this.rid = rid;
  }

  public String getAssessmentcontent() {
    return assessmentcontent;
  }

  public void setAssessmentcontent(String assessmentcontent) {
    this.assessmentcontent = assessmentcontent;
  }

  public Record getRecord() {
    return record;
  }

  public void setRecord(Record record) {
    this.record = record;
  }
}
