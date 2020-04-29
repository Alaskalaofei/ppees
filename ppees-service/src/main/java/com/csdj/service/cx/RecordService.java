package com.csdj.service.cx;

import com.csdj.pojo.HealthCheckup;
import com.csdj.pojo.*;
import com.csdj.pojo.Record;
import com.csdj.pojo.SysUser;

import java.util.Date;
import java.util.List;


public interface RecordService {
    /**
     * 档案查询
     * @return
     */
   public   List<Record> getlistRecord(Integer rid, Date creationtime1,Date creationtime2,String fname, String bname, String  fcertificate, Date fbirth, String  bcertificate, Date birth, Integer curPageNo, Integer pageSize);

    public  int getLeaveCount(Integer rid,Date creationtime1,Date creationtime2,  String fname, String bname,String  fcertificate, Date fbirth, String  bcertificate,  Date birth);

    Record getid(Integer rid );

    Integer addHealthCheckup(HealthCheckup healthCheckup);

    List<SysUser> selectAllSysUser();

    List<Consent> selectAllconsent();

    List<EducationLevel>  selectAlleducation();

    List<DocumentType> selectAlldocument();
    Integer addRecord(Record record);
    Integer addGGeneral(GGeneral gGeneral);
    List<VaccineTypeb> selectAllVaccineTypeb();
    List<DiseaseType> selectDiseaseType();

    List<DiseaseType> selectDiseaseTypenv();

    List<DiseaseType> selectDiseaseTypeA();

    List<IntelligenceTypeb> selectIntelligenceTypeb();
    Integer addIntelligence(Intelligence intelligence);
    List<Record> selectF(String fname,String fphone, Integer curPageNo, Integer pageSize);

    int getCount(String fname,String fphone);
}
